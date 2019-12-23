//THIS CLASS RETURNS THE CORRECT RELATIVE OPERATOR IF IT DOESNT MATCH IT RETURNS 0 WHICH WILL THROW ERROR

package com.company;

public class Rel_op {

    public static int Operator(String[] wordArr, int i){

        //if it has one of those operators for boolean
        if(wordArr[i+1].equals(EnumToken.LE_OPERATOR.getString())){
            return 1;
        }
        else if(wordArr[i+1].equals(EnumToken.LT_OPERATOR.getString())){
            return 2;
        }
        else if(wordArr[i+1].equals(EnumToken.GE_OPERATOR.getString())){
            return 3;
        }
        else if(wordArr[i+1].equals(EnumToken.GT_OPERATOR.getString())){
            return 4;
        }
        else if(wordArr[i+1].equals(EnumToken.EQ_OPERATOR.getString())){
            return 5;
        }
        else if(wordArr[i+1].equals(EnumToken.NE_OPERATOR.getString())){
            return 6;
        }
        else             return 0;



    }


}