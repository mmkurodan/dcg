#!/usr/bin/env bash
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "$0")" && pwd)"
DEST_DIR="$REPO_ROOT/app/src/main/assets/java-rt"
TAG="${1:-android-14.0.0_r2}"
ART_PATH_ROOT="https://android.googlesource.com/platform/prebuilts/module_sdk/art/+/refs/tags/${TAG}/1/java"

mkdir -p "$DEST_DIR"

fetch_url() {
  local url="$1"
  if command -v curl >/dev/null 2>&1; then
    curl -fsSL "$url"
    return
  fi
  if command -v wget >/dev/null 2>&1; then
    wget -qO- "$url"
    return
  fi
  echo "Neither curl nor wget is available." >&2
  return 127
}

download_aosp_jar() {
  local name="$1"
  local url="${ART_PATH_ROOT}/${name}?format=TEXT"
  local tmp="$DEST_DIR/${name}.tmp"
  fetch_url "$url" | base64 -d > "$tmp"
  mv "$tmp" "$DEST_DIR/$name"
}

download_mirror_jar() {
  local name="$1"
  local url="$2"
  local tmp="$DEST_DIR/${name}.tmp"
  fetch_url "$url" > "$tmp"
  mv "$tmp" "$DEST_DIR/$name"
}

if ! download_aosp_jar core-oj.jar; then
  echo "AOSP fetch failed for core-oj.jar; trying compatible mirror..." >&2
  download_mirror_jar core-oj.jar "https://repo1.maven.org/maven2/com/rover12421/android/hide/libcore/14.0.0_r2/libcore-14.0.0_r2.jar"
fi

if ! download_aosp_jar core-libart.jar; then
  echo "AOSP fetch failed for core-libart.jar; trying compatible mirror..." >&2
  download_mirror_jar core-libart.jar "https://repo1.maven.org/maven2/com/rover12421/android/hide/libart/14.0.0_r2/libart-14.0.0_r2.jar"
fi

echo "Installed runtime jars to: $DEST_DIR"
sha256sum "$DEST_DIR/core-oj.jar" "$DEST_DIR/core-libart.jar"
