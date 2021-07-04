// Working With Date and Time in Groovy

class WorkingWithDateTime{
    static void main(String[] args){
        Date dt = new Date();
        Date dt1 = new Date("01/01/2021");
        Date dt2 = new Date("01/01/2021");
        println(dt.toString());
        println("---------- XXXXX ----------");
        
        // Some basic functions that come handy while working with dates and time
        // 1. public boolean equals(Object obj) -> True if the objects are the same; false otherwise
        println(dt1.equals(dt2));
        println(dt2.equals(dt));
        println("---------- XXXXX ----------");
        
        // 2. public int compareTo(Date anotherDate) -> Return Value ? The value 0 if the argument Date is equal to this Date; 
        // a value less than 0 if this Date is before the Date argument; and a value greater than 0 if this Date is after the 
        // Date argument.
        println(dt1.compareTo(dt2));
        println(dt.compareTo(dt));
        println(dt2.compareTo(dt1));
        println("---------- XXXXX ----------");
        
        // 3. public boolean after(Date when) -> 
        // When – The date to compare against. 
        // Return Value ? True if and only if the instant represented by this Date object is strictly later than the instant 
        // represented by when; false otherwise.
        println(dt2.after(dt1));
        println(dt1.after(dt));
        println(dt.after(dt1));
        println("---------- XXXXX ----------");
        
        // 4. public boolean before(Date when) ->
        // when ? a date.
        // True if and only if the instant of time represented 
        // by this Date object is strictly earlier than the instant represented by when; false otherwise.
        println(dt2.before(dt1));
        println(dt1.before(dt));
        println(dt.before(dt1));
        println("---------- XXXXX ----------");
        
        // 5. public long getTime() - The number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.
        println(dt.getTime());
        println(dt1.getTime());
        println(dt2.getTime());
        println("---------- XXXXX ----------");
        
        // 6. public void setTime(long time) - Sets this Date object to represent a point in time that is time milliseconds 
        // after January 1, 1970 00:00:00 GMT.
        dt.setTime(100000);
        dt1.setTime(100000);
        dt2.setTime(100000);
        
        println(dt.toString());
        println(dt1.toString());
        println(dt2.toString());
        println("---------- XXXXX ----------");
    }
}