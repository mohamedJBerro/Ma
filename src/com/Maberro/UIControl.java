package com.Maberro;

public class UIControl {
     private Boolean isEnabled;

    public UIControl(Boolean isEnabled) {
        setIsEnabled(isEnabled);
        System.out.println("UIControl");
    }
    public void setIsEnabled(Boolean isEnabled){
        this.isEnabled=isEnabled;
    }
}
