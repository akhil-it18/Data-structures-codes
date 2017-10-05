
public class RootToLeaf {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
			left=right=null;
		}
	}
	
	void printPathsRecur(Node temp,int[] path,int pathLen){
		if(temp==null)
			return;
		path[pathLen]=temp.key;
		pathLen++;
		
		/* it's a leaf, so print the path that led to here */
		if(temp.left==null && temp.right==null){
			printArray(path,pathLen);
		}
		else {
			printPathsRecur(temp.left,path,pathLen);
			/*if(temp.key==1){
				for(int i=0;i<3;i++){
					System.out.print(path[i]+" ");
				}
				System.out.println("\nPath Length = "+pathLen);
			}*/
			printPathsRecur(temp.right,path,pathLen);
		}
	}
	
	void printArray(int[] path,int len){
		int i;
		for(i=0;i<len;i++){
			System.out.print(path[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		RootToLeaf tree=new RootToLeaf();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		int[] arr=new int[10];
		tree.printPathsRecur(tree.root,arr,0);
	}
}