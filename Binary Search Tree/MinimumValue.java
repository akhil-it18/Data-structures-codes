
public class MinimumValue {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}
	
	int minValue(Node root){
		while(root.left!=null){
			root=root.left;
		}
		return root.key;
	}
	
	public static void main(String[] args){
		MinimumValue tree=new MinimumValue();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.right=new Node(22);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(12);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(14);
		int min=tree.minValue(tree.root);
		System.out.println("Minimum value in the BST = "+min);
	}
}