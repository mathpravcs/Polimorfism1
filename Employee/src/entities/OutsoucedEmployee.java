package entities;

public class OutsoucedEmployee extends Employee {

	private Double addtionalCharge;

	public OutsoucedEmployee() {
		super();
	}

	public OutsoucedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge;
	}

	public Double getAddtionalCharge() {
		return addtionalCharge;
	}

	public void setAddtionalCharge(Double addtionalCharge) {
		this.addtionalCharge = addtionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + addtionalCharge * 1.1;
	}

}
