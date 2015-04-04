package CodeJudge;

import java.io.*;
import java.util.*;

class Stack {
	private LinkedList<Integer> edges = new LinkedList<Integer>();

	public void push(int e) {
		edges.addLast(e);
	}

	public int pop() {
		
		return edges.removeLast();
	}
}

// Vejledende løsning
//class Node {
//    public Node next;
//    public int value;   
//}
// 
//class Stack {
//    private Node top = null;
// 
//    public void push(int e) {
//        Node node = new Node();
//        node.value = e;
// 
//        node.next = top;
//        top = node;
//    }
// 
//    public int pop() {
//        if (top == null) {
//            throw new IllegalStateException("No elements to pop");
//        }
// 
//        int value = top.value;
//        top = top.next;
// 
//        return value;
//    }
//}


public class StackDriver
{
	public static void main(String[] args) throws IOException {
		new StackDriver().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(System.out)));

		Stack stack = new Stack();

		int N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			String type = st.nextToken();

			if (type.equals("PU")) {
				stack.push(Integer.parseInt(st.nextToken()));
			} else {
				out.println(stack.pop());
			}
		}
		out.flush();
	}
}
