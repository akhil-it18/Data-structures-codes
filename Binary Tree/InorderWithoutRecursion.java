import java.util.Stack;
public class InorderWithoutRecursion {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
			left=right=null;
		}
	}
	
	void traverse(){
		if(root==null){
			return;
		}
		Node current=root;
		Stack<Node> s=new Stack<Node>();
		while(current!=null){
			s.push(current);
			current=current.left;
		}
		while(!s.isEmpty()){
			current=s.pop();
			System.out.print(current.key+" ");
			if(current.right!=null){
				current=current.right;
			
				while(current!=null){
					s.push(current);
					current=current.left;
				}
			}
		}
	}
	
	public static void main(String[] args){
		InorderWithoutRecursion tree=new InorderWithoutRecursion();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.traverse();
	}
}