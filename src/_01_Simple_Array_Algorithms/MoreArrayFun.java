package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	static String arr[] = {"print", "string", "test"};
	static String rra[] = {"1", "2", "3", "4", "5"};
	static String ara[] = {"one", "two", "three", "four", "five"};
	static String rar[] = {"a", "b", "c", "d", "e"};
	public static void main(String[] args) {
		printStringArray(arr);
		printStringReverse(rra);
		printCertainString(ara);
		printStringRandom(rar);
	}
		
    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
		public static void printStringArray (String[] values) {
			for (int i=0; i<values.length; i++) {
				System.out.println(values[i]);
			}
		}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
		public static void printStringReverse (String[] values) {
			for (int i=values.length-1; i>-1; i--) {
				System.out.println(values[i]);
			}
		}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
		public static void printCertainString (String[] values) {
			for (int i=0; i<values.length; i++) {
				if (i%2 == 0) {
				System.out.println(values[i]);
			}
		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
		public static void printStringRandom (String[] values) {
			Random rand = new Random();
			for (int i=0; i<values.length; i++) {
				int stringNum = rand.nextInt(values.length);
				System.out.println(values[stringNum]);
			}
		}
	}
