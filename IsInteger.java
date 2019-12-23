//CHECKS IF THE CURRENT ELEMENT IS A NUMBER OF NOT, SPECIFICALLY AN INTEGER
package com.company;

public class IsInteger {
    public static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try
        {
            java.lang.Integer.parseInt(s);
            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {
        }
        return isValidInteger;
    }
}
