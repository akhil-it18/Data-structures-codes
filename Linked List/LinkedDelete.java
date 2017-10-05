
public class LinkedDelete {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	
	void push(int x){
		Node n=new Node(x);
		n.next=head;
		head=n;
	}
	
	void delete(int x){
		Node temp=head,prev=null;
		if(temp.data==x){
			head=temp.next;
			temp=null;
			return;
		}
		while(temp.data!=x){
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
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
		LinkedDelete l=new LinkedDelete();
		l.push(7);
		l.push(1);
		l.push(3);
		l.push(2);
		System.out.println("The created list is");
		l.printList();
		l.delete(2);
		System.out.println("Linked list after deleting 1");
		l.printList();
	}
}