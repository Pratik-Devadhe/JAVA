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

// main class

class inheritance1{


	public static void main(String[] args){
	
	// object  of the derived class B
	
		b obj1 = new b();
		
		obj1.print();		// calling the method of the derived class
		obj1.display();		// calling method of the base class using the derived class
		
		
	
	}





}
