public class NodeLastIndex {
	Node head=null;
	int length=0;
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
	
	int nthfromend(int index){
		if(index==0||index>6){
			return-1;
		}
		Node temp=head;
		while(temp!=null){
			length++;
			temp=temp.next;
		}
		
		temp=head;
		for(int i=1;i<length-index+1;i++){
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
		NodeLastIndex n=new NodeLastIndex();
		n.push(1);
		n.push(6);
		n.push(8);
		n.push(4);
		n.push(5);
		n.push(3);
		System.out.println("The created Linked lisk is");
		n.printList();
		int item=n.nthfromend(3);
		if(item==-1){
			System.out.println("Invalid node");
			return;
		}
		System.out.println("The 3rd element from the end of the list is "+item);
	}
}