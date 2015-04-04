package CodeJudge;

import java.io.*;
import java.util.*;

public class MergeSort
{
	// This method takes an array of integers as input parameter,
	// and it should then return the integers sorted
	// in ascending order using the MergeSort algorithm.
	private int[] sort(int[] numbers) {
		// TODO: Implement this
		mergesort(numbers);
		return numbers;
	}
	
	private void mergesort(int[] a){		
		int m = (int) a.length/2; 
		if(a.length>1){
			int[] left = new int[m];
			int[] right = new int[a.length-m];
			for(int i=0;i<m;i++){
				left[i]=a[i];
			}
			for(int j=m;j<a.length;j++){
				right[j-m]=a[j];
			}
//			int[] left = Arrays.copyOfRange(a, 0, m);
//          int[] right = Arrays.copyOfRange(a,m,a.length);
			mergesort(left);
			mergesort(right);
			merge(left,right, a);
		}
		
	}
	
	private void merge(int[] a1, int[] a2, int[] a) {
		// TODO: Implement this
		int mergL = a1.length+a2.length;
		int mark = 0, a1mark = 0, a2mark = 0;

		while(mark<mergL){
			if(a1mark<a1.length && a2mark<a2.length){
				if(a1[a1mark]<=a2[a2mark]){
					a[mark] = a1[a1mark];
					a1mark++;
				}else if(a1[a1mark]>a2[a2mark]){
					a[mark] = a2[a2mark];
					a2mark++;
				}
			} else if(a1mark==a1.length){
				a[mark] = a2[a2mark];
				a2mark++;
			} else if(a2mark==a2.length){
				a[mark] = a1[a1mark];
				a1mark++;
			}
			mark++;
		}		
	}

	
	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new MergeSort().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = readIntArray(in);
		
		numbers = sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	private int[] readIntArray(BufferedReader in) throws IOException {
		int length = Integer.parseInt(in.readLine());
		int[] array = new int[length];
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		return array;
	}
}