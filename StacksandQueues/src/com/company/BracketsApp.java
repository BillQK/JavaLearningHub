package com.company;

import java.io.IOException;

import static com.company.ReverseApp.getString;

public class BracketsApp {
    public static void main(String[] args) throws IOException
    {
        String input;
        while (true)
        {
            System.out.println(
                    "Enter a String containing delimiters: "
            );
            System.out.flush();
            input = getString();
            if (input.equals(""))
            {
                break;
            }

            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();

        }
    }
}
