// class addTheNumbers for addition   of the numbers
class addTheNumbers{

	void add(int a , int b){
	
		System.out.println("the sum of two numbers is : " + (a + b));
	
	}

	void add(int a , int b , int c){
	
		System.out.println("the sum of three numbers is : " + (a + b + c));
	
	}


}

//  main  class 

class functionOverloding {

public static void main(String a1[]){


	addTheNumbers a = new addTheNumbers(); // creation of the object of addTheNumbers class 
	
	 //  calling the methods
	a.add(2 , 5);
	a.add(5 , 36 , 8);




}


}
