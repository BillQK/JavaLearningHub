package com.company;

public class Reverser {
    private String input;
    private String output;


    public Reverser(String n) {
        this.input = n;
    }

    public String doRev() {
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        this.output = "";
        for(int i = input.length()-1; i >= 0; i--)
        {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }

}

