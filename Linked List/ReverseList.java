
public class ReverseList {
	Node head=null;
	static class Node {
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	
	void push(int data){
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	
	void reverse(){
		Node prev,current,next;
		prev=null;
		current=head;
		next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		ReverseList r=new ReverseList();
		r.push(20);
		r.push(4);
		r.push(100);
		r.push(66);
		r.push(15);
		r.push(86);
		System.out.println("Given linked list");
		r.printList();
		r.reverse();
		System.out.println("Reversed linked list");
		r.printList();
	}
}