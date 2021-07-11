package package1;

public class ElectronicDevices {
	
	private int power;
	private int price;
	public ElectronicDevices()
	{
	}
	
	public ElectronicDevices(int pow,int pri)
	{
		this.power=pow;
		this.price=pri;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
void CalculatePower()
{
	power=power*2;
	System.out.println(power);
}
}

