package chaper04;

/**
 * 实例2:单词匹配问题
 * 可能情况： 左边多: 循环完了, 栈非空 
 *         右边多:  没循环完, 栈空了
 * @author dudy
 *
 */
public class BracketStack {

	private String str;

	public BracketStack(String str) {
		this.str = str;
	}

	public void check() {
		StackX<Character> theStack = new StackX<Character>(str.length());
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			switch (ch) {
			case '[':
			case '{':
			case '(':
				theStack.push(ch);
				break;  // ***** 出错,没有加break
			case ']':
			case '}':
			case ')':
				if (!theStack.isEmpty()) {
					char chx = theStack.pop();
					System.out.println("chx : ---> : " + chx  + "   ch: " + ch);
					if ( (chx != '[' && ch == ']') || 
						(chx != '{' && ch == '}') || 
						(chx != '(' && ch == ')') ) {
						System.out.println("Error " + ch +" at " + i);
					}
				} else {  // 右边多
					System.out.println("Error " + ch +" at " + i);
				}
				break;
			default:
				break;
			}
		}
		
		if(!theStack.isEmpty()){// 左边多
			System.out.println("Error : missing ");
		}
	}

	public static void main(String[] args) {
		String str = "pub(String str){this.str = str;}public void check() {";
		BracketStack bs = new BracketStack(str);
		bs.check();
	}
}
