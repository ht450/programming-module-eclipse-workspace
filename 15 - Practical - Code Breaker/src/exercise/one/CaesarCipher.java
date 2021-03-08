/**
 * 
 */
package exercise.one;

/**
 * @author Hugh
 *
 */
public class CaesarCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(encrypt("Aidan", 3));
		System.out.println(decrypt("Neze", 4));
		
		String message = "Jfy%Xqjju%Of{f%Wjujfy%2%gj%knwxy%yt%jrfnq%ymfy%yt%Fnifs%yt%|ns";
		// key is 5
		for (int loop=1; loop<=10; loop++) {
			System.out.println(loop+": "+decrypt(message, loop));
		}
		
		
	}

	public static String encrypt(String original, int key) {
		String encrypted = "";
		if (key < 1 || key > 10) {
			System.err.println("Key is out of range. must be in range 1-10");
		} else {
			for (char character : original.toCharArray()) {
				//encrypted.concat(Character.toString((char) (character + key)));
				// .concat doesn't work if the string is empty (so the first iteration here won't work)
				encrypted += (Character.toString((char) (character + key)));
			}
		}
		return encrypted;
	}

	public static String decrypt(String encrypted, int key) {
		String decrypted = "";
		if (key < 1 || key > 10) {
			System.err.println("Key is out of range. must be in range 1-10");
		} else {
			for (char character : encrypted.toCharArray()) {
				// .concat doesn't work if the string is empty (so the first iteration here won't work)
				decrypted += (Character.toString((char) (character - key)));
				
			}
		}
		return decrypted;
	}

}
