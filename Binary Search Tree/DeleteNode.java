
public class DeleteNode {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}
	
	Node deleteKey(Node root,int x){
		if(root==null){
			return root;
		}
		if(x<root.key){
			root.left=deleteKey(root.left,x);
		}
		
		else if(x>root.key){
			root.right=deleteKey(root.right,x);
		}
		else {
			if(root.left==null){
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}
			
			root.key=minValue(root.right);
			root.right=deleteKey(root.right,root.key);
		}
		return root;
	}
	
	int minValue(Node root){
		int minv=root.key;
		while(root.left!=null){
			minv=root.left.key;
			root=root.left;
		}
		return minv;
	}
	
	void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.print(root.key+" ");
		inorder(root.right);
	}
	
	public static void main(String[] args){
		DeleteNode tree=new DeleteNode();
		tree.root=new Node(50);
		tree.root.left=new Node(30);
		tree.root.left.left=new Node(20);
		tree.root.left.right=new Node(40);
		tree.root.right=new Node(70);
		tree.root.right.left=new Node(60);
		tree.root.right.right=new Node(80);
		System.out.println("Inorder traversal of the given tree");
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Delete 20");
		tree.deleteKey(tree.root,20);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder(tree.root);
		System.out.println("\nDelete 30");
		tree.deleteKey(tree.root,30);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder(tree.root);
		System.out.println("\nDelete 50");
		tree.deleteKey(tree.root,50);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder(tree.root);
	}
}