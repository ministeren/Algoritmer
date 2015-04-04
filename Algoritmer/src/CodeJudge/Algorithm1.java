package CodeJudge;
import java.io.*;
import java.util.*;

public class Algorithm1
{
	// This method takes an array and should return the index
 	// (0-indexed) of the top point found by Algorithm 1
	private int toppoint1(int[] a) {
		// TODO: Implement this
		int output=0;
		if(a[0]>=a[1]){
			output = 0;
		}
		else if(a[a.length-2]<=a[a.length-1]){
			output = a.length-1;
		}
		else{
			for(int i = 1;i<a.length-1;i++){
				if(a[i-1]<=a[i] && a[i]>=a[i+1]){
					output = i;
				}
			}
		}
		return output;
	}


	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new Algorithm1().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(in.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		} 
		
		System.out.println(toppoint1(a));
	}
}