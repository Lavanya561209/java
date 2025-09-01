class Cab{
		static String name="Car";
		static char x='A';
		static byte infinity=45;
		static long numbers=8296543291l;
		static int price=500;
        static float gst=1.4256f;
        static short weight=1000;
        static boolean isAvailable=false;
        static double reviews=45d;
        static String[] names={"Ola","Uber","Aeroplane","Taxi"};
	    public static void main(String [] args){
        name="Vehicles";
        x='L';
        infinity=51;
        numbers=9723521778l;
        price=7000;
        gst=2.465f;
        weight=600;
        isAvailable=true;
        reviews=35d;
        names[2]="Auto";
        System.out.println("The type is used:"+name);
        System.out.println("The capacity of the x is:"+x);
		System.out.println("The infinity of the:"+infinity);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The gst is:"+gst);
        System.out.println("The capacity is:"+weight);
        System.out.println("The different modes is:"+isAvailable);
        System.out.println("The reviews of the rating is:"+reviews);
        System.out.println("The different modes is used:"+names[2]); 		
	    }
}