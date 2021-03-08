/**
 * 
 */
package polymo.lecture;

/**
 * @author Hugh
 *
 */
public class ZooKeeper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.makeNoise();
		
		Lion l1 = new Lion();
		l1.makeNoise();
		
		Dog d1 = new Dog();
		d1.makeNoise();
		
		Monkey m1 = new Monkey();
		
		// via specific method calls
		makeAnimalNoise(a1);
		makeDogNoise(d1);
		makeLionNoise(l1);
		
		// via general method calls
		makeAnimalNoise(d1);
		makeAnimalNoise(l1);
		makeAnimalNoise(m1);
		
	}

	/**
	 * general method to deal with any animal
	 * @param animal
	 */
	public static void makeAnimalNoise(Animal animal) {
		animal.makeNoise();
	}
	
	public static void makeDogNoise(Dog dog) {
		dog.makeNoise();
	}
	
	public static void makeLionNoise(Lion lion) {
		lion.makeNoise();
	}
}
