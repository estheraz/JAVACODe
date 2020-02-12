package thiskeyword;

// key word "THIS" is a reference variable in java that refers to current object


public class thiskeyworddemo1 {
	
	int a,b; //instance variable (Data type, data value) this statement is your current object
	void getvalues(int a,int b) // This is your method variable
	{                    //use brackets for execution 
		this.a=a;
		this.b=b; 

	
	}
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);

		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// very important topic***
		//We use "this" keyword when referring to something to build code
		
		thiskeyworddemo1 th= new thiskeyworddemo1();
		th.getvalues(10,200);
		th.printValues();
		
		
	}
		
		

	}


