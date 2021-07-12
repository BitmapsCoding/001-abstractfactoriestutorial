package com.bitmapscoding.factories;

import com.bitmapscoding.formcomponents.Button;
import com.bitmapscoding.formcomponents.Checkbox;
import com.bitmapscoding.formcomponents.TextInput;
import com.bitmapscoding.formcomponents.impl.AndroidButton;
import com.bitmapscoding.formcomponents.impl.AndroidCheckbox;
import com.bitmapscoding.formcomponents.impl.AndroidTextInput;

public class AndroidFormComponentFactory implements FormComponentFactory {

    @Override
    public Button createButton(String name, String label) {
        return new AndroidButton();
    }

    @Override
    public Checkbox createCheckbox() {
        Checkbox checkbox = new AndroidCheckbox();
        checkbox.setChecked(true);
        return checkbox;
    }

    @Override
    public TextInput createTextInput(String value, boolean enabled) {
        TextInput textInput = new AndroidTextInput();
        textInput.setEnabled(enabled);
        textInput.setValue(value);
        return textInput;
    }
}
