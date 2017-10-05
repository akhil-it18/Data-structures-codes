public class NodeIndex {
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
	
	int getItem(int index){
		Node temp=head;
		for(int i=0;i<index;i++){
			temp=temp.next;
		}
		return temp.data;
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
		NodeIndex n=new NodeIndex();
		int item;
		n.push(3);
		n.push(4);
		n.push(1);
		n.push(12);
		n.push(2);
		System.out.println("The created linked list is");
		n.printList();
		item=n.getItem(4);
		System.out.print("Element at index 4 is "+item);
	}
}