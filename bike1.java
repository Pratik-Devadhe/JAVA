
public class bike1{
	
	int a , b;
	 
	 // default constructor
	 
	bike1(){
		
		System.out.println("Default constructor is called");
	
	}
	
	// parameterised constructor
	
	bike1(int a1 , int  b1){
	
		a = a1;
		b = b1;
		
	}
	
	void sum(){
	
		System.out.println(" the sum is :" + (a + b));	

	}
 
 public static void main(String a[]){
 
 
  	 //  default constructor
  	 
	bike1 b = new bike1();
	
	// parameterised constructor
	bike1 a1 = new bike1(2 , 8);
	
	// calling method
	a1.sum();
 
 }

}
