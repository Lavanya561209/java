class Refrigrator{
		static String name="Fridge";
		static char x=88;
		static byte liters=6;
		static long numbers=7776543291l;
		static int price=2000;
        static float gst=1.2356f;
        static short weight=400;
        static boolean isAvailable=false;
        static double reviews=40d;
        static String[] names={"LG","Samsung","Whirlpool","Croma"};
	    public static void main(String [] args){
        name="3-in 1";
        x=98;
        liters=7;
        numbers=8923521734l;
        price=19000;
        gst=2.3575f;
        weight=600;
        isAvailable=true;
        reviews=80d;
        names[2]="Haier";
        System.out.println("The name of the gadgets is:"+name);
        System.out.println("The capacity of the x is:"+x);
		System.out.println("The capacity of machine is:"+liters);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The gst is:"+gst);
        System.out.println("The weight of the name is:"+weight);
        System.out.println("The different stock is:"+isAvailable);
        System.out.println("The reviews of the country is:"+reviews);
        System.out.println("The different product is:"+names[2]); 		
	    }
}