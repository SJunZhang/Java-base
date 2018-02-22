package ClassLoader;

public class Car {

	private String color;
	private String brand;
	private double price;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public void buy() {
		System.out.println("i will buy this car.");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
