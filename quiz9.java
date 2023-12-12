package week8;

public class quiz9 {
	public static void main(String[] args) {
		  String name = "John";
		  System.out.println(name);
		  addLastName(name, "Smith");
		  System.out.println(name);
		}

		public static void addLastName(String name, String lastName) {
		  name = name + " " + lastName;
		  System.out.println(name);
		}
}
