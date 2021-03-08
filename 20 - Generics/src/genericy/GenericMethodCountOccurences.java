package genericy;

public class GenericMethodCountOccurences {

	public static void main(String[] args) {
		
		Integer[] numbers = {3,4,5,6,12,1,12,18};
		String[] string = {"3","4","5","6","12","1","12","18","12"};
		
		System.out.println("Occurences of 12 (Integer array) : "+countOccurrences(numbers,12));
		System.out.println("Occurences of 12 (String array) : "+countOccurrences(string,"12"));
		
	}

	private static <T> int countOccurrences(T[] list, T itemToCount) {
		int count = 0;
		for (T listItem : list) {
			if (itemToCount.equals(listItem)) {
				count++;
			}
		}
		return count;
	}
	
	
}
