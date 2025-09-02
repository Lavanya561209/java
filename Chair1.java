class Chair1{
		static String nut="Steel";
		static char cm=60;
		static byte off=10;
		static long numbers=8776543291l;
		static int price=3000;
        static float gst=1.2356f;
        static short kg=60;
        static boolean isAvailable=false;
        static double reviews=240d;
        static String[] names={"Hokipo","Nilkamal","Arlavya","Marius"};
	    public static void main(String [] args){
        nut="Galvanized";
        cm=67;
        off=15;
        numbers=9523521734l;
        price=3990;
        gst=2.3575f;
        kg=110;
        isAvailable=true;
        reviews=250d;
        names[1]="Loberget";
        System.out.println("The different material is used:"+nut);
        System.out.println("The product of centimeter is:"+cm);
		System.out.println("The offer of the product is:"+off);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The gst of product is:"+gst);
        System.out.println("The weight of the product is:"+kg);
        System.out.println("The different stock is:"+isAvailable);
        System.out.println("The reviews of the country is:"+reviews);
        System.out.println("The different product is:"+names[1]); 		
	    }
}