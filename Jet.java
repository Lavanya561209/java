class Jet{
	static int jetNumber;
	public Jet(){
		
	}
	public Jet(int ticketPrice,String name,long contactNumber){
		System.out.println("The price of ticket is:"+ticketPrice+" and name of the jet is:" + name + "the emergency number is:"+contactNumber);
		
	}
	public static void main(String[] args){
		jetNumber=4566;
		new Jet(1000, "Air India", jetNumber);
		new Jet();
	}
}