package com.company;

public class Main {

    public static void main(String[] args) {
        zippo("rattle", 13);                       // 1 - it runs the line of code and save the values // 6 - so it runs the original value of Zippo//
                                                                                                                        // and print it.//
    }
    public static void baffle(String blimp) {
        System.out.println(blimp);                            /* 5 - in 4 it runs the code line that is why it runs the blimp but blimp is the old Zippo */
        zippo("ping", -5);                         // 7 - it runs this line of code and save the new values.
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {                                        // 2 - it runs the if sentence // // 8 - then it runs the if sentence again and established that//
                                                                                                 // the statements conditions is true.//
                                                              // 12 - then it runs the if sentence again to check if something is missing.
            System.out.println(quince + " zoop");              // 9 - Then it runs this line of code and print out the values of Zippo "ping and -5"//
        } else {                                               // 13 - and check the else for values missing.
            System.out.println("ik");                       // 3 - Because flag is > 0 it runs the else sentence then it prints "ik"
            baffle(quince);                                // 4 - it runs the next line of code baffle(quince);
            System.out.println("boo-wa-ha-ha");             // 14 - because the other 2 values is print therefore it is print this last line of code//
                                                                    //  and terminate the program.
        }
    }                                                      // 10 - then it is exit the code because it has run the code.

}                                                          // 11 - then it returns void back to the public static void main.
