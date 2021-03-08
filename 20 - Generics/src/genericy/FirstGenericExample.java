package genericy;

public class FirstGenericExample {

	public static void main(String[] args) {
		
		String[] strings = {"Hugh", "Aidan"};
		Character[] chars = {'a','b','c'};
		Integer[] ints = {1,2,3,4};
		
		printAll(strings);
		printAll(chars);
		printAll(ints);
		
	}
	
	public static <T> void printAll(T[] myArray) {
		for (T t : myArray) {
			System.out.println(t);
		}
	}
	
}
