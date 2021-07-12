package com.bitmapscoding.factories;

import com.bitmapscoding.formcomponents.Button;
import com.bitmapscoding.formcomponents.Checkbox;
import com.bitmapscoding.formcomponents.TextInput;
import com.bitmapscoding.formcomponents.impl.IOSButton;
import com.bitmapscoding.formcomponents.impl.IOSCheckbox;
import com.bitmapscoding.formcomponents.impl.IOSTextInput;
import com.bitmapscoding.formcomponents.impl.WindowsButton;

public class IOSFormComponentFactory implements FormComponentFactory {

    @Override
    public Button createButton(String name, String label) {
        return new IOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        Checkbox checkbox = new IOSCheckbox();
        checkbox.setChecked(true);
        return checkbox;
    }

    @Override
    public TextInput createTextInput(String value, boolean enabled) {
        TextInput textInput = new IOSTextInput();
        textInput.setEnabled(enabled);
        textInput.setValue(value);
        return textInput;
    }
}
