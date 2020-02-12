package oops;

public class constructor {

int sid;
String sname;
char grade;


	constructor(int id, String name, char g){
	
	sid=id;
	sname=name;
	grade=g;
}
void display()
{
	System.out.println(sid+" "+sname+" "+grade);
	
}
}


