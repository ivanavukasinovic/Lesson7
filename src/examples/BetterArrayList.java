package examples;

import java.util.ArrayList;
import java.util.Scanner;

public class BetterArrayList extends ArrayList<Object> {

	ArrayList<Object> stack;

	public BetterArrayList(ArrayList<Object> stack) {
		this.stack = stack;
	}

	public Object pop() {
		Object removed = (Object) stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		System.out.println("Removed element is: " + removed);
		System.out.println("Elements in the list, after removing are: " + stack);
		return removed;
	}

	public void print() {
		System.out.println(stack.toString());
	}

	public Object insert() {

		Scanner scanner = new Scanner(System.in);

		if (stack.size() == 0) {
			System.out.println("Enter element: ");
			Object firstEnteredElement = scanner.next();
			stack.add(0, firstEnteredElement);
			System.out.println(stack);
		} else {
			System.out.println("Enter element: ");
			Object enteredElement = scanner.next();
			System.out.println("Enter index <= " + stack.size() + ": ");
			int enteredIndex = scanner.nextInt();
			stack.add(enteredIndex, enteredElement);
			System.out.println(stack);
		}
		return stack;
	}

	
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		BetterArrayList bal = new BetterArrayList(list);
		bal.insert();
		bal.insert();
		bal.insert();
		bal.insert();
		bal.insert();
		bal.pop();
		bal.print();
		bal.pop();
		bal.print();
		bal.insert();
		bal.insert();
	}
	
}
