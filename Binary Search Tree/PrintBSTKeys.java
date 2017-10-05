
public class PrintBSTKeys {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}
	
	static void printKeys(Node root,int k1,int k2){
		if(root==null){
			return;
		}
		if(root.key>k1){
			printKeys(root.left,k1,k2);
		}
		
		if(root.key>=k1 && root.key<=k2){
			System.out.print(root.key+" ");
		}
		if(root.key<k2){
			printKeys(root.right,k1,k2);
		}
	}
	
	public static void main(String[] args){
		PrintBSTKeys tree=new PrintBSTKeys();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.right=new Node(22);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(12);
		int k1=10,k2=25;
		printKeys(tree.root,k1,k2);
	}
}