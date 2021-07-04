#!/usr/bin/env groovy
// line above is called Shebang Line. It tells the UNIX System that the Current File is a Groovy Script.

class HelloSan{
    static void main(String[] args){
        // this is a single line comment
        /*
        this is going to be treated as multi-line comment.
        */
        
        // Example of Print Statements from Groovy and Java
        println('Hello Sandarbh, From Groovy World.');
        System.out.println('Hello Sandarbh, From Java World.');
        println("-----------------------------##########-----------------------------");
        
        // defining variables using "def" keyword 
        def var_abc = 100;
        println(var_abc);
        println("-----------------------------##########-----------------------------");
        
        // datatypes present in the Groovy
        /*
        byte - Byte, short - Short,
        int - Integer, long - Long,
        float - Float, double - Double,
        char - Character, boolean - Boolean
        */
        byte x = 2;
        short short_x = 5000;
        int int_x = 2147486647;
        long long_x = 9223372036854775807;
        float float_x = 3.505689742;
        double double_x = -17.25469874125689;
        
        println("-----------------------------##########-----------------------------");
        println(x);
        println(short_x);
        println(int_x);
        println(long_x);
        println(float_x);
        println(double_x);
        println("-----------------------------##########-----------------------------");

        // Strings in Groovy
        String str = "This is First String Example.";
        String str2 = "This is Second String Example.";
        
        println(str);
        println(str2);
        println("This is Concatenated String =>> " + str + " " + str2);
        println("-----------------------------##########-----------------------------");

    }
}