package hometask.add.one;

public class Car {
	private String make;
	private String model;
	private int age;
	private double displacement;

	public Car() {
		super();
	}

	public Car(String make, String model, int age, double displacement) {
		super();
		this.make = make;
		this.model = model;
		this.age = age;
		this.displacement = displacement;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getDisplacement() {
		return displacement;
	}

	public void setDisplacement(double displacement) {
		this.displacement = displacement;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", age=" + age + ", displacement=" + displacement + "]";
	}

}
