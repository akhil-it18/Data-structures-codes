
public class TreeTraversals {
	Node root=null;
	static class Node {
		int key; 
		Node left,right;
		Node(int x){
			key=x;
			left=right=null;
		}
	}
	
	void inorder(Node temp){
		if(temp==null)
			return;
		inorder(temp.left);
		System.out.print(temp.key+" ");
		inorder(temp.right);
	}
	
	void preorder(Node temp){
		if(temp==null){
			return;
		}
		System.out.print(temp.key+" ");
		preorder(temp.left);
		preorder(temp.right);
	}
	
	void postorder(Node temp){
		if(temp==null)
			return;
		postorder(temp.left);
		postorder(temp.right);
		System.out.print(temp.key+" ");
	}

	public static void main(String[] args){
		TreeTraversals tree=new TreeTraversals();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right=new Node(3);
		System.out.println("Inorder traversal of binary trees is");
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Preorder traversal of binary tree is");
		tree.preorder(tree.root);
		System.out.println();
		System.out.println("Postorder traversal of binary tree is");
		tree.postorder(tree.root);
	}
}