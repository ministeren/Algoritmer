package CodeJudge;

import java.io.*;
import java.util.*;

class MaxHeap {
	
	private int[] elements = new int[10001];
	private int size = 0; //holder styr på arraypladsen på det sidste element (skal starte på 1, 0 bruges ikke)
	
//	PARENT(x): returner (int) x/2
//	LEFT(x) : returner 2x.
//	RIGHT(x): returner 2x + 1

	public void insert(int e) {
		// TODO: Implement this
	}

	private void bubbleUp() {
		// TODO: Implement this
	}

	public int extractMax() {
		// TODO: Implement this
	}

	private void bubbleDown() {
		// TODO: Implement this
	}


	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public void print(PrintWriter out) {
		for (int i = 1; i <= size; i++) {
			out.print(elements[i] + " ");
		}
		out.println();
	}
}


public class MaxHeapDriver
{
	public static void main(String[] args) throws IOException {
		new MaxHeapDriver().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(System.out)));

		MaxHeap maxHeap = new MaxHeap();

		int N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			String type = st.nextToken();

			if (type.charAt(0) == 'I') {
				maxHeap.insert(Integer.parseInt(st.nextToken()));
			} else if (type.charAt(0) == 'E') {
				out.println(maxHeap.extractMax());
			} else {
				maxHeap.print(out);
			}
		}
		out.flush();
	}
}