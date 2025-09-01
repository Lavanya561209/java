class Area{
	public static void main(String[] args){
		String[] street={"Yeshwanthpur","Malleshwaram","Rajajinagar","Dasaharalli","Peenya","Gouruguntaepalya","Mathikare"};
		boolean[] isAvailable={true,false,true,false,true,false};
		System.out.println("Iterating street with while loop:");
		int i=0;
		while(i<street.length){
		System.out.println("The different locations are:"+street[i]);
		i++;
        }		
		System.out.println("---------------------");
		int j=0;
		do{
			System.out.println("The index:"+ j+ " and Area:"+ isAvailable[j]);
			j++;
		}while(j<isAvailable.length);
	}
}