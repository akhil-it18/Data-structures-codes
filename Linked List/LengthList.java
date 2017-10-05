
public class LengthList {
  Node head=null;
  
  static class Node{
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
  
  int countList(){
	  int count=0;
	  Node temp=head;
	  while(temp!=null){
		  count++;
		  temp=temp.next;
	  }
	  return count;
  }
  
  void printList(){
	  Node temp=head;
	  while(temp!=null){
		  System.out.print(temp.data+" ");
		  temp=temp.next;
	  }
  }
  
  public static void main(String[] args){
	  LengthList l=new LengthList();
	  l.push(5);
	  l.push(4);
	  l.push(8);
	  l.push(6);
	  l.push(1);
	  System.out.println("The created linked list");
	  l.printList();
	  System.out.print("\nLength of the linked list = "+l.countList());
  }
}