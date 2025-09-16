class Medicines{
	public static void main(String []args){
		String []fever={"Paracetamol","Syrup","Injection","Glucose","Tablets","Ors"};
		System.out.println("The medicines are");
		for(int i=0;i<fever.length;i++){
			System.out.println("The regular medicines are:"+fever[i]);
		}
		System.out.println("=======================");
		for(String b:fever){
			System.out.println("The medicines to be used:"+b);
		}
	}
}