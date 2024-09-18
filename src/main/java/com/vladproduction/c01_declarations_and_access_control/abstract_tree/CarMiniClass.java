package com.vladproduction.c01_declarations_and_access_control.abstract_tree;

public class CarMiniClass extends CarClass{

    @Override
    public void goMethod() {
        // Mini-specific going uphill code
        //need to be implemented (been declared as abstract before in tree inheritance)
    }

    @Override
    public void doCarThings() {
        //came from super but as not abstract, so overriding (if needed) is specific
        super.doCarThings();
    }

    @Override
    public String getType() {
        //came from super but as not abstract, so overriding (if needed) is specific
        return super.getType();
    }
}
