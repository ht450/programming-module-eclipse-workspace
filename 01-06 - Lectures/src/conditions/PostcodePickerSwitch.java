package conditions ;

public class PostcodePickerSwitch {

	public static void main(String[] args) {
		String place, postcode;
		
		// pick a place you want to know the postcode of
		place = "South Armagh";

		switch(place) {
			case "South Down" :
				postcode = "BT34";
				break;
			case "South Armagh" :
				postcode = "BT35";
				break;
			case "Mid Armagh" :
				postcode = "BT60";
				break;
			default:
				postcode = "unknown";
		}
		System.out.println("Postcode is "+postcode);
		
	}

}