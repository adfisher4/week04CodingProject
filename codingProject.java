package Week04;

import java.util.HashMap;
import java.util.Map;

public class codingProject {

	public static void main(String[] args) {
		//1. Ages array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//1a.	
		System.out.println(ages[ages.length - 1] - ages[0]);
		//1b.
		int[] ages2 = {10, 9, 23, 64, 2, 8, 28, 93, 90};
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		
		
		//2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//2a. Getting the average name length:
		int nameSum = 0; 
		for (String name: names) {
			nameSum += name.length();
		}
		double avg = (double)Math.round(nameSum) / names.length;
		System.out.println("The average length of each name is " + avg + " letters.");
		
		//2b. concatenate all names in the Array and print.
		String allNames = "";
		for (String name: names) {
			allNames += name + " ";
		}
		System.out.println(allNames);
		
		//3 Access last element of any array by using the .length attribute minus 1.  
		// Since the index starts at 0, the last index will be one less than it's length.
		System.out.println(names[names.length-1]);
		//4 The index of the first element in any array is 0.
		System.out.println(names[0]);
		
		//5  Name lengths.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
 		}
		
		//6
		int lengthSum = 0;
		for (int length: nameLengths) {
			lengthSum += length;
		}
		System.out.println("Name length sum: " + lengthSum);
		
		//7 Method Check
		System.out.println(echo("Yo", 6));
		
		//8 Method Check
		System.out.println(fullName("Anthony", "Rizzo"));
		
		//9 Method Check
		int[] digits = {1,2,3,4,5,6,7,8};
		int[] digits2 = {10,20,30,40,50};
		System.out.println(sumCheck(digits));
		System.out.println(sumCheck(digits2));
		
		//10 Method Check
		double[] nums = {2.0, 2.5, 3.0, 9.5};
		System.out.println(getAvg(nums));
		
		//11 Method Check
		double[] nums2 = {20.5, 35.2, 29.1, 10};
		System.out.println(firstArrIsGreater(nums2, nums));
		
		//12 Method Check
		System.out.println("Will buy a drink:");
		System.out.println(willBuyDrink(false, 11));
		System.out.println(willBuyDrink(true, 10));
		System.out.println(willBuyDrink(true, 11));
		
		//13 Counting Votes check
		String[] votes = {"Bob", "Betty", "Betty", "Betty", "Bob", "Joe", "Betty"};
		countVotes(votes);
		
	}
	
	
	
	//**** METHODS ****//
	//7
	public static String echo (String word, int num) {
		String echoWord = "";
		for (int i = 0; i < num; i++) {
			echoWord += word;
		}
		return echoWord;
	}
	
	// 8 
	public static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	// 9
	public static boolean sumCheck (int[] nums) {
		int sum = 0;
		for (int num: nums) {
			sum += num;
		}
		return sum > 100;
	}
	
	// 10. Write a method that takes an array of double and returns the average of all the elements in the array
	
	public static double getAvg (double[] numbers) {
		double sum = 0.0;
		for (double num: numbers) {
			sum += num;
		}
		double avg = sum / numbers.length;
		return avg;
	}
	
	// Method 11. Used the method above to get the averages of each array.
	public static boolean firstArrIsGreater (double[] nums1, double[] nums2) {
		return getAvg(nums1) > getAvg(nums2);
	}
	// Method 12.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket >= 10.5) {
			return true;
		}
		return false;
	}

	// Method 13.
	public static void countVotes (String[] votes) {
		Map<String, Integer> votesMap = new HashMap<String, Integer>();
		
		for (String vote: votes) {
			if (votesMap.containsKey(vote)) {
				votesMap.compute(vote, (k, v) -> v + 1);
				
			} else {
				votesMap.put(vote, 1);
			}
		}
		System.out.println();
		System.out.println("---- The Votes Are In ----");
		for (String i : votesMap.keySet()) {
			System.out.println(i + ": " + votesMap.get(i));
		}
	}
	
	
	
	
	
	

}
