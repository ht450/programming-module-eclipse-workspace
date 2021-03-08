/**
 * 
 */
package whatdoesthefoxsay.exercise;

/**
 * @author Hugh
 *
 */
public class RunLyrics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal dog = new Animal("Dog", "Woof");
		Animal cat = new Animal("Cat","Meow");
		Animal bird = new Animal("Bird", "Tweet");
		Animal mouse = new Animal("Mouse","Squeak");
		Animal fox = new Animal("Fox", "???", "BLUE", "POINTY", "TINY", "RED");
		
		// song lyrics
		dog.makeNoise();
		cat.makeNoise();
		bird.makeNoise();
		mouse.makeNoise();
		
		System.out.println("But there's one sound that no one knows...");
		ringDingBit();
		
		System.out.println("Big "+fox.getEyeColor()+" eyes");
		System.out.println(fox.getNoseType()+" nose");
		System.out.println(fox.getPawSize()+" paws");
		System.out.println("your fur is "+fox.getFurColour());
		ringDingBit();
		
	}
	
	/**
	 * method that prints the repetitive ring-ding part of the song that starts with "What does the fox say?"
	 */
	private static void ringDingBit() {
		System.out.println("WHAT DOES THE FOX SAY?");
		System.out.println("Ring-ding-ding-ding-dingeringeding!");
		System.out.println("Ring-ding-ding-ding-dingeringeding!");
		System.out.println("Ring-ding-ding-ding-dingeringeding!");
		System.out.println();
	}
}//class
