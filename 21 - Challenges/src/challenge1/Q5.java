package challenge1;

public class Q5 {

	public static void main(String[] args) {

		bingBong();

	}
	
	public static void bingBong() {

		for (int loop = 1; loop < 20; loop++) {

			if (loop % 3 == 0 && loop % 5 == 0) {
				System.out.println("Bing Bong");
			} else if (loop % 3 == 0) {
				System.out.println("Bing");
			} else if (loop % 5 == 0) {
				System.out.println("Bong");
			} else {
				System.out.println(loop);
			}
		}

	}
}
