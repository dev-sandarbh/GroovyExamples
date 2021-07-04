// Strings in Groovy

class StringsDemo{
    // Initializing String Variable
    static String sample = "This is a sample String";
    static String sample2 = "This is a sample String 2.";
    static String a = "ABCDEF";
    static String regExpr = "This-is-dev-sandarbh";
    
    public void basicStringOps(){
        // this function shows usage of basic string operations such as repetition, concatenations, finding length 
        
        // String Concatenation
        println("This is a sample String 1. "+" This is a sample String 2.");
        println(sample+" "+sample2);
        
        // String Repetition
        println("This is a sample String 1. "*2);
        println(sample*2);
        
        // String Length
        println("Length of Sample String = "+(sample.length()).toString());
    }
    
    public void otherStringOps(){
        // this function shows usage of other string operations 
        
        // 1. Center() - Returns a new String of length numberOfChars consisting of the recipient padded on the left and right with space characters.
        println(sample.center(5));
        
        // 2. endsWith() - Tests whether this string ends with the specified suffix.
        println(sample.endsWith("ing"));
        println(sample.endsWith("abc"));
        println(sample.endsWith("ng"));
        
        // 3. getAt(index) - String value at the index position.
        println(sample.getAt(10));
        println(sample.getAt(18));
        println(sample.getAt(-1));
        
        // 4. indexOf(characterToSearchFor) - Returns the index within this string of the first occurrence of the specified character or -1 if the character does not occur.
        println(sample.indexOf("i"));
        println(sample.indexOf("i", 10));
        
        // 5. minus() - Removes the value part of the String..
        println(sample.minus("This"));
        println(sample.minus("String"));
        println(sample.minus("is"));
        
        // 6. next() - This method is called by the ++ operator for the class String. It increments the last character in the given String.
        println(sample.next());
        
        // 7. String padLeft(Number numberOfCharacters, String padding) - The new value of the string with the padded characters.
        println(sample.padLeft(sample.length()+10,"*"));
        
        // 8. String padRight(Number numberOfCharacters, String padding) - For padding to the right side of the string.
        println(sample.padRight(sample.length()+10,"*"));
        
        // 9. String plus(Object value) - Appends a String
        println(sample.plus("This is Appended String."));
        
        // 10. String reverse() - Reverse the string
        println(sample.reverse());
        
        // 11. String substring(int beginIndex, int endIndex) - Returns a substring starting from StartIndex and ending at endIndex
        println(sample.substring(6));
        println(sample.substring(12));
        
        // 12. String toUpperCase() - Converts String to Upper Case
        println(sample.toUpperCase());
        
        // 13. String toLowerCase() - Converts String to Lower Case
        println(sample.toLowerCase());         
        
        // 14. String concat(String str) - Concatente Strings
        println(sample.concat(", Concatenated...!!"));
        
        // 15. Boolean equalsIgnoreCase(String str) - This method returns true if the argument is not null and the Strings are equal, ignoring case; false otherwise.
        println(a.equalsIgnoreCase("abcdef"));
        println(a.equalsIgnoreCase("aBcDeF"));
        println(a.equalsIgnoreCase("abcdefg"));
        
        // 16. int compareToIgnoreCase(String str) - This method returns a negative integer, zero, or a positive integer as the specified String is greater than, equal to, or less than this String, ignoring case considerations.
        println(a.compareToIgnoreCase("abcdefg"));
        println(a.compareToIgnoreCase("abcdefghijkl"));
        println(a.compareToIgnoreCase("defg"));
        println(a.compareToIgnoreCase("abc"));
        
        // 17. void eachMatch(String regex, Closure clos) - Processes each regex group (see next section) matched substring of the given String
        // Regex – The string expression to search for, Closure – optional closure
        
        
        
        // 18. Boolean matches(String regex) - It outputs whether a String matches the given regular expression.
        // Regex ? the expression for comparison.
        
        
        
        // 19. String previous() - 
        
        
        
        // 20. void replaceAll(String regex, String replacement) - Replaces all occurrences of a captured group by the result of a closure on that text.
        // regex ? the regular expression to which this string is to be matched, 
        // replacement ? the string which would replace found expression.
        
        
        
        // 21. String[] split(String regex) - Splits this String around matches of the given regular expression.
        String[] wordsGot = regExpr.split('-');
        for(String val : wordsGot)
        println(val);
    }

    public static void main(String[] args){    
        // this function demonstrates basic operations that we can perform on a String
        println(sample);
        println(sample[2]);           // this prints character 3 in the string.
        println(sample[2..8]);        // this is range operator that prints from character 3 to character 9 in the string. 
        
        // Declaring Object and Invoking Method
        StringsDemo sd = new StringsDemo();
        sd.basicStringOps();
        sd.otherStringOps();
    }
}