package com.bitmapscoding.factories;

import com.bitmapscoding.formcomponents.Button;
import com.bitmapscoding.formcomponents.Checkbox;
import com.bitmapscoding.formcomponents.TextInput;

public interface FormComponentFactory {

    Button createButton(String name, String label);

    Checkbox createCheckbox();

    TextInput createTextInput(String value, boolean enabled);

}
