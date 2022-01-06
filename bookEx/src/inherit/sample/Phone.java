package inherit.sample;

public class Phone {
	private String model;
	private String number;
	
	public Phone() {}
	
	public Phone(String model, String number) {
		super();
		this.model = model;
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
