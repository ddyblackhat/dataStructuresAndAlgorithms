package chaper04;

public class StackX<T>{
	
	private int maxSize;
	private T[] stackArray;
	private int top;
	
	public StackX(int s) {
		maxSize = s;
		stackArray = (T[]) new Object[s];
		top = -1;
	}
	//----------------------
	public void push(T j){ 
		stackArray[++top] = j;
	}
	
	public T pop(){
		return stackArray[top--];
	}
	
	public T peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxSize - 1);
	}
}
