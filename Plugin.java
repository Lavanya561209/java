class Plugin{
	static byte width=20;
	static short weight=100;
	static int price=500;
	static long contactNumber=8867459032L;
	static boolean isAvailable=true;
	static char capacity='H';
	static float gst=23.456f;
	static String name="cool";
	static int[] value={100};
	public static byte reviews(){
		System.out.println("The reviews of the product is");
		return 45;
	}
	public static short height(){
		System.out.println("The height of the product is");
		return 140;
	}
	public static int cost(){
		System.out.println("The cost of the product is");
		return 600;
	}
	public static long phoneNumber(){
		System.out.println("Any more information about this product is");
		return 9743675210L;
	}
	public static boolean availableProduct(){
		System.out.println("The limited product available is");
		return true;
	}
	public static char quality(){
		System.out.println("The quality of the product is");
		return 'A';
	}
	public static float gst(){
		System.out.println("The gst of each product is");
		return 3.489f;
	} 
	public static double subscribers(){
		System.out.println("The viewers joined to the channel is");
		return 195.67d;
	}
	public static String[] names(){
		String used[]={"Copper","Zinc","Rubber"};
		System.out.println("The materials used in this product is=");
		return used;
	}
	public static void firsttime(){
		System.out.println("I have got an new experience");
		secondtime();
	}
	public static void secondtime(){
		System.out.println("I have got an easy tricks to purchase");
	}
	public static void fresher(){
		System.out.println("They have some idea about that");
	}
	public static void experience(){
		System.out.println("They have good  experience in work");
	}
	public static void main(String [] args){
		fresher();
		experience();
		String[] names={"Nicon","Micro","Polycab"};
		int i=0;
		do{
			System.out.println(names[i]);
			i++;
			continue;
		}while(i<names.length);
		
		String[] wiresName={"Copper","Electrical","Metal","Circuit","Messy"};
		System.out.println("Plugin");
		System.out.println("========================");
		for(int j=0;j<wiresName.length;j++){
			System.out.println("The using diiferent wires are:"+wiresName[i]);
		}
		System.out.println("=======================");
		for(String wire:wiresName){
			System.out.println("Plugin");
		}
		int a=18;
	    if(a>=18){
			System.out.println("They are not eligible");
			}else{
				System.out.println("They are eligible");
			}
					System.out.println("========================");
		            System.out.println("The size of the wire is:"+width);
					System.out.println("The weight of the product is="+weight);
					System.out.println("The cost of product is:-"+price);
					System.out.println("The reference number is:"+contactNumber);
					System.out.println("The stock of the product is:="+isAvailable);
					System.out.println("The capacity of the product is:"+capacity);
					System.out.println("The gst is:"+gst);
                    System.out.println("The name of the product is:"+name);
                    System.out.println("The value of the product is="+value[0]);					
		
		}


	
	
}