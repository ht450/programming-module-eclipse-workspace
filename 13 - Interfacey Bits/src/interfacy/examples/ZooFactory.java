/**
 * 
 */
package interfacy.examples;

/**
 * @author Hugh
 *
 */
public class ZooFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.move();

		Cat cat = new Cat();
		cat.eat();
		cat.move();

	}

}
