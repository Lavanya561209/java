class Fan{
		static String material="Home appliances";
		static char speed=3;
		static byte power=40;
		static long numbers=8976543291l;
		static int price=1299;
        static float gst=1.4356f;
        static short weight=500;
        static boolean isAvailable=false;
        static double reviews=100d;
        static String[] name={"Crompton","Bajaj","Orient","Usha"};
	    public static void main(String [] args){
        material="Metal";
        speed=5;
        power=52;
        numbers=9823521734l;
        price=1899;
        gst=2.345f;
        weight=600;
        isAvailable=true;
        reviews=120d;
        name[3]="Lifelong";
        System.out.println("The materials are used is:"+material);
        System.out.println("The speed of the fan is:"+speed);
		System.out.println("The power capacity is:"+power);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The gst is:"+gst);
        System.out.println("The weight of the product is:"+weight);
        System.out.println("The different stock is:"+isAvailable);
        System.out.println("The reviews of the product is:"+reviews);
        System.out.println("The different product is:"+name[3]); 		
	    }
}