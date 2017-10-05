
public class IsThisBST {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}	
		boolean isBST(Node root){
			if(root==null){
				return true;
			}
			if(root.left!=null && maxValue(root.left)>root.key){
				return false;
			}
			if(root.right!=null && minValue(root.right)<root.key){
				return false;
			}
			if(isBST(root.left)==false||isBST(root.right)==false){
				return false;
			}
			return true;
		}
		
		int maxValue(Node temp){
			while(temp.right!=null){
				temp=temp.right;
			}
			return temp.key;
		}
		
		int minValue(Node temp){
			while(temp.left!=null){
				temp=temp.left;
			}
			return temp.key;
		}
		
		public static void main(String[] args){
			IsThisBST tree=new IsThisBST();
			tree.root=new Node(13);
			tree.root.left=new Node(10);
			tree.root.left.left=new Node(8);
			tree.root.left.right=new Node(12);
			tree.root.right=new Node(19);
			boolean b=tree.isBST(tree.root);
			System.out.println(b);
		}
	}
