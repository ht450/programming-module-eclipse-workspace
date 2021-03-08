package genericy;

public class GenericMethodTwoTypes {

	public static void main(String[] args) {

		// invoke the generic method using the alternative String and Integer
		// parameter calls
		twoTypeParameters("One", 1);
		twoTypeParameters(2, "Two");
		
	}

	public static <T, S> void twoTypeParameters(T key, S value) {
		System.out.printf("Key : %-5s Value : %-5s\n", key, value);
	}
}
