class Fibonacci{
	public static void main(String[] args){
		int num=20;
		int first=0;
		int second=1;
		for(int i=0;i<=num;i++){
			System.out.println("The fibonacci series are:");
			System.out.println(first+" ");
			int nextnumber=first+second;
			first=second;
			second=nextnumber;
     	}
	}
}