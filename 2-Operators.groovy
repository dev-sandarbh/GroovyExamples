// Operators in Groovy
/*
** Groovy provides us with 5 Common Types of Operators. These are:-
** 		1. Arithmetic Operators -> +,-,*,/,%,++,--
**		2. Relational Operators -> ==, =>, <=, !=, >, <
** 		3. Logical Operators -> &&, ||, |
** 		4. BitWise Operators -> &, |, ^, ~
** 		5. Assignment Operators -> +=, -=, *=, /=,%=
*/

class OperatorDemo{
    // Initializing Variables
    static def a = 10, b = 2, c = 3;
    static def x = 0, y = 5, z = 100;

    public void ArithmeticDemo(){
        // Performing addition of 2 operands 
        println(a+b); 
        //Subtracts second operand from the first 
        println(a-b);
        //Multiplication of both operands 
        println(a*b);
        //Division of numerator by denominator 
        println(a/b); 
        //Modulus Operator and remainder of after an integer/float division 
        println(a%c); 
        //Incremental operator 
        println(x++); 
        //Decrementing operator 
        println(c--);
    }
    
    public void RelationalDemo(){
    if(x == y) { 
         println("x is equal to y"); 
      } else 
         println("x is not equal to y"); 
			
      if(z != y) { 
         println("z is not equal to y"); 
      } else 
         println("z is equal to y"); 
				
      if(z != y) { 
         println("z is not equal to y"); 
      } else 
         println("z is equal to y"); 
					
      if(z<y) { 
         println("z is less than y"); 
      } else 
         println("z is greater than y"); 
						
      if(x<=y) { 
         println("x is less than y"); 
      } else 
         println("x is greater than y"); 
			
      if(x>y) { 
         println("x is greater than y"); 
      } else 
         println("x is less than y"); 
			
      if(x>=y) { 
         println("x is greater or equal to y"); 
      } else 
         println("x is less than y");
    }
    
    public void LogicalDemo(){
      boolean x = true; 
      boolean y = false; 
      boolean z = true; 
		
      println(x&&y); 
      println(x&&z); 
		
      println(x||z); 
      println(x||y); 
      println(!x); 
    }

    public void BitWiseDemo(){
      int a = 00111100; 
      int b = 00001101; 
      int x;
		
      println(Integer.toBinaryString(a&b)); 
      println(Integer.toBinaryString(a|b)); 
      println(Integer.toBinaryString(a^b)); 
		
      a=~a; 
      println(Integer.toBinaryString(a));
    }
    
    public void AssignmentDemo(){
      int s = 10;
      println(s+=3);
      println(s-=3);
      println(s*=3);
      println(s/=3);
      println(s%=3);
    }
    
    static void main(String[] args){
        OperatorDemo od = new OperatorDemo();
        // Invoking Methods
        od.ArithmeticDemo();
        println("-------------- X --------------");
        od.RelationalDemo();
        println("-------------- X --------------");
        od.LogicalDemo();
        println("-------------- X --------------");
        od.BitWiseDemo();
        println("-------------- X --------------");
        od.AssignmentDemo();
    }
}