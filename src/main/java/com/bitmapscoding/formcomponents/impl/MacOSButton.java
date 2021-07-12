package com.bitmapscoding.formcomponents.impl;

import com.bitmapscoding.formcomponents.Button;

public class MacOSButton implements Button {

    private String label = "MyMacOSButton";
    private String name = "MyMacOSButtonName";

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
        System.out.println("Clicked a MacOS Button");
    }
}
