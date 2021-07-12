package com.bitmapscoding.formcomponents.impl;

import com.bitmapscoding.formcomponents.TextInput;

public class MacOSTextInput implements TextInput {

    private String label = "My MacOS Text Input";
    private String value = "My MacOS Text Input Value";
    private boolean enabled = true;

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
