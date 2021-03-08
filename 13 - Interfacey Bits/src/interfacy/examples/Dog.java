/**
 * 
 */
package interfacy.examples;

/**
 * @author Hugh
 *
 */
public class Dog implements IAnimal {

	@Override
	public void eat() {
		System.out.println("Eats cats");
	}

	@Override
	public void move() {
		System.out.println("Chases cats");
	}
	
	
	
	
}
