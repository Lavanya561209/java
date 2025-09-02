class WashingMachine{
		static String name="Electrical";
		static char x=88;
		static byte kg=6;
		static long numbers=8976543291l;
		static int price=1000;
        static float gst=1.4356f;
        static short weight=500;
        static boolean isAvailable=false;
        static double reviews=45d;
        static String[] names={"LG","Samsung","Whirlpool","Croma"};
	    public static void main(String [] args){
        name="Electrical Gadgets";
        x=95;
        kg=8;
        numbers=9823521734l;
        price=10000;
        gst=2.345f;
        weight=600;
        isAvailable=true;
        reviews=30d;
        names[2]="5 Star Semi";
        System.out.println("The name of the gadgets is:"+name);
        System.out.println("The capacity of the x is:"+x);
		System.out.println("The capacity of machine is:"+kg);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The gst is:"+gst);
        System.out.println("The weight of the name is:"+weight);
        System.out.println("The different stock is:"+isAvailable);
        System.out.println("The reviews of the country is:"+reviews);
        System.out.println("The different product is:"+names[2]); 		
	    }
}