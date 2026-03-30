// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class Os {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Os(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.Os wrap(android.system.Os real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.Os(real, (__DcgwBridgeToken) null);
    }

    public android.system.Os getReal() {
        return (android.system.Os) real;
    }

    public android.system.Os unwrap() {
        return getReal();
    }

    public static java.io.FileDescriptor accept(java.io.FileDescriptor arg0, java.net.InetSocketAddress arg1) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#accept(java.io.FileDescriptor,java.net.InetSocketAddress)");
    }

    public static boolean access(java.lang.String arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#access(java.lang.String,int)");
    }

    public static void bind(java.io.FileDescriptor arg0, java.net.SocketAddress arg1) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#bind(java.io.FileDescriptor,java.net.SocketAddress)");
    }

    public static void bind(java.io.FileDescriptor arg0, java.net.InetAddress arg1, int arg2) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#bind(java.io.FileDescriptor,java.net.InetAddress,int)");
    }

    public static void chmod(java.lang.String arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#chmod(java.lang.String,int)");
    }

    public static void chown(java.lang.String arg0, int arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#chown(java.lang.String,int,int)");
    }

    public static void close(java.io.FileDescriptor arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#close(java.io.FileDescriptor)");
    }

    public static void connect(java.io.FileDescriptor arg0, java.net.SocketAddress arg1) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#connect(java.io.FileDescriptor,java.net.SocketAddress)");
    }

    public static void connect(java.io.FileDescriptor arg0, java.net.InetAddress arg1, int arg2) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#connect(java.io.FileDescriptor,java.net.InetAddress,int)");
    }

    public static java.io.FileDescriptor dup(java.io.FileDescriptor arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#dup(java.io.FileDescriptor)");
    }

    public static java.io.FileDescriptor dup2(java.io.FileDescriptor arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#dup2(java.io.FileDescriptor,int)");
    }

    public static java.lang.String[] environ() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#environ()");
    }

    public static void execv(java.lang.String arg0, java.lang.String[] arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#execv(java.lang.String,[Ljava.lang.String;)");
    }

    public static void execve(java.lang.String arg0, java.lang.String[] arg1, java.lang.String[] arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#execve(java.lang.String,[Ljava.lang.String;,[Ljava.lang.String;)");
    }

    public static void fchmod(java.io.FileDescriptor arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#fchmod(java.io.FileDescriptor,int)");
    }

    public static void fchown(java.io.FileDescriptor arg0, int arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#fchown(java.io.FileDescriptor,int,int)");
    }

    public static int fcntlInt(java.io.FileDescriptor arg0, int arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#fcntlInt(java.io.FileDescriptor,int,int)");
    }

    public static void fdatasync(java.io.FileDescriptor arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#fdatasync(java.io.FileDescriptor)");
    }

    public static com.micklab.dcg.wrapper.android.system.StructStat fstat(java.io.FileDescriptor arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#fstat(java.io.FileDescriptor)");
    }

    public static com.micklab.dcg.wrapper.android.system.StructStatVfs fstatvfs(java.io.FileDescriptor arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#fstatvfs(java.io.FileDescriptor)");
    }

    public static void fsync(java.io.FileDescriptor arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#fsync(java.io.FileDescriptor)");
    }

    public static void ftruncate(java.io.FileDescriptor arg0, long arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#ftruncate(java.io.FileDescriptor,long)");
    }

    public static java.lang.String gai_strerror(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#gai_strerror(int)");
    }

    public static int getegid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getegid()");
    }

    public static java.lang.String getenv(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getenv(java.lang.String)");
    }

    public static int geteuid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#geteuid()");
    }

    public static int getgid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getgid()");
    }

    public static java.net.SocketAddress getpeername(java.io.FileDescriptor arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getpeername(java.io.FileDescriptor)");
    }

    public static int getpid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getpid()");
    }

    public static int getppid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getppid()");
    }

    public static java.net.SocketAddress getsockname(java.io.FileDescriptor arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getsockname(java.io.FileDescriptor)");
    }

    public static com.micklab.dcg.wrapper.android.system.StructTimeval getsockoptTimeval(java.io.FileDescriptor arg0, int arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getsockoptTimeval(java.io.FileDescriptor,int,int)");
    }

    public static int gettid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#gettid()");
    }

    public static int getuid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getuid()");
    }

    public static byte[] getxattr(java.lang.String arg0, java.lang.String arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#getxattr(java.lang.String,java.lang.String)");
    }

    public static java.lang.String if_indextoname(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#if_indextoname(int)");
    }

    public static int if_nametoindex(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#if_nametoindex(java.lang.String)");
    }

    public static java.net.InetAddress inet_pton(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#inet_pton(int,java.lang.String)");
    }

    public static boolean isatty(java.io.FileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#isatty(java.io.FileDescriptor)");
    }

    public static void kill(int arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#kill(int,int)");
    }

    public static void lchown(java.lang.String arg0, int arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#lchown(java.lang.String,int,int)");
    }

    public static void link(java.lang.String arg0, java.lang.String arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#link(java.lang.String,java.lang.String)");
    }

    public static void listen(java.io.FileDescriptor arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#listen(java.io.FileDescriptor,int)");
    }

    public static java.lang.String[] listxattr(java.lang.String arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#listxattr(java.lang.String)");
    }

    public static long lseek(java.io.FileDescriptor arg0, long arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#lseek(java.io.FileDescriptor,long,int)");
    }

    public static com.micklab.dcg.wrapper.android.system.StructStat lstat(java.lang.String arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#lstat(java.lang.String)");
    }

    public static java.io.FileDescriptor memfd_create(java.lang.String arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#memfd_create(java.lang.String,int)");
    }

    public static void mincore(long arg0, long arg1, byte[] arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#mincore(long,long,[B)");
    }

    public static void mkdir(java.lang.String arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#mkdir(java.lang.String,int)");
    }

    public static void mkfifo(java.lang.String arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#mkfifo(java.lang.String,int)");
    }

    public static void mlock(long arg0, long arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#mlock(long,long)");
    }

    public static long mmap(long arg0, long arg1, int arg2, int arg3, java.io.FileDescriptor arg4, long arg5) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#mmap(long,long,int,int,java.io.FileDescriptor,long)");
    }

    public static void msync(long arg0, long arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#msync(long,long,int)");
    }

    public static void munlock(long arg0, long arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#munlock(long,long)");
    }

    public static void munmap(long arg0, long arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#munmap(long,long)");
    }

    public static java.io.FileDescriptor open(java.lang.String arg0, int arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#open(java.lang.String,int,int)");
    }

    public static java.io.FileDescriptor[] pipe() throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#pipe()");
    }

    public static int poll(android.system.StructPollfd[] arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#poll([Landroid.system.StructPollfd;,int)");
    }

    public static void posix_fallocate(java.io.FileDescriptor arg0, long arg1, long arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#posix_fallocate(java.io.FileDescriptor,long,long)");
    }

    public static int prctl(int arg0, long arg1, long arg2, long arg3, long arg4) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#prctl(int,long,long,long,long)");
    }

    public static int pread(java.io.FileDescriptor arg0, java.nio.ByteBuffer arg1, long arg2) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#pread(java.io.FileDescriptor,java.nio.ByteBuffer,long)");
    }

    public static int pread(java.io.FileDescriptor arg0, byte[] arg1, int arg2, int arg3, long arg4) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#pread(java.io.FileDescriptor,[B,int,int,long)");
    }

    public static int pwrite(java.io.FileDescriptor arg0, java.nio.ByteBuffer arg1, long arg2) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#pwrite(java.io.FileDescriptor,java.nio.ByteBuffer,long)");
    }

    public static int pwrite(java.io.FileDescriptor arg0, byte[] arg1, int arg2, int arg3, long arg4) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#pwrite(java.io.FileDescriptor,[B,int,int,long)");
    }

    public static int read(java.io.FileDescriptor arg0, java.nio.ByteBuffer arg1) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#read(java.io.FileDescriptor,java.nio.ByteBuffer)");
    }

    public static int read(java.io.FileDescriptor arg0, byte[] arg1, int arg2, int arg3) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#read(java.io.FileDescriptor,[B,int,int)");
    }

    public static java.lang.String readlink(java.lang.String arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#readlink(java.lang.String)");
    }

    public static int readv(java.io.FileDescriptor arg0, java.lang.Object[] arg1, int[] arg2, int[] arg3) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#readv(java.io.FileDescriptor,[Ljava.lang.Object;,[I,[I)");
    }

    public static int recvfrom(java.io.FileDescriptor arg0, java.nio.ByteBuffer arg1, int arg2, java.net.InetSocketAddress arg3) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#recvfrom(java.io.FileDescriptor,java.nio.ByteBuffer,int,java.net.InetSocketAddress)");
    }

    public static int recvfrom(java.io.FileDescriptor arg0, byte[] arg1, int arg2, int arg3, int arg4, java.net.InetSocketAddress arg5) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#recvfrom(java.io.FileDescriptor,[B,int,int,int,java.net.InetSocketAddress)");
    }

    public static int recvmsg(java.io.FileDescriptor arg0, com.micklab.dcg.wrapper.android.system.StructMsghdr arg1, int arg2) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#recvmsg(java.io.FileDescriptor,android.system.StructMsghdr,int)");
    }

    public static void remove(java.lang.String arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#remove(java.lang.String)");
    }

    public static void removexattr(java.lang.String arg0, java.lang.String arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#removexattr(java.lang.String,java.lang.String)");
    }

    public static void rename(java.lang.String arg0, java.lang.String arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#rename(java.lang.String,java.lang.String)");
    }

    public static long sendfile(java.io.FileDescriptor arg0, java.io.FileDescriptor arg1, com.micklab.dcg.wrapper.android.system.Int64Ref arg2, long arg3) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#sendfile(java.io.FileDescriptor,java.io.FileDescriptor,android.system.Int64Ref,long)");
    }

    public static int sendmsg(java.io.FileDescriptor arg0, com.micklab.dcg.wrapper.android.system.StructMsghdr arg1, int arg2) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#sendmsg(java.io.FileDescriptor,android.system.StructMsghdr,int)");
    }

    public static int sendto(java.io.FileDescriptor arg0, java.nio.ByteBuffer arg1, int arg2, java.net.InetAddress arg3, int arg4) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#sendto(java.io.FileDescriptor,java.nio.ByteBuffer,int,java.net.InetAddress,int)");
    }

    public static int sendto(java.io.FileDescriptor arg0, byte[] arg1, int arg2, int arg3, int arg4, java.net.SocketAddress arg5) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#sendto(java.io.FileDescriptor,[B,int,int,int,java.net.SocketAddress)");
    }

    public static int sendto(java.io.FileDescriptor arg0, byte[] arg1, int arg2, int arg3, int arg4, java.net.InetAddress arg5, int arg6) throws android.system.ErrnoException, java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#sendto(java.io.FileDescriptor,[B,int,int,int,java.net.InetAddress,int)");
    }

    public static void setegid(int arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#setegid(int)");
    }

    public static void setenv(java.lang.String arg0, java.lang.String arg1, boolean arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#setenv(java.lang.String,java.lang.String,boolean)");
    }

    public static void seteuid(int arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#seteuid(int)");
    }

    public static void setgid(int arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#setgid(int)");
    }

    public static int setsid() throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#setsid()");
    }

    public static void setsockoptInt(java.io.FileDescriptor arg0, int arg1, int arg2, int arg3) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#setsockoptInt(java.io.FileDescriptor,int,int,int)");
    }

    public static void setsockoptTimeval(java.io.FileDescriptor arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.system.StructTimeval arg3) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#setsockoptTimeval(java.io.FileDescriptor,int,int,android.system.StructTimeval)");
    }

    public static void setuid(int arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#setuid(int)");
    }

    public static void setxattr(java.lang.String arg0, java.lang.String arg1, byte[] arg2, int arg3) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#setxattr(java.lang.String,java.lang.String,[B,int)");
    }

    public static void shutdown(java.io.FileDescriptor arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#shutdown(java.io.FileDescriptor,int)");
    }

    public static java.io.FileDescriptor socket(int arg0, int arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#socket(int,int,int)");
    }

    public static void socketpair(int arg0, int arg1, int arg2, java.io.FileDescriptor arg3, java.io.FileDescriptor arg4) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#socketpair(int,int,int,java.io.FileDescriptor,java.io.FileDescriptor)");
    }

    public static com.micklab.dcg.wrapper.android.system.StructStat stat(java.lang.String arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#stat(java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.system.StructStatVfs statvfs(java.lang.String arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#statvfs(java.lang.String)");
    }

    public static java.lang.String strerror(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#strerror(int)");
    }

    public static java.lang.String strsignal(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#strsignal(int)");
    }

    public static void symlink(java.lang.String arg0, java.lang.String arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#symlink(java.lang.String,java.lang.String)");
    }

    public static long sysconf(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#sysconf(int)");
    }

    public static void tcdrain(java.io.FileDescriptor arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#tcdrain(java.io.FileDescriptor)");
    }

    public static void tcsendbreak(java.io.FileDescriptor arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#tcsendbreak(java.io.FileDescriptor,int)");
    }

    public static int umask(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#umask(int)");
    }

    public static com.micklab.dcg.wrapper.android.system.StructUtsname uname() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#uname()");
    }

    public static void unsetenv(java.lang.String arg0) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#unsetenv(java.lang.String)");
    }

    public static int write(java.io.FileDescriptor arg0, java.nio.ByteBuffer arg1) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#write(java.io.FileDescriptor,java.nio.ByteBuffer)");
    }

    public static int write(java.io.FileDescriptor arg0, byte[] arg1, int arg2, int arg3) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#write(java.io.FileDescriptor,[B,int,int)");
    }

    public static int writev(java.io.FileDescriptor arg0, java.lang.Object[] arg1, int[] arg2, int[] arg3) throws android.system.ErrnoException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.Os#writev(java.io.FileDescriptor,[Ljava.lang.Object;,[I,[I)");
    }

}
