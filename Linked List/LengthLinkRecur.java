
class Node {
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}

public class LengthLinkRecur {
	Node head=null;	
	void push(int data){
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	
	void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	int countList(Node temp){
		if(temp==null){
			return 0;
		}
		else return (1+countList(temp.next));
	}
	
	public static void main(String[] args){
		LengthLinkRecur l=new LengthLinkRecur();
		l.push(1);
		l.push(6);
		l.push(8);
		l.push(4);
		l.push(5);
		l.push(3);
		l.printList();
		System.out.println("Number of nodes = "+l.countList(l.head));
	}
}