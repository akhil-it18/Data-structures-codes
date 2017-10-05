
public class SearchListRecur {
	Node head=null;
	int pos=1;
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
	
	int search(Node temp,int key){
		if(temp==null)
			return 0;
		if(temp.data==key)
			return pos;
		pos++;
		temp=temp.next;
		return search(temp,key);
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
		SearchListRecur s=new SearchListRecur();
		s.push(1);
		s.push(6);
		s.push(8);
		s.push(4);
		s.push(5);
		s.push(3);
		System.out.println("The created Linked lisk is");
		s.printList();
		int n=s.search(s.head,5);
		if(n==0){
			System.out.print("Number not found");
		}
		else
			System.out.print("Number found at position "+n);
	}
}