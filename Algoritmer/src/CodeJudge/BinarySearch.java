package CodeJudge;
import java.io.*;
import java.util.*;

public class BinarySearch
{
	// This method takes an array of integers as input parameters
	// and a value val. It should return the index of val in the array.
	// If val does not occur it should return -1.

	//	BINaeRSoGNING(A,i,j,x)
	//	if j < i return false
	//	m = i+j/2
	//	if A[m] = x return true
	//	elseif A[m] < x return BINaeRSoGNING(A,m+1,j,x)
	//	else return BINaeRSoGNING(A,i,m-1,x)

	private int k = 0;

	private int find(int[] numbers, int val) {
		// TODO: Implement this
		search(numbers,0,numbers.length-1,val); 
		return k;
	}

	private void search(int[] numb, int i, int j, int x){
		if (j < i){
			k = -1;
		}else{
			int m = (int) (i+j)/2;
			if (numb[m] == x){
				k = m;
			} else if (numb[m] < x){
				search(numb,m+1,j,x);
			} else if(numb[m] > x){
				search(numb,i,m-1,x);
			}
		}
	}


	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new BinarySearch().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = readIntArray(in);
		int[] queries = readIntArray(in);

		for (int i = 0; i < queries.length; i++) {
			int solution = find(numbers, queries[i]);
			System.out.println(solution);
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