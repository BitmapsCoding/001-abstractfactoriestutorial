package com.bitmapscoding.factories;

import com.bitmapscoding.formcomponents.Button;
import com.bitmapscoding.formcomponents.Checkbox;
import com.bitmapscoding.formcomponents.TextInput;
import com.bitmapscoding.formcomponents.impl.*;

public class MacOSFormComponentFactory implements FormComponentFactory {

    @Override
    public Button createButton(String name, String label) {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        Checkbox checkbox = new MacOSCheckbox();
        checkbox.setChecked(true);
        return checkbox;
    }

    @Override
    public TextInput createTextInput(String value, boolean enabled) {
        TextInput textInput = new MacOSTextInput();
        textInput.setEnabled(enabled);
        textInput.setValue(value);
        return textInput;
    }
}
