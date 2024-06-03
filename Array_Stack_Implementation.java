package datastructures;

public class Array_Stack_Implementation {

	public static void main(String[] args) {
		 // Create a stack with a maximum size of 5
		Array_Stack_Implementation stack = new Array_Stack_Implementation(5);
		
		// Push elements onto the stack
		stack.push(10);
		stack.push(16);
		stack.push(50);
		stack.push(40);
		stack.push(35);
		
		System.out.println(stack.isfull());
		System.out.println(stack.isempty());
		System.out.println(stack.peek());
	}
	
		private int max;// Maximum size of the stack
		int []stackarray;// Array to store stack elements
		int top;// Index of the top element in the stack
		
		public Array_Stack_Implementation (int max) {
			super();
			this.max = max;
			this.stackarray = new int[max];
			this.top=-1;
		}
		
		 // Method to push an element onto the stack
		public void push(int data) {
			
			if (isfull()) {
				throw new RuntimeException("Stack is Full");
				
			}
			stackarray[++top]= data;
		}
		
		// Method to pop an element from the stack
		public int pop() {
			if (isempty()) {
				
				throw new RuntimeException("Stack is Empty");
				
			}
			
			return stackarray[top--];
		}
		
		// Method to peek the top element of the stack without removing it
		public int peek() {
			
			if (isempty()) {
				
				throw new RuntimeException("Stack is Empty");
				
			}
			
			return stackarray[top];
		}
		
		 // Method to check if the stack is empty
		public boolean isempty() {
			return top == -1;
		}
		
		// Method to check if the stack is full
		public boolean isfull() {
			return max -1==top;
		}
	}


