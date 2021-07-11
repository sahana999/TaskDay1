package package1;

public class Mainclass {
	
	public static void main(String args[])
	{
		 ElectronicDevices c=new Computer(50,8);
		 
		 ElectronicDevices e=new  Laptop(60,5000);
		 
		 ElectronicDevices digi= new digitalCamera(20,1000);
		 
		WashingMachine wm=new WashingMachine(60,8);
		
		Mobilephone mp=new Mobilephone(11,2000);
		
		TV tv=new TV(20,30000);
		
        AC ac=new AC(30,5000);
       
        c.CalculatePower();
		System.out.println("The power of Computer is"+" "+c.getPower());
		
		e.CalculatePower();
		System.out.println("The power of Laptop  is"+" "+e.getPower());
		
		digi.CalculatePower();
		System.out.println("The power of digitalcamera is"+" "+digi.getPower());
		
		wm.CalculatePower();
		System.out.println("The power of WashingMachine is"+" "+wm.getPower());
		
		mp.CalculatePower();
		System.out.println("The power of MobilePhone is"+" "+mp.getPower());
		
		tv.CalculatePower();
		System.out.println("The power of TV is"+" "+tv.getPower());
        
        
        
		ac.CalculatePower();
		System.out.println("The power of ac is"+" "+ac.getPower());
        
        }
}