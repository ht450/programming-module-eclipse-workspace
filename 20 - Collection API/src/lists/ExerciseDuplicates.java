package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExerciseDuplicates {

	public static void main(String[] args) {

		ArrayList<Integer> intArrayL = new ArrayList<Integer>();
		intArrayL.add(12);
		intArrayL.add(34);
		intArrayL.add(1);
		intArrayL.add(67);
		intArrayL.add(34);
		System.out.println(intArrayL.toString());

		LinkedList<Integer> intLinkL = new LinkedList<Integer>();
		intLinkL.add(34);
		intLinkL.add(2);
		System.out.println(intLinkL.toString());

		removeDuplicates(intArrayL, intLinkL);
		
		System.out.println(intArrayL);
	}

	public static void removeDuplicates(List<Integer> originalList, List<Integer> listToRemoved) {
		originalList.removeAll(listToRemoved);
	}

}
