package com.micklab.dcg.wrapper.pseudo;

import com.micklab.dcg.wrapper.android.graphics.Bitmap;

import java.util.Map;

public class ImageView extends View {
    private Bitmap bitmap;

    public ImageView(Object owner) {
        super(owner);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Bitmap getImageBitmap() {
        return bitmap;
    }

    @Override
    Map<String, Object> __dcgToSpec() {
        return OutputModel.toImageNode(bitmap);
    }
}
