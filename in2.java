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


// derived class c from a

class c extends a{


	void display1(){
	
		System.out.println("This is derived class c from a");
	
	}


}

// main class

class in2{


	public static void main(String[] args){
	
	// object  of the derived class B
	
		b obj1 = new b();
		
		obj1.print();		// calling the method of the derived class
		obj1.display();		// calling method of the base class using the derived class
		
		
		c obj2 = new c();
		
		
		obj2.display1();		// calling the method of the derived class
		obj2.display();  		// calling method of the base class using the derived class
	
	}





}
