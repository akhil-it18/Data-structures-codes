
public class LeafNodes {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
			left=right=null;
		}
	}

	int countleaves(Node temp){
		if(temp==null){
			return 0;
		}
		else if(temp.left==null && temp.right==null){
			return 1;
		}
		
		else {
			return countleaves(temp.left)+countleaves(temp.right);
		}
	}
	
	public static void main(String[] args){
		LeafNodes tree=new LeafNodes();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		int count=tree.countleaves(tree.root);
		System.out.println("Number of leaf nodes = "+count);
	}
}