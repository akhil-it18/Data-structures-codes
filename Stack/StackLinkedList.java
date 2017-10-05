
public class StackLinkedList {
	Node head=null;
	static class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	
	int push(int x){
		Node n=new Node(x);
		n.next=head;
		head=n;
		return n.data;
	}

	int pop(){
		if(head==null){
			System.out.println("Stack Underflow");
			return -1;
		}
		else {
			int temp=head.data;
			head=head.next;
			return temp;
		}
	}
	
	boolean isEmpty(){
		return head==null;
	}
	
	int topItem(){
		return head.data;
	}
	
	void printStack(){
		Node temp=head;
		System.out.println("Item at the top of the stack will be printed first");
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		StackLinkedList s=new StackLinkedList();
		System.out.println(s.push(10)+" moved to stack");
		System.out.println(s.push(20)+" moved to stack");
		System.out.println(s.push(30)+" moved to stack");
		s.printStack();
		System.out.println(s.topItem());
		System.out.println(s.pop()+" popped from stack");
		System.out.println("Top item is "+s.topItem());
		s.printStack();
	}
}