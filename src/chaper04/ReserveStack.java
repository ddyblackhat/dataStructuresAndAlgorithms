package chaper04;
/*
 * µ¥´ÊÄæĞò£º
 */
public class ReserveStack {
	
	private StackX<Character> theStack;
	
	public ReserveStack(String str) {
		theStack = new  StackX<Character>(str.length());
		for(int i =0; i< str.length();i++){
			theStack.push(str.charAt(i));
		}
	}

	public String doRev(){
		String str = "";
		while(!theStack.isEmpty()){
			str = str + theStack.pop();
		}
		return str;
	}
	
	
	public static void main(String[] args) {
		String in = "ddyblackhat";
		ReserveStack re = new ReserveStack(in);
		String out = re.doRev();
		System.out.println(out);
	}
}
