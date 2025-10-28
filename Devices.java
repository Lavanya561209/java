class Devices{
	public Devices(){
		this(900);
		System.out.println("We can purchase in online");
	}
	public Devices(int price){
		this("HeadPhone",true);
		System.out.println("The device has been started:"+price);
	}
	public Devices(String name,boolean isWarranty){
		System.out.println("The device name is good:"+name+"the device warranty is:"+isWarranty);
	}
}