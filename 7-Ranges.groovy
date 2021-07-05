/*
* ------------ Ranges in Groovy ----------------
* What is a Range? -> A range is shorthand for specifying a sequence of values. 
*                     A Range is denoted by the first and last values in the sequence, and Range can be inclusive or exclusive.
*
* Different Possible Ranges(of primitive datatypes):-
*                 1..10 - An example of an inclusive Range
*                 1..<10 - An example of an exclusive Range
*                ‘a’..’x’ – Ranges can also consist of characters
*                 10..1 – Ranges can also be in descending order
*                ‘x’..’a’ – Ranges can also consist of characters and be in descending order.
*/

class RangeDemo{
    public void rangeDemoFunc(){
        // this function demonstrates the usage of the range and methods associated to it...
        // define a range
        def range_demo = 1..20;                      // this is a range which contains integers from 1 to 20
        def range_demo_2 = 20..0;                    // range in decreasing order
        println("Contents are: ${range_demo}");     // this line prints the contents of range_demo using Camel Notation
        
        println("-------------------- XXXXX --------------------");
        // Also we can loop over the range just like we do for a list and the print the items in it
        for(n in range_demo){
            println(n);
        }
        println("-------------------- XXXXX --------------------");
        
        // Various Methods Associated/that can be useful while working with Ranges
        // 1. boolean contains(Object obj) - Checks if a range contains a specific value.
        println(range_demo.contains(5));
        println(range_demo.contains(50));
        println("-------------------- XXXXX --------------------");
        
        // 2. int size() - Returns the number of elements in this Range.
        println(range_demo.size());
        println("-------------------- XXXXX --------------------");
        
        // 3. Object get(int index) - Returns the element at the specified position in this Range.
        println(range_demo.get(5));
        // println(range_demo.get(50));        // Will throw an exception that 50 is too big for the range.
        println("-------------------- XXXXX --------------------");
        
        // 4. Comparable getFrom() - The lower value of the range.
        println(range_demo.getFrom());
        println("-------------------- XXXXX --------------------");
         
        // 5. Comparable getTo() - Get the upper value of this Range.
        println(range_demo.getTo());
        println("-------------------- XXXXX --------------------");
        
        // 6. boolean isReverse() - Boolean value of true or false on whether the range is reversed.
        println(range_demo.isReverse());
        println(range_demo_2.isReverse());
        println("-------------------- XXXXX --------------------");
        
        // 7. List subList(int fromIndex, int toIndex) - Returns a view of the portion of this Range between 
        //                                               the specified fromIndex, inclusive, and toIndex, exclusive
        println(range_demo.subList(8,18));
        println(range_demo_2.subList(5,13));
        println("-------------------- XXXXX --------------------");
    }
    
    public static void main(String[] args){
        RangeDemo rd = new RangeDemo();
        rd.rangeDemoFunc();
    }
}