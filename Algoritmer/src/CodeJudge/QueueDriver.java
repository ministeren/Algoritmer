package CodeJudge;

import java.io.*;
import java.util.*;

// TODO: Create a "Node" class to use for your queue
class Node {
	public Node next,prev;
	public int value;   
}
class Queue {
	private Node first = null;
	private Node last = null;
	
	public void enqueue(int e) {
		Node node = new Node();
		node.value=e;
		if(first==null){
			first=node;
			last=node;
			node.next=null;
			
		} else {
			node.next=last;
			node.next.prev=node;
			last=node;
		}
		node.prev=null;
	}

	public int dequeue() {
		if(first==null){
			return -1;
		} else if (first.prev==null){
			int output = first.value;
			first=null;
			return output;
		} else {
			int output = first.value;
			first=first.prev;
			first.next=null;
			return output;
		}
	}
}

// ##################################################
// # You do not need to modify anything below here. #
// ##################################################

public class QueueDriver
{
	public static void main(String[] args) throws IOException {
		new QueueDriver().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(System.out)));

		Queue queue = new Queue();

		int N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			String type = st.nextToken();

			if (type.charAt(0) == 'E') {
				queue.enqueue(Integer.parseInt(st.nextToken()));
			} else {
				out.println(queue.dequeue());
			}
		}
		out.flush();
	}
}