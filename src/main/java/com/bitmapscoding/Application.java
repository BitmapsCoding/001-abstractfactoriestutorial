package com.bitmapscoding;

import com.bitmapscoding.factories.FormComponentFactory;
import com.bitmapscoding.formcomponents.Button;
import com.bitmapscoding.formcomponents.Checkbox;
import com.bitmapscoding.formcomponents.TextInput;

public class Application {

    private FormComponentFactory factory;
    private Button button;
    private TextInput textInput;
    private Checkbox checkbox;

    public Application(FormComponentFactory factory) {
        this.factory = factory;
        this.button = this.factory.createButton("test", "testLabel");
        this.textInput = this.factory.createTextInput("test value", true);
        this.checkbox = this.factory.createCheckbox();
    }

    public void test() {
        this.button.click();
        System.out.println("Text input label - " + this.textInput.getLabel());
        System.out.println("Checkbox - " + this.checkbox.getLabel());
    }

}
