public class SortedList {
	Node2 head=null;
	void printList(){
		if(head!=null){
			Node2 temp=head;
			do {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}while(temp!=head);
		}
	}
	
	void sortedInsert(int data){
		Node2 n=new Node2(data);
		Node2 temp=head;
		if(temp==null){
			head=n;
			n.next=n;
		}
		else if(temp.data<=n.data){
			while(temp.next!=head && temp.next.data<n.data){
				temp=temp.next;
			}
			n.next=temp.next;
			temp.next=n;
		}
			
		else {
			n.next=temp;
			head=n;
			Node2 prev=temp;
			while(temp.next!=prev){
				temp=temp.next;
			}
			temp.next=head;
		}
	}
	
	public static void main(String[] args){
		SortedList l=new SortedList();
		l.sortedInsert(12);
		l.sortedInsert(56);
		l.sortedInsert(2);
		l.sortedInsert(11);
		l.sortedInsert(1);
		l.sortedInsert(90);
		System.out.println("The sorted circular Linked list");
		l.printList();
	}
}

class Node2 {
	int data;
	Node2 next;
	Node2(int d){
		data=d;
	}
}