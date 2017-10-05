
public class HeightTree {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
			left=right=null;
		}
	}
	
	int height(Node root){
		if(root==null){
			return 0;
		}
		else {
			int lheight=height(root.left);
			int rheight=height(root.right);
			int height_max=Math.max(lheight, rheight)+1;
			return height_max;
		}
	}
	
	public static void main(String[] args){
		HeightTree tree=new HeightTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);		
		System.out.println("Height of the binary tree = "+tree.height(tree.root));			
	}
}