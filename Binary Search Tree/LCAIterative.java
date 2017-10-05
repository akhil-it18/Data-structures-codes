
public class LCAIterative {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}
	
	static Node lca(Node root,int x,int y){
		while(root!=null){
			if(root.key>x && root.key>y){
				root=root.left;
			}
			else if(root.key<x && root.key<y){
				root=root.right;
			}
			else
				break;
		}
		return root;
	}
	
	public static void main(String[] args){
		LCAIterative tree=new LCAIterative();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.right=new Node(22);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(12);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(14);
		Node n=lca(tree.root,10,14);
		System.out.print(n.key);	
	}
}
