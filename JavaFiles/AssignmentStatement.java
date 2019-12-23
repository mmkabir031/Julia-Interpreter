//this class is used when there is an assignment operator then proceeds to check if it will be a valid assignment statement, if yes it will print otherwise throw error
package com.company;

import java.util.HashMap;

public class AssignmentStatement {

    public static void assign(String words[], int i, HashMap<Character, Integer> assignVar, int lineCounter) {
        int arthExpReturn;
        if (((Character.isLetter(words[i - 1].charAt(0)) && words[i - 1].length() == 1))) {//first word is an alphabet
// x = 5
            if (words.length == 3) {
                if (IsInteger.isInteger(words[i + 1])) {
                    assignVar.put(((words[0]).charAt(0)), Integer.parseInt(words[2]));
                }
//x = y
                else if (((Character.isLetter(words[i + 1].charAt(0)) && words[i + 1].length() == 1))) {
                    assignVar.put(((words[0]).charAt(0)), assignVar.get((words[i + 1]).charAt(0)));
                } else {
                    System.out.println("variable: " + words[i + 1] + " isn't assigned a number");
                    System.exit(2);
                }

            } else if ((words.length == 5)) {
                if (IsInteger.isInteger(words[i+1])||((Character.isLetter(words[i + 1].charAt(0)) && words[i + 1].length() == 1))) {//first is a symbol
                    System.out.println("in-fix isnt supported yet, We talked about this Deepa!");
                    System.out.println("You said dont worry about it, but dont put/count it as an error!");
                    System.out.println("Ex: a = + b c ");
                    System.exit(2);
                }else if ((Character.isLetter(words[i + 2].charAt(0))) && (Character.isLetter(words[i + 3].charAt(0)))) {
//both elements are valid variables
                    if (assignVar.containsKey((words[i + 2]).charAt(0)) && (assignVar.containsKey((words[i + 3]).charAt(0)))) { //both are alpha
                        arthExpReturn = ArithExp.test(words[i + 1], assignVar.get((words[i + 2]).charAt(0)), assignVar.get((words[i + 3]).charAt(0)), lineCounter);
                        if(arthExpReturn!=100){
                            assignVar.put(((words[0]).charAt(0)), arthExpReturn);
                        }
                    } else {
                        if(!assignVar.containsKey((words[i + 2]).charAt(0))){
                        System.out.println("The following variable isnt assigned a number: " + words[i + 2]);
                            System.out.println("To assign a variable follow the example below");
                            System.out.println("a = 5");
                            System.out.println("OR");
                            System.out.println("b = + 5 a");
                        System.exit(10);
                    }else if (!assignVar.containsKey((words[i + 3]).charAt(0))){
                            System.out.println("The following variable isnt assigned a number: " + words[i + 3]);
                            System.out.println("To assign a variable follow the example below");
                            System.out.println("a = 5");
                            System.out.println("OR");
                            System.out.println("b = + 5 a");
                            System.exit(10);
                        }
                }
// first element is variable and the second is integer
                    } else if((Character.isLetter(words[i + 2].charAt(0)))){
                        if ((assignVar.containsKey((words[i + 2]).charAt(0)))) {//first is in there as alpha
                            if (IsInteger.isInteger(words[i + 3])) {
                                arthExpReturn = ArithExp.test(words[i + 1], assignVar.get((words[i + 2]).charAt(0)), Integer.parseInt(words[i + 3]), lineCounter);
                                if(arthExpReturn!=100){
                                    assignVar.put(((words[0]).charAt(0)), arthExpReturn);
                                } else {
                                    System.out.println("Check arithmetic operator on line: " +lineCounter);
                                    System.out.println("Example:");
                                    System.out.println(" + 5 2");
                                    System.out.println(" * 4 x ");
                                    System.exit(32);
                                }
                            } else System.out.println("integer expected for first: " + words[i + 2]);
                        } else System.out.println(words[i+2]+"is not assigned a number");
  // first element is integer and second is variable
                    } else if ((Character.isLetter(words[i + 3].charAt(0)))){
                        if ((assignVar.containsKey((words[i + 3]).charAt(0)))) {//second is in there as alpha
                        if (IsInteger.isInteger(words[i + 2])) {
                            arthExpReturn = ArithExp.test(words[i + 1], Integer.parseInt(words[i + 2]), assignVar.get((words[i + 3]).charAt(0)), lineCounter);
                            if(arthExpReturn!=100){
                                assignVar.put(((words[0]).charAt(0)), arthExpReturn);
                            }
                        } else System.out.println("integer expected for second: " + words[i + 3]);
                        } else System.out.println(words[i+2]+"is not assigned a number");
 //both are integers
                    } else if ((IsInteger.isInteger(words[i + 2])) && (IsInteger.isInteger(words[i + 3]))) {
                        arthExpReturn = ArithExp.test(words[i + 1], Integer.parseInt(words[i + 2]), Integer.parseInt(words[i + 3]), lineCounter);
                    if(arthExpReturn!=100){
                            assignVar.put(((words[0]).charAt(0)), arthExpReturn);
                        }
                    }
                }
            else if ((words.length != 3) || words.length != 5)
            {
                if(words.length>5 && EnumToken.SEMICOLON.getString().equals(words[i+4])){
                    System.out.println("Please remove the semicolon on line " + lineCounter);
                    System.out.println("Example:");
                    System.out.println("x = 5");
                    System.out.println("OR");
                    System.out.println("y = + 3 x");

                    System.exit(2);
                }else
                System.out.println("Check syntax on line: " +lineCounter + " for assignment statement");
                System.out.println("Example:");
                System.out.println("x = 5");
                System.out.println("OR");
                System.out.println("y = + 3 x");
                System.exit(2);
            }
        }

    }

}


