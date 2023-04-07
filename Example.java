package inheritanceexample;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit("apple",150);
		
		System.out.println("name:"+f.name);
		System.out.println("name:"+f.price);
		
		Fruit f1 = new Fruit();
		
		System.out.println("name:"+f1.name);
		System.out.println("name:"+f1.price);

	}
}
	
	class Fruit{
		String name;
		double price; 
		//parametarized constructor
		public Fruit(String name, double price) {
			this.name=name;
			this.price=price;
		}
		
		//nonparametarized constructor
		public Fruit() {
		}
		
	}


