package com.bitmapscoding.formcomponents.impl;

import com.bitmapscoding.formcomponents.Button;

public class AndroidButton implements Button {

    private String label = "MyAndroidButton";
    private String name = "MyAndroidButtonName";

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void click() {
        System.out.println("Clicked an Android Button");
    }
}
