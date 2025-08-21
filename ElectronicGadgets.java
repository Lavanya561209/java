class ElectronicGadgets{
	public static void main(String [] args){
		String [] models={"Washing Machine","Fridge","Air Cooler","Laptop","Oven","Smartphones","Water Heater"};
		System.out.println("ElectronicGadgets:");
		for(int i=0;i<models.length;i++){
			System.out.println("Available gadgets are:"+models[i]);
		}
		System.out.println("==============================");
		for(String x:models){
			System.out.println("Available goods are:"+x);
		}
	}
}