// Decision Making in Groovy

class DecisionMaking{
    public void ifDemo(){
        // Initializing a Local Variable
        int a = 25;
        
        // Checking if a is a multiple of 5 or not
        if(a % 5 == 0){
            // this block executes only if condition is met
            println("Condition is Met. It is true that 25 is Multiple of 5...");
        }
    }
    
    public void ifElseDemo(){
        // Initializing a Local Variable
        int a = 25;
        
        // Checking if a is a multiple of 5 or not
        if(a % 5 == 0){
            // this block executes only if condition is met
            println("Condition is Met. It is true that 25 is Multiple of 5...");
        }else{
            // this block runs only when if-condition is false or not met...
            println("Condition is not met. It is false.");
        }
    }
    
    public void nestedIfDemo(){
    // Initializing a Local Variable
        int a = 26;
        
        // Checking if a is greater than or equal to 10.
        if(a >= 10){
            // another if to check if a is a multiple of 5 and/or 25.
            //if(a%5==0 || a%25==0){
            if(a%5==0 && a%25==0){
                println("Condition is Met. It is true that 25 is Multiple of 5...");
            }
            else{
                println("No Condition is met. So it is False....");
            }
        }
        else{
            println("No condition is met.");
        }
    }
    
    public void switchDemo(){
        int month = 2;
        
        // Evaluating expression value
        switch(month){
            // Case Statement is used to check value of expression.
            // Break Statement is used for coming out of loop when the condition is met.
            // Default Statement is used for non-matched expressions. 
            case 1:
                println("Month is January");
                break;
            case 2:
                println("Month is February");
                break;
            case 3:
                println("Month is March");
                break;
            case 4:
                println("Month is April");
                break;
            case 5:
                println("Month is May");
                break;
            case 6:
                println("Month is June");
                break;
            case 7:
                println("Month is July");
                break;
            case 8:
                println("Month is August");
                break;
            case 9:
                println("Month is September");
                break;
            case 10:
                println("Month is October");
                break;
            case 11:
                println("Month is November");
                break;
            case 12:
                println("Month is December");
                break;    
            default:
                println("Sorry, You enterd Wrong Month Number. Please check that you enter a Correct Month Number.");
                break;
        }
    }
    
    static void main(String[] args){
        DecisionMaking dm = new DecisionMaking();
        
        // Invoking Methods
        dm.ifDemo();
        println("-------------- X --------------");                                                                                                                                                                                                          
        dm.ifElseDemo();
        println("-------------- X --------------");
        dm.nestedIfDemo();
        println("-------------- X --------------");
        dm.switchDemo();
        println("-------------- X --------------");
    }
}