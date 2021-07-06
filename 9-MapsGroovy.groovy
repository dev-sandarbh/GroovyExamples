// Maps in Groovy
/*
* A Map (also known as an associative array, dictionary, table, and hash) is an unordered collection of object references. 
* The elements in a Map collection are accessed by a key value. The keys used in a Map can be of any class. 
* When we insert into a Map collection, two values are required: the key and the value.
* Following are some examples of maps ?>
*            ["Task" : "Statistics", "SmallDescription" : "Practice Statistics for Data Science"] – Collections of key value pairs which has TopicName as the key and 
*                                                            their respective values.
*            [ : ] – An Empty map.
*/
class MapsDemo{
    public void mapsDemo(){
        // this function demonstrates the use of Maps and functions related to them.
        def mp = [Task : "Statistics", SmallDescription : "Practice Statistics for Data Science", TaskID:"000x", TaskPriority:"Initiated"];
        println("Contents of Map(mp) are: ${mp}");
        
        // 1. boolean containsKey(Object key) - True or false depending on whether the key value is there or not.
        println(mp.containsKey("Task")); 
        println(mp.containsKey("TaskDesc"));
        println(" ---------- XXXXX ---------- ");
        
        // 2. Object get(Object key) - The key-value pair or NULL if it does not exist.
        println(mp.get("Task")); 
        println(mp.get("TaskDesc"));
        println(" ---------- XXXXX ---------- ");
        
        // 3. Object putAll(Object key, Object value) - Associates the specified value with the specified key in this Map. 
        //    If this Map previously contained a mapping for this key, the old value is replaced by the specified value.
        
        // First Way of adding Key
        mp.putAll(TaskID:"00x5");
        println("Contents of Map(mp) are: ${mp}");
        
        //Second Way of adding Key
        //  def keyLiteral = "TaskID";
        // mp.putAll((keyLiteral):"00x1");
        println(" ---------- XXXXX ---------- ");
        
        // 4. int size() - Returns the number of key-value mappings in this Map.
        println("Size of the Map is ${mp.size()}");
        println(" ---------- XXXXX ---------- ");
        
        // 5. Collection values() - This return the list of values present in the map
        println("Values are: ${mp.values()}");
        println(" ---------- XXXXX ---------- ");
        
        // 6. Set keySet() - Obtain a Set of the keys in this Map.
        println("KeySet in the Map is: ${mp.keySet()}");
    }

    public static void main(String[] args){
        MapsDemo md = new MapsDemo();
        md.mapsDemo();
    }
}