package com.bitmapscoding.formcomponents.impl;

import com.bitmapscoding.formcomponents.Button;

public class WindowsButton implements Button {

    private String label = "MyWindowsButton";
    private String name = "MyWindowsButtonName";

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
        System.out.println("Clicked a Windows Button");
    }
}
