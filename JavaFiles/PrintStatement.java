//this class is used when the first element is print keyword and then proceeds to check if it will be a print statement, if yes it will print otherwise throw error
package com.company;

import java.util.HashMap;

public class PrintStatement {
    public static void print(String[] words, int i, HashMap<Character, Integer> assignVar,int lineCounter) {
        int arthExpReturn;
            if (words.length == 4) {
                if(words[i+3].equals(""+ EnumToken.CLOSE_BRACKET.getString())&&(words[i+1].equals(""+ EnumToken.OPEN_BRACKET.getString())))
                {
 //print ( x )
                if(((Character.isLetter(words[i + 2].charAt(0)) && words[i + 2].length() == 1))){
                    if (assignVar.containsKey((words[i + 2]).charAt(0))) { //i+2
                        System.out.println(assignVar.get((words[i + 2]).charAt(0)));

                    }else {
                        System.out.println("variable: " + words[i + 2] + " isn't assigned a number");
                            System.exit(11);
                    }
  //print ( 3 )
                } else if(IsInteger.isInteger(words[i+2])){
                    System.out.println(words[i+2]);
                }
            }else {
                    System.out.println("Check syntax on line: " +lineCounter + " for print statement");
                    System.out.println("Make sure you have an opening and closing parenthesis for print statement");
                    System.out.println("Example:");
                    System.out.println("print ( x )");
                    System.out.println("print ( + x 5 )");
                }
            }else if (words.length == 6) {
//first is a token
                if (IsInteger.isInteger(words[i+2])||((Character.isLetter(words[i + 2].charAt(0)) && words[i + 1].length() == 1))) {
                    System.out.println("Make sure you have prefix format");
                    System.out.println("Ex: a = + b c ");
                    System.exit(12);
                }
                else if ((Character.isLetter(words[i + 3].charAt(0))) && (Character.isLetter(words[i + 4].charAt(0)))) {
//both are variables
                    if (assignVar.containsKey((words[i + 3]).charAt(0)) && (assignVar.containsKey((words[i + 4]).charAt(0)))) {
                        arthExpReturn = ArithExp.test(words[i + 2], assignVar.get((words[i + 3]).charAt(0)), assignVar.get((words[i + 4]).charAt(0)), lineCounter);
                        if(arthExpReturn!=100){
                            System.out.println(arthExpReturn);
                        }
                    } else if ((!assignVar.containsKey((words[i + 3]).charAt(0)) || (!assignVar.containsKey((words[i + 4]).charAt(0))))) {
                        if ((!assignVar.containsKey((words[i + 3]).charAt(0)))) {
                            System.out.println(words[i + 3] + " is not assigned a number");
                        } else if ((!assignVar.containsKey((words[i + 4]).charAt(0)))) {
                            System.out.println(words[i + 4] + " is not assigned a number");
                        }
                        System.exit(13);
                    }
 //first is variable, second is integer
                } else if (assignVar.containsKey((words[i + 3]).charAt(0))) {
                 arthExpReturn = ArithExp.test(words[i + 2], assignVar.get((words[i + 3]).charAt(0)), Integer.parseInt(words[i + 4]), lineCounter);
                    if(arthExpReturn!=100){
                        System.out.println(arthExpReturn);
                    }
 //first is Integer, second is variable
                } else if (assignVar.containsKey((words[i + 4]).charAt(0))) {
                    arthExpReturn = ArithExp.test(words[i + 2], Integer.parseInt(words[i + 3]), assignVar.get((words[i + 4]).charAt(0)), lineCounter);
                    if(arthExpReturn!=100){
                        System.out.println(arthExpReturn);
                    }
  //both are integers
                } else if ((IsInteger.isInteger(words[i + 3])) && (IsInteger.isInteger(words[i + 4]))) {
                arthExpReturn = ArithExp.test(words[i + 2], Integer.parseInt(words[i + 3]), Integer.parseInt(words[i + 4]), lineCounter);
                if(arthExpReturn!=100){
                        System.out.println(arthExpReturn);
                    }
                } else if ((!assignVar.containsKey((words[i + 3]).charAt(0))) && ((Character.isLetter(words[i + 3].charAt(0))))) {
                    System.out.println("variable: " + words[i + 3] + " isn't assigned a number");
                    System.exit(14);
                } else if ((!assignVar.containsKey((words[i + 4]).charAt(0))) && ((Character.isLetter(words[i + 4].charAt(0))))) {
                    System.out.println("variable: " + words[i + 3] + " isn't assigned a number");
                    System.exit(15);
                }
            }else if ((words.length != 4) || words.length != 6) {
                if(!words[words.length-1] .equals(EnumToken.CLOSE_BRACKET.getString())){
                    System.out.println("Check syntax on line: " +lineCounter + " for print statement");
                    System.out.println("Please make sure to close the parenthesis ");
                    System.out.println("Example:");
                    System.out.println("print ( x )");
                    System.out.println("print ( + x 5 )");
                    System.exit(22);
                }
            System.out.println("Check syntax on line: " +lineCounter + " for print statement");
            System.out.println("Example:");
            System.out.println("print ( x )");
            System.out.println("print ( + x 5 )");
                System.exit(24);
        }
    }
}



