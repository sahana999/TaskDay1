package package1;

public class Computer extends ElectronicDevices {
	private int memory;
	
	public Computer(){
		
	}
	public Computer(int pow,int mem)
	{
		super(pow,mem);
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	
}
