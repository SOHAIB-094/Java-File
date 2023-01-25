package lab9tsk2;

public class stck2 {
   int[] stack;
	int top;
	int size;

	// Constructor to initialize size of stack
	public stck2(int size) {
		this.size = size;
		this.stack = new int[size];
		this.top = -1;
	}

	// Method to check if stack is full
	public boolean isFull() {
		return top == size - 1;
	}

	// Method to check if stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// Method to add an element to the stack
	public void push(int element) {
		if (this.isFull()) {
			System.out.println("Stack is full"); 
		} else {
			this.stack[++top] = element;
			System.out.println("Element " + element + " is pushed to Stack !");
		}
	}

	// Method to remove an element from the stack
	public int pop() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			int returnedTop = top;
			top--;
			System.out.println("Pop operation done !");
			return this.stack[returnedTop];
		}
	}

	// Method to display the elements of the stack
	public void display() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Elements in stack : ");
			for (int i = top; i >= 0; i--) {
				System.out.println(this.stack[i]);
			}
		}
	}
}