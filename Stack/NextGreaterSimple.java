
public class NextGreaterSimple  {
	void nextGreater(int[] arr){
		int i,j;
		for(i=0;i<arr.length;i++){
			if(i==arr.length-1)
				System.out.println(arr[i]+" -- "+-1);
			else {
				for(j=i+1;j<arr.length;j++){
					if(arr[j]>arr[i]){
						System.out.println(arr[i]+" -- "+arr[j]);
						break;
					}
					if(j==arr.length-1){
						System.out.println(arr[i]+" -- "+-1);
					}
				}
			}
		}
	}
	
	public static void main(String[] args){
		NextGreaterSimple s=new NextGreaterSimple();
		int[] arr={11,13,21,3};
		s.nextGreater(arr);
	}
}		