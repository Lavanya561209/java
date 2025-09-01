class CountryNames{
		static String name="Vatican";
		static char x='A';
		static byte infinity=45;
		static long numbers=8796543291l;
		static int price=5500;
        static float gst=1.4356f;
        static short weight=500;
        static boolean isAvailable=false;
        static double reviews=45d;
        static String[] names={"Asia","America","Antartica","Russia"};
	    public static void main(String [] args){
        name="India";
        x='O';
        infinity=50;
        numbers=9723521734l;
        price=6000;
        gst=2.345f;
        weight=400;
        isAvailable=true;
        reviews=30d;
        names[2]="Russia";
        System.out.println("The name of the country is:"+name);
        System.out.println("The capacity of the x is:"+x);
		System.out.println("The infinity of the different name is:"+infinity);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The gst is:"+gst);
        System.out.println("The weight of the name is:"+weight);
        System.out.println("The different stock is:"+isAvailable);
        System.out.println("The reviews of the country is:"+reviews);
        System.out.println("The different name of the country used:"+names[2]); 		
	    }
}