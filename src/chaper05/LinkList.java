package chaper05;
//http://blog.csdn.net/tayanxunhua/article/details/11100097
public class LinkList<T> {

	// �ڵ���Ϣ
	class Node<T> {
		protected Node<T> next;
		protected T data;

		public void display() {
			System.out.println(data);
		}

		public Node(T data) {
			this.data = data;
		}

	}

	private Node<T> header;

	public LinkList() {
		this.header = null;
	}

	public void addFirst(T data) { // ���뵽ͷ�ڵ���
		Node<T> node = new Node<T>(data); // �����µĽڵ�
		node.next = header; // �½ڵ�� next --> header, header ��Ϊ��һ���ڵ�

		this.header = node; // header --> node , node ��Ϊͷ�ڵ�
		//header.display();

	}

	public void displayAllNode() {
		Node<T> current = header;
		while (current != null) {
			current.display();
			current = current.next; // ��ǰ�ڵ�ָ����һ���ڵ�
		}
	}

	public static void main(String[] args) {
		LinkList<Integer> link1 = new LinkList<Integer>();
		link1.addFirst(1);
		link1.addFirst(2);
		link1.addFirst(3);
		link1.displayAllNode();
	}
}
