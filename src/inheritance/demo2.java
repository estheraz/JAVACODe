package inheritance; // very IMPORTANT TOPIC // always say its child and parent concept

class A // parent class
{
int a;
void display()
{
	System.out.println(a);
	
}
{
class B extends  A //B class is child
}
	int b;
	void print()
	{
		System.out.println(b);
	}
	
	}

class C extends B  // every class after the parent class connects to the previous child
{
	int c;
	void show()
	{
		System.out.println(c);
		
	}
}

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// values always go here
		C cobj=new C();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
							//display,print and show are used for the method
		cobj.display();
		cobj.print();
		cobj.show();
		
		
		
		
		
	}

}
