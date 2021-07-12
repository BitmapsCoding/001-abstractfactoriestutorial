package com.bitmapscoding;

import com.bitmapscoding.factories.*;

import java.util.Arrays;

public class Demo {

    private static Application buildApplication(String os) {
        FormComponentFactory factory = null;
        if (os.equals("iOS")) {
            factory = new IOSFormComponentFactory();
        } else if (os.equals("Android")) {
            factory = new AndroidFormComponentFactory();
        } else if (os.equals("MacOS")) {
            factory = new MacOSFormComponentFactory();
        } else {
            factory = new WindowsFormComponentFactory();
        }
        return new Application(factory);
    }


    public static void main(String[] args) {
        if (args != null) {
            System.out.println("Args are " + Arrays.asList(args));
        }
        String os = args[0];
        Application application = buildApplication(os);
        application.test();
    }

}
