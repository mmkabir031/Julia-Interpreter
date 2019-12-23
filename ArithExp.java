//does all the computation, if the arithmetic operator isnt valid throws error
package com.company;
public class ArithExp {
    public static int test(String a, int b, int c, int lineCounter) {

        if (a.equals(EnumToken.MINUS.getString())) {
            return (b - c);
        }
        else if (a.equals(EnumToken.PLUS.getString())) {
            return (b + c);
        }
        else if (a.equals(EnumToken.REV_DIVIDE.getString())) {
            return (c / b);
        }
        else if (a.equals(EnumToken.DIVIDE.getString())) {
            return (b / c);
        }
        else if (a.equals(EnumToken.MULTIPLY.getString())) {
            return (b * c);
        }
        else if (a.equals(EnumToken.MOD.getString())) {
            return (b % c);
        }
        else if (a.equals(EnumToken.EXPONENT.getString())) {
            return ((int) Math.round(Math.pow(b, c)));
        }
         else {
            System.out.println("Check arithmetic operator on line: " +lineCounter + ", the following is incorrect operator: " + a);
            System.out.println("Example:");
            System.out.println(" + 5 2");
            System.out.println(" * 4 x ");
            System.exit(3);

        }
         System.exit(3);
        return 100;
    }
}


