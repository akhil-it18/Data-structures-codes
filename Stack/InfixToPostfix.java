public class InfixToPostfix {
	static final int MAX=20;
	int top=-1;
	char[] arr=new char[MAX];
	void push(char c){
		if(top==MAX-1){
			System.out.println("Stack overflow");
		}
		else {
			top++;
			arr[top]=c;
		}
	}
	
	char pop(){
		char c='\0';
		if(top==-1){
			System.out.println("Stack underflow");
		}
		else {
			c=arr[top];
			top--;
		}
		return c;
	}
	
	boolean isEmpty(){
		return top==-1;
	}
	
	char peek(){
		if(top==-1){
			System.out.println("Empty stack");
			return '\0';
		}
		else
			return arr[top];
	}
	
	void printStack(){
		if(top==-1)
			System.out.println("Empty stack");
		else
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
		System.out.println();		
	}
	
	int prec(char ch){
		if(ch=='+'||ch=='-')
			return 1;
		else if(ch=='*'||ch=='/')
			return 2;
		else if(ch=='^')
			return 3;
		//else if(ch=='(') return 4;
		else 
			return -1;
	}
	
	char[] inToPostfix(char[] ch){
		char[] out=new char[ch.length];
		int outCount=-1;
		InfixToPostfix stack=new InfixToPostfix();
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='(')
				stack.push(ch[i]);
			else if(ch[i]==')'){
				while(!stack.isEmpty() && stack.peek()!='('){
					outCount++;
					out[outCount]=stack.pop();
				}
				stack.pop();
			}			
			else if(ch[i]=='+'||ch[i]=='-'||ch[i]=='*'||ch[i]=='/'||ch[i]=='^'){
				if(stack.isEmpty()!=true && prec(ch[i])>prec(stack.peek())){
					stack.push(ch[i]);
				}
			
				else {
				while(stack.isEmpty()!=true && prec(stack.peek())>=prec(ch[i])){
					out[++outCount]=stack.pop();
				}
				stack.push(ch[i]);
				}
			}
			else {
				outCount++;
				out[outCount]=ch[i];
			}
		}
		while(!stack.isEmpty()){
			outCount++;
			out[outCount]=stack.pop();
		}
		return out;
	}
	
	public static void main(String[] args){
		InfixToPostfix s=new InfixToPostfix();
		String str="((A+B)*C-D)*E";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
			s.push(ch[i]);
		s.printStack();
		char[] out=s.inToPostfix(ch);
		System.out.println(out);
	}
}