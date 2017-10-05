
public class PostfixEvaluation {
	static int MAX=10;
	int top=-1;
	int[] arr=new int[MAX];
	void push(int n){
		if(top==MAX-1){
			System.out.println("Stack overflow");
		}
		else {
			arr[++top]=n;
		}
	}
	
	int pop(){
		if(top==-1){
			System.out.println("Stack underflow");
			return -1;
		}
		else {
			return arr[top--];
		}
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
	
	static int evaluatePostfix(char[] ch){
		int c;
		PostfixEvaluation s=new PostfixEvaluation();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='+'||ch[i]=='-'||ch[i]=='*'||ch[i]=='/'){
				int a=s.pop();
				int b=s.pop();
				switch(ch[i]){
				case '+':
					c=b+a;
					s.push(c);
					break;
				case '-':
					c=b-a;
					s.push(c);
					break;
				case '*':
					c=b*a;
					s.push(c);
					break;
				case '/':
					c=b/a;
					s.push(c);
					break;
				}
			}
			else {
				int n=Character.getNumericValue(ch[i]);
				s.push(n);
			}
		}
		return s.peek();
	}
	
	public static void main(String[] args){
		String str="123+*8-";
		char[] ch=str.toCharArray();
		int result=evaluatePostfix(ch);
		System.out.println("Value of the posfix expression = "+result);
	}
}
