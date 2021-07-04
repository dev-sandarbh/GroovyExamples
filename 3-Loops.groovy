// Loops in Groovy
class LoopsDemo{
    public void whileDemo(){
        int count = 0;
        while(count<=10){
            println("Value of Count = "+count.toString());
            count++;
        }
    }
    
    public void forDemo(){
        for(int i = 0; i <= 10; i++){
            println("Value of Count = "+i.toString());
        }
    }
    
    public void forInDemo(){
        int[] array = [1,2,3,4,5,6,7,8,9,10];
        for(int i in array){
            if(i % 2 ==0){
                println("Value of Even Count = "+i.toString());
            }
            else{
                println("Value of Odd Count = "+i.toString());
            }
        }
    }
    
    public void breakDemo(){
        int[] array = [1,2,3,4,5,6,7,8,9,10];
        for(int i in array){
            if(i % 2 ==0){
                println("Value of Even Count = "+i.toString());
                if(i == 8)
                break;    // since we want to print even numbers only till 8
            }
            else{
                println("Value of Odd Count = "+i.toString());
            }
        }
    }
    
    public void continueDemo(){
        int[] array = [1,2,3,4,5,6,7,8,9,10];
        for(int i in array){
            if(i % 2 ==0){
                println("Value of Even Count = "+i.toString());
                if(i == 8)
                continue;    // since we want to leave the even number 8, thus here we used continue so that it jumps this iteration
            }
            else{
                println("Value of Odd Count = "+i.toString());
            }
        }
    }

    static void main(String[] args){
        // Invoking Methods
        LoopsDemo ld = new LoopsDemo();
        ld.whileDemo();
        println("-------------------- XXXXX --------------------");
        ld.forDemo();
        println("-------------------- XXXXX --------------------");
        ld.forInDemo();
        println("-------------------- XXXXX --------------------");
        ld.breakDemo();
        println("-------------------- XXXXX --------------------");
        ld.continueDemo();
    }
}