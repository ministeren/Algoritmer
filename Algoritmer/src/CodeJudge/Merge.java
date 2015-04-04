package CodeJudge;

import java.io.*;
import java.util.*;

public class Merge
{
	// This method takes two sorted arrays of integers as input parameters
	// and it should return one sorted array of integers.
	private int[] merge(int[] a1, int[] a2) {
		// TODO: Implement this
		int[] merged = new int[a1.length+a2.length];
		int mark = 0, a1mark = 0, a2mark = 0;

		while(mark<merged.length){			
			if(a1mark<a1.length && a2mark<a2.length){
				if(a1[a1mark]<=a2[a2mark]){
					merged[mark] = a1[a1mark];
					a1mark++;
				}else if(a1[a1mark]>a2[a2mark]){
					merged[mark] = a2[a2mark];
					a2mark++;
				}
			} else if(a1mark==a1.length){
				merged[mark] = a2[a2mark];
				a2mark++;
			} else if(a2mark==a2.length){
				merged[mark] = a1[a1mark];
				a1mark++;
			}
			mark++;
		}
		return merged;
	}

	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new Merge().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Read numbers for first array
		int[] A1 = readIntArray(in);
		// Read numbers for second array
		int[] A2 = readIntArray(in);

		// Call merge method to merge the two arrays
		int[] solution = merge(A1, A2);

		// Output the result from the merge function
		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i] + " ");
		}
	}

	private int[] readIntArray(BufferedReader in) throws IOException {
		// First read length of input data
		int length = Integer.parseInt(in.readLine());

		// Now read the actual values
		int[] array = new int[length];
		StringTokenizer st = new StringTokenizer(in.readLine());

		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}

		return array;
	}
}