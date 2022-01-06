package inherit.sample;

public class IPhone extends Phone {
	private int memorySize;

	public IPhone() {}

	public IPhone(String model, String number, int memorySize) {
		super(model, number);
		this.memorySize = memorySize;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	
	
	
}
