class AboutBank{
static int[] price={400,4000};
static String name="Union";
static boolean  isAvailable=true;
static int personAge=20;
static long phoneNumber=8894563569l;
public static int customerName(){
int deposit=1000;
System.out.println("Deposited is " + deposit);
return deposit;
}
public static void main(String[] args){
			String []branch={"UNION","CANARA","SBI","ANDHRA BANK",};
		System.out.println("The different branches are:");
		for(int i=0;i<branch.length;i++){
			System.out.println("The variety of fruit trees are:"+branch[i]);
		}
		System.out.println("========================");
		for(String c:branch){
			System.out.println("The variety of branches are:"+c);
        }
		System.out.println("=========================");
		int i=10;
		while(i>=20){
			System.out.println("i"+i);
			break;
		}
		
}   

}