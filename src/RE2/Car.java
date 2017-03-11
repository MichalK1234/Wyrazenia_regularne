package RE2;

public class Car {

	private String brand;
	private String capacity;
	private String mileage;
	private String price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand.matches("[A-Z]+_")) {
			this.brand = brand;
		}

	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		if (capacity.matches("[0-9].[0-9]_")) {
			this.capacity = capacity;
		}
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		if (mileage.matches("[0-9]{0,6}_")) {
			this.mileage = mileage;
		}
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		if (price.matches("[5-9][0-9]{4,}")) {
			if (Integer.parseInt(price) > 50000) {
				this.price = price;
			}
		}

	}

	public Car() {

	}

	public Car(String brand, String capacity, String mileage, String price) {
		super();
		setBrand(brand);
		setCapacity(capacity);
		setMileage(mileage);
		setPrice(price);
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", capacity=" + capacity + ", mileage=" + mileage + ", price=" + price + "]";
	}

}
