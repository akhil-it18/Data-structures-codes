
public class IsBstEfficient {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}
	
	boolean isBSTUtil(Node root,int min,int max){
		if(root==null){
			return true;
		}
		
		if(root.key<min || root.key>max){
			return false;
		}
		
		return (isBSTUtil(root.left,min,root.key-1) && isBSTUtil(root.right,root.key+1,max));
	}
		 
	public static void main(String[] args){
		IsBstEfficient tree=new IsBstEfficient();
		tree.root=new Node(8);
		tree.root.left=new Node(5);
		tree.root.left.left=new Node(2);
		tree.root.left.right=new Node(6);
		tree.root.right=new Node(9);
		boolean b=tree.isBSTUtil(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println(b);
	}
}