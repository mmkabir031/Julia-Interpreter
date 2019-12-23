//ENUM FOR KEYWORDS TO COMPARE IF THE CURRENT ELEMENT IS THE SAME AS A KEYWORD
package com.company;

public enum EnumKeyword {
    FOR("for"),
    END("end"),
    IF("if"),
    WHILE("while"),
    ELSE("else"),
    PRINT("print"),
    FUNCTION("function");

 private   String c;

    EnumKeyword(String c) {
        this.c = c;
    }

    public String getString() {
        return c;
    }
}

