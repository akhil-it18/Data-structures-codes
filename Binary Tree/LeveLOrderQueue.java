import java.util.*;
public class LeveLOrderQueue {
	Node root;
	static class Node {
		char key;
		Node left,right;
		Node(char x){
			key=x;
			left=right=null;
		}
	}
	
	void printLevelOrder(){
		Queue<Node> q=new LinkedList<Node>();
		Node temp=root;
		while(temp!=null){
			System.out.print(temp.key+" ");
			if(temp.left!=null){
				q.add(temp.left);
			}
			if(temp.right!=null){
				q.add(temp.right);
			}
			temp=q.poll();
		}
	}	
	
	public static void main(String[] args){
		LeveLOrderQueue tree=new LeveLOrderQueue();
		tree.root=new Node('A');
		tree.root.left=new Node('B');
		tree.root.right=new Node('C');
		tree.root.left.left=new Node('D');
		tree.root.left.right=new Node('E');
		tree.root.left.right.left=new Node('F');
		tree.printLevelOrder();
	}
}