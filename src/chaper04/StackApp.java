package chaper04;
/**
 * 第四章: 栈和队列的学习
 * @author dudy
 *
 */

public class StackApp {
	
	public static void main(String[] args) {
		StackX<Integer>  theStack = new StackX<Integer>(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while(!theStack.isEmpty()){
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
