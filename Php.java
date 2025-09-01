class Php{
	public static void main(String args[]){
		String [] programmingLanguages={"Java","Python","C","C++","DBMS","Data Structure","C#"};
		boolean [] isAvailable={true,false,true,false,true};
		int i=0;
		while(i<programmingLanguages.length){
			System.out.println("The names of coding languages are:"+programmingLanguages[i]);
			i++;
	}
	System.out.println("=================");
	int j=0;
	do{
		System.out.println("The index:"+j+"and Php:"+isAvailable[j]);
		j++;
	}while(j<isAvailable.length);
	}	 
}