package chaper05;

public class BinTree {
	class TreeNode{
		protected int value;
		protected TreeNode leftChild;
		protected TreeNode rightChild;
		public TreeNode(int value) {
			this.value = value;
		}
	}
	
	private TreeNode root;

	public BinTree(int data) {
		TreeNode treeNode = new TreeNode(data);
		this.root = treeNode;
	}
	
	public static void main(String[] args) {
		BinTree tree1 = new BinTree(1);
	    tree1.init();
	    tree1.display(tree1.root);
	}

	private void display(TreeNode root) {
		// TODO Auto-generated method stub
		System.out.println(root.value);
		if( root.leftChild != null){
			display(root.leftChild);
		}
		if( root.rightChild != null){
			display(root.rightChild);
		}
	}
    /*
     *        1
     *    2       3 
     *  4   5   
     */
	private  void init() {
		TreeNode ltree1 = new TreeNode(2);
		TreeNode ltree2 = new TreeNode(4);
		TreeNode rtree1 = new TreeNode(3);
		TreeNode rtree2 = new TreeNode(5);
		this.root.leftChild = ltree1;
		this.root.rightChild = rtree1;
		ltree1.leftChild = ltree2;
		ltree1.rightChild = rtree2;
	}
	
	
}
