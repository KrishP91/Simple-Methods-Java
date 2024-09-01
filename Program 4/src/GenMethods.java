//@author
//Author: Krish Patel

import java.awt.*;

import java.util.*;

public class GenMethods {
	
	public GenMethods() {
		
	}
	
	public String getIdentificationString() {
		return "Program 4, Krish Patel";
		
	}
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		int n = scnr.nextInt();
		Integer[] list = new Integer[n];
		LinkedList<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			Integer x = scnr.nextInt();
			list[i] = x;
			linked.add(list[i]);
		}
		
		System.out.println(Arrays.toString(list));
		System.out.println(linked);
		
		int k = scnr.nextInt();
		int linInt = linearSearch(list, k);
		if (linInt == -1){
			System.out.println("Key " + k + " was not found");
		}
		else {
			System.out.println("Key " + k + " was found at position " + linInt);
			
		}
		
		System.out.println((max(list) + " is the max element"));

		int m = scnr.nextInt();
		int p = scnr.nextInt();
		Integer[][] list2 = new Integer[m][p];
		
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2[i].length; j++) {
				list2[i][j] = scnr.nextInt();
			}
		}
		
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2[i].length; j++) {
				System.out.print(list2[i][j] + " ");
			}
			System.out.println();

		}
		
		System.out.println(max(list2) + " is the max element");
		
		ArrayList<Integer> alist = new ArrayList<Integer>(linked);
		System.out.println(alist);
		
		alist = removeDuplicates(alist);
		System.out.println(alist);
		
		shuffle(alist);
		System.out.println(alist);
		
		System.out.println(max(list) + " is the max element");
		
		scnr.close();
		
	}
		
	
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> myList = new ArrayList<E>(list.size());
		
		for (E org : list) {
			if (!myList.contains(org)) {
				myList.add(org);
			}
		
			}
		 return myList;
		}
		
	public static <E> void shuffle(ArrayList<E> list) {
		Random rand = new Random(340L);

		for (int i = 0; i < 30; i++) {
			int rand1 = rand.nextInt(list.size());
			int rand2 = rand.nextInt(list.size());
			Collections.swap(list, rand1, rand2);
		}
	}
	
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E maxElement = Collections.max(list);
		return maxElement;
	}

	public static <E extends Comparable<E>> int linearSearch(E[] list, E k) {
		int myInt = -1;
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(k)) {
				myInt = i;
				break;
			}
		}
		return myInt;
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		E maxElement = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(maxElement) > 0) {
				maxElement = list[i];
			}
		}
		return maxElement;
	}
	
	public static <E extends Comparable<E>> E max(E[][] list) {
		E maxElement = list[0][0];
		for (int i = 0; i < list.length; i++) {
			for (int y = 0; y < list[i].length; y++) {
				if (list[i][y].compareTo(maxElement) > 0) {
					maxElement = list[i][y];
				}
			}
		}
		return maxElement;
		
	}
	
	




	
}



