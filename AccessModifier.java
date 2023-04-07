package inheritanceexample;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Tiago",355000);
		System.out.println("name:"+c.getName());
		System.out.println("Price:"+c.getPrice());
		
		Car c1 = new Car();
		System.out.println("name:"+c1.getName());
		System.out.println("Price:"+c1.getPrice());
		
		Swift swift = new Swift("Red", "Swift Dzire", 400000);
		System.out.println("name:"+swift.getName());
		System.out.println("Price:"+swift.getPrice());
		System.out.println("Color:"+swift.color);
		
		
		

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
	//inheritence example
	class Swift extends Car{
		String color ="sky blue";
		
		public Swift(String color, String name, double price) {
			super(name,price);
			this.color=color;
			
		}
	}
