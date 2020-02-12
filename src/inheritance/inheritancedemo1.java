package inheritance;

class A // parent class

{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

// when you move on to the next class you have to say that you are extending the parent class
class B extends A //B is child class, A is parent
{
	int b;
	void print() {
		System.out.println(b);
		
	}
}

public class inheritancedemo1 {
// class will always be independent so you wont put "class" in between brackets

public static void main(String[] args) {
		//values go here
	A aobj=new A();
	aobj.a=100;
	aobj.display();
	
	B bobj=new B();
	bobj.b=200;
	bobj.a=100;
	
	bobj.display();
	bobj.print();
	

	}

}
