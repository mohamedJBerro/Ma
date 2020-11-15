package com.Maberro;

public class TextBox extends UIControl {

    private String text;
    public TextBox() {
        super(true);
        setText(text);
        System.out.println("TextBox");
    }
    public void setText (String text){
        this.text=text;
    }
    public void clearText(){
        this.text="";
    }

    @Override
    public String toString() {
        return text;
    }

    public String getText() {
        return text;
    }
}
