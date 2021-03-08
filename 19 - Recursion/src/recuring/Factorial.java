package recuring;

public class Factorial {

	public static void main(String[] args) {
		int num = 7;
		System.out.println(Integer.toString(num)+"! = " + fact(num));
	}

	public static int fact(int num) {
		if (num == 1) {
			return 1; // base case
		} else {
			return num * fact(--num);
		}
	}

}
