
public class LinkedDeletePos {
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
	
	void deleteNode(int pos){
		if(pos==0){
			head=head.next;
			return;
		}
		Node temp=head;
		int i=1;
		while(i<pos){
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
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
		LinkedDeletePos l=new LinkedDeletePos();
		l.push(7);
		l.push(1);
		l.push(3);
		l.push(2);
		l.push(8);
		System.out.println("The created list is");
		l.printList();
		l.deleteNode(1);
		System.out.println("Linked list after deletion at the given position");
		l.printList();
	}
}