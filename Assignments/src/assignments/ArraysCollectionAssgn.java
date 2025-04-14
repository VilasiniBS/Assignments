package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class ArraysCollectionAssgn {



	public static void main(String[] args) {


		/***Create the area of cities***/
		ArrayList<Integer> AreaofCities= new ArrayList<Integer>();
		AreaofCities.add(741);
		AreaofCities.add(603);
		AreaofCities.add(1483);
		AreaofCities.add(605);
		AreaofCities.add(206);

		System.out.println("Total No of area 3 and 4 is " + (AreaofCities.get(3)+AreaofCities.get(4)));

		/****Set of tourist top 10 places****/
		Set<String> TouristPlace = new HashSet<String>();
		TouristPlace.add("Mysore Palace");
		TouristPlace.add("Tajmahal");
		TouristPlace.add("belur halebidu");
		TouristPlace.add("Hampi");
		TouristPlace.add("Bengaluru vidhanasoda");
		TouristPlace.add("charminar");
		TouristPlace.add("tirupathi");
		TouristPlace.add("coorg");
		TouristPlace.add("pondicherry");
		TouristPlace.add("Delhi");
		System.out.println("All tourist places are : " + TouristPlace );
		System.out.println("Size of the All tourist place is : " + TouristPlace.size());



		/*****Set of Top 10 Tourist****/
		int[] number= new int[10];
		number[0]= 1;
		number[1]=5;
		number[2]=4;
		number[3]=11;
		number[4]=8;
		number[5]=6;
		number[6]=12;
		number[7]=7;
		number[8]=13;
		number[9]=22;
		System.out.println("Average of 5th and 6th is : " + ((number[5]+number[6])/2));


		/*****List of Top 5	highest grossing movies*****/

		ArrayList<String> Movies = new ArrayList<String>();
		Movies.add("KGF1");	
		Movies.add("Bahubali");
		Movies.add("RRR");
		Movies.add("KGF2");
		Movies.add("Dangal");

		System.out.println("Third movie of the list is : " + Movies.get(3));

	}


}

