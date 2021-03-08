package boxer;

public class BoxFactory {

	public static void main(String[] args) {
		
		StringBox sb = new StringBox();
		sb.setContent("Aidan");
		
		ObjectBox ob = new ObjectBox();
		ob.setContent("Me Again");
		
		// the compiler lets you do this (error at runtime)
		// Integer i = (Integer) ob.getContent();
		// generics helps fix this problem
		
		GenBox<String> genBoxStr = new GenBox<String>();
		genBoxStr.setContent("A string");
		
		// won't compile
		// Integer i = (Integer) genBoxStr.getContent();
		
		GenBox<Integer> genBoxInt = new GenBox<Integer>();
		genBoxInt.setContent(3434);
		
		// same type, so we're grand
		// Integer i = (Integer) genBoxInt.getContent();
		
		
	}
}
