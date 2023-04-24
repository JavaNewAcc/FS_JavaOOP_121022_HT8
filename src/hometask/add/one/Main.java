package hometask.add.one;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("Porsche", "911 Turbo S", 1, 3.8);
		Car car2 = new Car("BMW", "540i", 3, 4.4);
		Car car3 = new Car("Audi", "RS6", 5, 4.0);
		Car car4 = new Car("Tesla", "Model X", 1, 0);

		Cat cat1 = new Cat("Bob", 5);
		Cat cat2 = new Cat("Lili", 3);
		Cat cat3 = new Cat("Gosha", 1);
		Cat cat4 = new Cat("Kitty", 2);

		String string1 = "Karamba";
		String string2 = "Hello World";
		String string3 = "OK";
		String string4 = "Push 123";

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;

		double dbl1 = 1.1;
		double dbl2 = 2.2;
		double dbl3 = 3.3;
		double dbl4 = 4.4;

		Stack stack1 = new Stack();
		
		stack1.push(car1);
		stack1.push(cat1);
		stack1.push(num1);
		stack1.push(dbl1);
		stack1.push(car2);
		stack1.push(cat2);
		stack1.push(num2);
		stack1.push(dbl2);

		stack1.pop();
		stack1.pop();

		System.out.println(stack1.peek());

		System.out.println(stack1.toString());
	}
}