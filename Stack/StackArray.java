
public class StackArray {
	static final int MAX=5;
	int top;
	int a[]=new int[MAX];
	
	StackArray(){
		top=-1;
	}
	boolean isEmpty(){
		return (top<0);
	}
	
	void push(int x){
		if(top==MAX-1){
			System.out.println("Stack overflow");
		}
		else {
			top++;
			a[top]=x;
			System.out.println(a[top]+" pushed to stack");
		}
	}
	
	int pop(){
		if(top<0){
			System.out.println("Stack underflow");
			return -1;
		}
		else {
			int x=a[top];
			top--;
			return x;
		}
	}
	
	int topItem(){
		if(top<0){
			System.out.println("The stack is empty");
			return -1;
		}
		else{
			return a[top];
		}
	}
	
	void printStack(){
		System.out.println("The given stack is");
		for(int i:a){
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args){
		StackArray s=new StackArray();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop()+" popped from stack");
		System.out.println("Top item is "+s.topItem());
		s.push(40);
		s.push(50);
		System.out.println("Top item is "+s.topItem());
		s.push(60);
		s.push(70);
		s.printStack();
	}
}