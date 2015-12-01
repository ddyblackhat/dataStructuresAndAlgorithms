package chaper04;

/**
 * ʵ��2:����ƥ������
 * ��������� ��߶�: ѭ������, ջ�ǿ� 
 *         �ұ߶�:  ûѭ����, ջ����
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
				break;  // ***** ����,û�м�break
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
				} else {  // �ұ߶�
					System.out.println("Error " + ch +" at " + i);
				}
				break;
			default:
				break;
			}
		}
		
		if(!theStack.isEmpty()){// ��߶�
			System.out.println("Error : missing ");
		}
	}

	public static void main(String[] args) {
		String str = "pub(String str){this.str = str;}public void check() {";
		BracketStack bs = new BracketStack(str);
		bs.check();
	}
}
