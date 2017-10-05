
public class BreadthFirstTraversal {
	Node root=null;
	
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
			left=null;
			right=null;
		}
	}
	
	void printLevelOrder(){
		int h=height(root);
		int i;
		for(i=1;i<=h;i++){
			printGivenLevel(root,i);
		}
	}
	
	int height(Node root){
		if(root==null)
			return 0;
		else {
			int lheight=height(root.left);
			int rheight=height(root.right);
			int height_max=Math.max(lheight, rheight)+1;
			return height_max;
		}
	}
	
	void printGivenLevel(Node root,int level){
		if(root==null){
			return;
		}
		if(level==1){
			System.out.print(root.key+" ");
		}
		
		else if(level>1){
			printGivenLevel(root.left,level-1);
			printGivenLevel(root.right,level-1);
		}
	}
	
	public static void main(String[] args){
		BreadthFirstTraversal tree=new BreadthFirstTraversal();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right=new Node(3);
		tree.printLevelOrder();
	}
}