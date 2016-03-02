package chaper05;
//http://blog.csdn.net/tayanxunhua/article/details/11100097
public class LinkList<T> {

	// 节点信息
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

	public void addFirst(T data) { // 插入到头节点中
		Node<T> node = new Node<T>(data); // 创建新的节点
		node.next = header; // 新节点的 next --> header, header 变为下一个节点

		this.header = node; // header --> node , node 变为头节点
		//header.display();

	}

	public void displayAllNode() {
		Node<T> current = header;
		while (current != null) {
			current.display();
			current = current.next; // 当前节点指向下一个节点
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
