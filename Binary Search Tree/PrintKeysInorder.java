
public class PrintKeysInorder {
	Node root;
	int[] arr=new int[5];
	static int i=0;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}
	
	void inorder(Node root){
		if(root==null)
			return;
		inorder(root.left);
		arr[i]=root.key;
		i++;
		inorder(root.right);
	}
	
	void printInorder(){
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	void printKeys(int k1,int k2){
		for(i=0;i<arr.length;i++){
			if(arr[i]>=k1 && arr[i]<=k2){
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args){
		PrintKeysInorder tree=new PrintKeysInorder();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.right=new Node(22);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(12);
		int k1=10,k2=22;
		tree.inorder(tree.root);
		tree.printInorder();
		tree.printKeys(k1,k2);
	}
}