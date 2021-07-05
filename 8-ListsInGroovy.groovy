/* ------------------ Lists In Groovy ----------------
*  The List is a structure used to store a collection of data items. In Groovy, the List holds a sequence of object references. 
*  Object references in a List occupy a position in the sequence and are distinguished by an integer index. 
*  A List literal is presented as a series of objects separated by commas and enclosed in square brackets.
*  
*  Examples of List: ->
*        [11, 12, 13, 14] – A list of integer values
*        [‘Angular’, ‘Groovy’, ‘Java’] – A list of Strings
*        [1, 2, [3, 4], 5] – A nested list
*        [‘Groovy’, 21, 2.11] – A heterogeneous list of object references
*        [ ] – An empty list
*/

class ListDemo{
    public void listDemoFunc(){
        // This functin demonstrates the usage of basic list and methods associated to it....
        // Some of the methods that are applicable for Ranges as well as Lists, are not covered in this (to save some time.)
        // Functions not included are: - contains(), get(), size()
        def intList = [5, 6, 7, 8, 9, 10];
        def emptyList = [];
        println(intList);
        println("Contents of the List are: ${intList}");
        println(" ---------------------- XXXXX ---------------------- ");
        
        // Methods Demonstrations
        // 1. boolean add(Object value) - Append the new value to the end of this List.
        //    void add(int index, Object value)  - Append the new value to a particular position in the List.
        println("Contents of the Initial List are: ${intList}");
        intList.add(25);
        intList.add(3,99);
        println("Contents of the Final List are: ${intList}");
        println(" ---------------------- XXXXX ---------------------- ");
        
        // 2. boolean isEmpty() - Returns true if this List contains no elements.
        println(intList.isEmpty());
        println(emptyList.isEmpty());
        println(" ---------------------- XXXXX ---------------------- ");
        
        // 3. List minus(Collection collection) - Creates a new List composed of the elements of the original 
        //                                        without those specified in the collection.
        def newList = intList.minus([6,99]);
        println("Contents of the New List are: ${newList}");
        println(" ---------------------- XXXXX ---------------------- ");
        
        // 4. List plus(Collection collection) - Creates a new List composed of the elements of the original 
        //                                       together with those specified in the collection.
        def newList2 = intList.plus([11,33,55,77,110]);
        println("Contents of the New List(2) are: ${newList2}");
        println(" ---------------------- XXXXX ---------------------- ");
        
        // 5. Object pop() - Removes the last item from this List.
        println("Item Popped = ${intList.pop()}");
        println("Content in the List after Popping 1 Item: ${intList}");
        println(" ---------------------- XXXXX ---------------------- ");
        
        // 6. Object remove(int index) - Removes the element at the specified position in this List.
        println("Item Removed from Position 5 = ${intList.remove(5)}");
        println("Content in the List after Removing 1 Item: ${intList}");
        println(" ---------------------- XXXXX ---------------------- ");
        
        // 7. List reverse() - Create a new List that is the reverse the elements of the original List.
        def rev_intList = intList.reverse();
        println("Content in the New List after Reversal: ${rev_intList}");
        println(" ---------------------- XXXXX ---------------------- ");
        
        // 8. List sort() - Returns a sorted copy of the original List.
        def sorted_rev_intList = rev_intList.sort();
        println("Content in the New List after Sorting: ${sorted_rev_intList}");
        println(" ---------------------- XXXXX ---------------------- ");
        
        
        
        
        
    }

    public static void main(String[] args){
        ListDemo ld = new ListDemo();
        ld.listDemoFunc();
    }
}