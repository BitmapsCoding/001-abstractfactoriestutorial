package com.bitmapscoding.formcomponents.impl;

import com.bitmapscoding.formcomponents.Checkbox;

public class WindowsCheckbox implements Checkbox {

    private boolean checked = true;
    private String label = "My Windows Checkbox";

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public boolean isChecked() {
        return this.checked;
    }

    @Override
    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
