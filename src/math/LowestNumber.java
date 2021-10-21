package math; //done

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {


	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */


		//implementation here...
		int[] arr = new int[]{24, 21, 54, 214, 324, 659, 512, 68, 20};



		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("lowest number is: " + min);

//=========================================================================
	//other way to find lowest number--------------------------------------

		System.out.println("lowest number of the arr is: " + LowestNumber.lowestNumber(arr));

	}
	public static int lowestNumber(int[] arr) {
		int lowest = Integer.MAX_VALUE;

		for (int value : arr) {
			if (lowest > value) {
				lowest = value;
			}
		}
		return lowest;


	}


}

