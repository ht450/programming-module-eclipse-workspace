package challenge2;

public class Q3 {

	public static void main(String[] args) {
		
		String planetName;
		int planetNumber;
		
		planetNumber = 3;
		
		switch (planetNumber) {
		case 1:
			planetName = "Mercury";
			break;
		case 2:
			planetName = "Venus";
			break;
		case 3:
			planetName = "Earth";
			break;
		case 4:
			planetName = "Mars";
			break;
		case 5:
			planetName = "Jupiter";
			break;
		case 6:
			planetName = "Saturn";
			break;
		case 7:
			planetName = "Uranus";
			break;
		case 8:
			planetName = "Neptune";
			break;
		default:
			planetName = "Invalid Number";
			break;
		}
		System.out.println(planetName);
		
	}
	
}
