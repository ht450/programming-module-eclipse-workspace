package challenge1;

public class Q2 {

	public static void main(String[] args) {

		int value = 9;

		System.out.println(value++ + 9 + --value + doIt(value) - value--);

		System.out.println(value);
	}

	private static int doIt(int value) {
		return value * value;
	}
}
