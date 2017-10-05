
public class NextGreaterStack {
	private static final int MAX=5;
	int top=-1;
	int[] arr=new int[MAX];
	
	void push(int x){
		if(top==MAX-1)
			System.out.println("Stack overflow");
		else
			arr[++top]=x;
	}
	
	int pop(){
		if(top==-1){
			System.out.println("Stack underflow");
			return -1;
		}
		else 
			return arr[top--];
	}
	
	boolean isEmpty(){
		return top==-1;
	}
	
	int peek(){
		if(top==-1){
			System.out.println("Empty stack");
			return -1;
		}
		else 
			return arr[top];
	}
	
	public static void main(String[] args){
		NextGreaterStack stack=new NextGreaterStack();
		int[] arr={4,5,2,3,10};
		System.out.println("Given arr:");
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
		int[] nge=new int[arr.length];
		for(int i=0;i<nge.length;i++){
			nge[i]=-1;
		}
		
		stack.push(0);
		for(int i=1;i<arr.length;i++){
			while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
				nge[stack.peek()]=arr[i];
				stack.pop();
			}
			stack.push(i);
		}
		System.out.println("NGE array");
		for(int i:nge){
			System.out.print(i+" ");
		}
	}
}