package com.bitmapscoding.formcomponents.impl;

import com.bitmapscoding.formcomponents.Button;

public class IOSButton implements Button {

    private String label = "MyIOsButton";
    private String name = "MyIosButtonName";

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
        System.out.println("Clicked an iOS Button");
    }
}
