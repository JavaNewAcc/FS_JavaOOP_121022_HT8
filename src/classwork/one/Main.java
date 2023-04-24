package classwork.one;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Luska", 8);
		Cat cat2 = new Cat("Luska", 8);

		System.out.println(cat1.toString());
		System.out.println(cat1 == cat2);
		System.out.println(cat1.equals(cat2));
		System.out.println(cat1.hashCode());
		System.out.println(cat2.hashCode());

		System.out.println("===============");

		Cat cat3 = null;
		try {
			cat3 = cat1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(cat1 != cat3);
		System.out.println(cat1.getClass());
		System.out.println(cat3.getClass());
		System.out.println(cat1.equals(cat3));
		System.out.println(cat3);

		System.out.println("===============");

		Class catClass = Cat.class;

		Field[] fields = catClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		System.out.println("===============");

		Method[] methods = catClass.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		System.out.println("===============");
		try {
			Field catAge = catClass.getDeclaredField("age");
			catAge.setAccessible(true);
			try {
				catAge.setInt(cat1, 10);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		System.out.println(cat1);
	}
}