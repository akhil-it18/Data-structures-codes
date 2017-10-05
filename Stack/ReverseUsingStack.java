public class ReverseUsingStack {
	int top=-1;
	static int MAX=20;
	char[] arr=new char[20];
	
	void push(char c){
		if(top==MAX-1)
			System.out.println("Stack overflow");
		else {
			arr[++top]=c;
		}
	}
	
	char pop(){
		if(top==-1){
			System.out.println("Stack underflow");
			return '\0';
		}
		else {
			return arr[top--];
		}
	}
	
	boolean isEmpty(){
		return(top==-1);
	}
	
	char peek(){
		if(top==-1){
			System.out.println("Empty stack");
			return '\0';
		}
		else
			return arr[top];
	}
	
	char[] reverseString(char[] ch){
		int i,outCount=-1;
		for(i=0;i<ch.length;i++){
			push(ch[i]);
		}
		char[] out=new char[ch.length];
		while(!isEmpty()){
			outCount++;
			out[outCount]=pop();
		}
		return out;
	}
	
	public static void main(String[] args){
		String str="GeeksQuiz";
		char[] ch=str.toCharArray();
		ReverseUsingStack s=new ReverseUsingStack();
		char[] out=s.reverseString(ch);
		System.out.print(out);
	}
}