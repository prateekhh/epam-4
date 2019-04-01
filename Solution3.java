import java.util.*;

/* 
* @author Prateek Chauhan
*
*/

public class Solution3 {

	static LinkedList<Integer> stack1 = new LinkedList<Integer>();
	static LinkedList<Integer> stack2 = new LinkedList<Integer>();

	static void enque(int x) {
		stack1.addFirst(x);
	}

	static void deque() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.addFirst(stack1.removeFirst());
			}

		}
		stack2.removeFirst();
	}

	static int peek() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.addFirst(stack1.removeFirst());
			}

		}
		return stack2.getFirst();
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int type, q = in.nextInt();
		for (int i = 0; i < q; i++) {
			type = in.nextInt();
			switch (type) {
			case 1:
				int x = in.nextInt();
				enque(x);
				break;
			case 2:
				deque();
				break;
			case 3:
				System.out.println(peek());
			}
		}
		
		in.close();
	}
}