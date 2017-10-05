
public class BinaryTreeSize {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
			left=right=null;
		}
	}
	
	
	int size(Node temp){
		if(temp==null){
			return 0;
		}
		else {
			return size(temp.left)+size(temp.right)+1;
		}
	}
	
	public static void main(String[] args){
		BinaryTreeSize tree=new BinaryTreeSize();
		tree.root=new Node(6);
		tree.root.left=new Node(3);
		tree.root.left.left=new Node(1);
		tree.root.left.right=new Node(5);
		tree.root.right=new Node(8);
		tree.root.right.left=new Node(7);
		tree.root.right.right=new Node(11);
		tree.root.right.right.left=new Node(9);
		tree.root.right.right.right=new Node(13);
		int tree_size=tree.size(tree.root);
		System.out.print("Size of the binary tree = "+tree_size);
	}
}