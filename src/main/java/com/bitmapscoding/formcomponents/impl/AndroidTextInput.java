package com.bitmapscoding.formcomponents.impl;

import com.bitmapscoding.formcomponents.TextInput;

public class AndroidTextInput implements TextInput {

    private String label = "My Android Text Input";
    private String value = "My Android Text Input Value";
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
