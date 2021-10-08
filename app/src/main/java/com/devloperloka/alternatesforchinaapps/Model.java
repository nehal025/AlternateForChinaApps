package com.devloperloka.alternatesforchinaapps;

import android.graphics.drawable.Drawable;

public class Model {
    private String Title1,Title2;
    private int img2;
    private Drawable img1;
    private String PackageName;

    public String getPackageName() {
        return PackageName;
    }

    public void setPackageName(String packageName) {
        PackageName = packageName;
    }

    public String getTitle1() {
        return Title1;
    }

    public void setTitle1(String title1) {
        Title1 = title1;
    }

    public String getTitle2() {
        return Title2;
    }

    public void setTitle2(String title2) {
        Title2 = title2;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public Drawable getImg1() {
        return img1;
    }

    public void setImg1(Drawable img1) {
        this.img1 = img1;
    }
}
