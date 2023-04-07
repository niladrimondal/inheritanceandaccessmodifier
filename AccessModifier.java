package inheritanceexample;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Dzire",355000);
		
		System.out.println("name:"+c.getName());
		System.out.println("name:"+c.getPrice());
		
		Fruit c1 = new Fruit();
		
		System.out.println("name:"+c1.name);
		System.out.println("name:"+c1.price);

	}
}
	//Access Modifiers public,default, private, protected
	class Car{
		private String name;
		private double price; 
		//parametarized constructor
		public Car(String name, double price) {
			this.setName(name);
			this.setPrice(price);
		}
		
		//nonparametarized constructor
		public Car() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		
	}
