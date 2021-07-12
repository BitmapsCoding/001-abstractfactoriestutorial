package com.bitmapscoding.factories;

import com.bitmapscoding.formcomponents.Button;
import com.bitmapscoding.formcomponents.Checkbox;
import com.bitmapscoding.formcomponents.TextInput;
import com.bitmapscoding.formcomponents.impl.WindowsButton;
import com.bitmapscoding.formcomponents.impl.WindowsCheckbox;
import com.bitmapscoding.formcomponents.impl.WindowsTextInput;

public class WindowsFormComponentFactory implements FormComponentFactory {

    @Override
    public Button createButton(String name, String label) {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        Checkbox checkbox = new WindowsCheckbox();
        checkbox.setChecked(true);
        return checkbox;
    }

    @Override
    public TextInput createTextInput(String value, boolean enabled) {
        TextInput textInput = new WindowsTextInput();
        textInput.setEnabled(enabled);
        textInput.setValue(value);
        return textInput;
    }
}
