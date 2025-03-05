// base class a;
class a{

	void display(){
	
		System.out.println("This is base class A");
	}

}

// derived class b from a;

class b extends a{

	void print(){
	
		System.out.println("This id derived class B from class A");
	
	}

}

class c extends  b{

	void display1(){
	
		System.out.println("This is derived class c from already derived class b");
	
	}


}







// main class

class multilevel{


	public static void main(String[] args){
	
	// object  of the derived class B
	
		c obj1 = new c();
		
		obj1.print();		// calling the method of the  parent derived class
		obj1.display();		// calling method of the base class using the class c
		obj1.display1();
		
		
	
	}

}
