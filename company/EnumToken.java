
////ENUM FOR TOKENS TO COMPARE IF THE CURRENT ELEMENT IS THE SAME AS A SYMBOL
package com.company;

public enum EnumToken {

    ASSIG("="),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    PLUS("+"),
    SEMICOLON(";"),
    LE_OPERATOR("<="),
    LT_OPERATOR("<"),
    GE_OPERATOR(">="),
    GT_OPERATOR(">"),
    EQ_OPERATOR("=="),
    NE_OPERATOR("!="),
    MOD("%"),
    REV_DIVIDE("\\"),
    OPEN_BRACKET("("),
    CLOSE_BRACKET(")"),
    EXPONENT("^");




    String c;

    EnumToken(String c) {
        this.c = c;
    }

    public String getString() {
        return c;
    }



}