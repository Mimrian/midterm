package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		//Adding in the array list
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("Steve");
		arrList.add("Tim");
		arrList.add("Lucy");
		arrList.add("Pat");
		arrList.add("Angela");
		arrList.add("Tom");

		//Removing fromthe array list
		arrList.remove("Lucy");

		//iterating ArrayList
		for(String str:arrList)
			System.out.println(str);


	}

}
