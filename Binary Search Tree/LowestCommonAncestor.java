
public class LowestCommonAncestor {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}
	
	static Node lca(Node root,int x,int y){
		if(root==null){
			return null;
		}
		if(root.key<x && root.key<y){
			return lca(root.right,x,y);
		}
		if(root.key>x && root.key>y)
			return lca(root.left,x,y);
		return root;
	}
	
	public static void main(String[] args){
		LowestCommonAncestor tree=new LowestCommonAncestor();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.right=new Node(22);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(12);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(14);
		Node n=lca(tree.root,14,8);
		System.out.print(n.key);
		
	}
}
