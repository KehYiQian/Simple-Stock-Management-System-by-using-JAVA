package Assignment;

public class WashingMachine extends Product {

	private String designMachine;
	private String spinSpeed;
	private double sizeMachine;
	private double capacityMachine;
	
	public WashingMachine (String name, double price, int quantity, int number, String designMachine, String spinSpeed, double sizeMachine, double capacityMachine )
	{
		super(name, price, quantity, number);
		this.designMachine= designMachine;
		this.spinSpeed = spinSpeed;
		this.sizeMachine = sizeMachine;
		this.capacityMachine = capacityMachine;
	}
	
	public String getDesignMachine() {
		return designMachine;
	}

	public void setDesignMachine(String designMachine) {
		this.designMachine = designMachine;
	}

	public String getSpinSpeed() {
		return spinSpeed;
	}

	public void setSpinSpeed(String spinSpeed) {
		this.spinSpeed = spinSpeed;
	}

	public double getSizeMachine() {
		return sizeMachine;
	}

	public void setSizeMachine(int sizeMachine) {
		this.sizeMachine = sizeMachine;
	}

	public double getCapacityMachine() {
		return capacityMachine;
	}

	public void setCapacityMachine(double capacityMachine) {
		this.capacityMachine = capacityMachine;
	}

	public double total_value_WMachine()
	{
		return super.getQuantity() * super.getPrice();
 	}
	
	@Override
	public String toString() {
	    return "Item number\t\t\t: " + super.getNumber() + "\n" +
	            "Product name\t\t\t: " + super.getName() + "\n" +
	            "Design\t\t\t\t: " + getDesignMachine() + "\n" +
	            "Spin speed\t\t\t: " + getSpinSpeed() + "\n" +
	            "Machine size (inches)\t: " + String.format("%.2f", getSizeMachine()) + "\n" +
	            "Capacity (in Kg)\t\t: " + String.format("%.2f", getCapacityMachine()) + "\n" +
	            "Quantity available\t\t: " + super.getQuantity() + "\n" +
	            "Price (RM)\t\t\t: " + String.format("%.2f", super.getPrice()) + "\n" +
	            "Inventory value (RM)\t: " + String.format("%.2f", total_value_WMachine()) + "\n" +
	            "Product status\t\t\t: " + (super.isStatus() ? "Active" : "Discontinued") + "\n";
	}

}
