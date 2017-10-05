
public class LinkedInsert {
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
	
	void insertAfter(Node temp,int x){
		Node n=new Node(x);
		n.next=temp.next;
		temp.next=n;
	}
	
	void append(int x){
		Node n=new Node(x);
		if(head==null){
			head=n;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=n;
	}
	
	void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args){
		LinkedInsert l=new LinkedInsert();
		l.append(6);
		l.push(7);
		l.push(1);
		l.append(4);
		l.insertAfter(l.head.next, 8);
		l.printList();
	}
}