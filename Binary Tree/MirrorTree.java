
public class MirrorTree {
	Node root;
	static class Node{
		int key;
		Node left,right;
		Node(int x){
			key=x;
			left=right=null;
		}
	}
	
	void traverse(Node temp){
		if(temp==null)
			return;
		else {
			traverse(temp.left);
			System.out.print(temp.key+" ");
			traverse(temp.right);
		}		
	}
	
	void mirror(Node temp){
		if(temp==null)
			return;
		if(temp.left==null && temp.right==null)
			return;
		mirror(temp.left);
		mirror(temp.right);
		Node n1=temp.left;
		temp.left=temp.right;
		temp.right=n1;
	}
		
	public static void main(String[] args){
		MirrorTree tree=new MirrorTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println("Inorder traversal of the binary tree");
		tree.traverse(tree.root);
		tree.mirror(tree.root);
		System.out.println("\nInorder traversal of the mirror tree");
		tree.traverse(tree.root);
	}
}