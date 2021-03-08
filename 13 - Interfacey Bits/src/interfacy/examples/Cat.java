/**
 * 
 */
package interfacy.examples;

/**
 * @author Hugh
 *
 */
public class Cat implements IAnimal {

	@Override
	public void eat() {
		System.out.println("Eats mice");
	}

	@Override
	public void move() {
		System.out.println("Run from dogs");
	}

}
