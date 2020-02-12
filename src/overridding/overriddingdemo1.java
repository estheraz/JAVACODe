package overridding;
// its about banking
class bank   
{
	double rateofinterest() // rateofinterest represents your data type
	{
		return 0;  //this is just your parent class so 0 value
		
	}
}
class citi extends bank
{
	double rateofinterest()
	{
		return 10.5;
	}
}

class bofa extends bank
{
	double rateofinterest()
	{
		return 5.5;
	}
}

class cp1 extends bank
{
	double rateofinterest()
	{
		return 22.5;
	}
}
public class overriddingdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

citi ci=new citi();
System.out.println(ci.rateofinterest());

bofa bo=new bofa();
System.out.println(bo.rateofinterest());

cp1 cp=new cp1();
System.out.println(cp.rateofinterest());

		
		
	}

}
