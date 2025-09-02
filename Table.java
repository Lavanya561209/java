class Table{
		static String material="All type";
		static char x=88;
		static byte length=40;
		static long numbers=8976543291l;
		static int price=3000;
        static float gst=1.4356f;
        static short weight=500;
        static boolean isAvailable=false;
        static double reviews=187d;
        static String[] names={"EUROQON FOLD","PRIVILON","BOTWIN","CELLO"};
	    public static void main(String [] args){
        material="Laminate";
        x=95;
        length=43;
        numbers=9823521734l;
        price=3790;
        gst=2.345f;
        weight=600;
        isAvailable=true;
        reviews=1184d;
        names[3]="IKEA SANDSBERG";
        System.out.println("The materials are used is:"+material);
        System.out.println("The capacity of the x is:"+x);
		System.out.println("The length of the table is:"+length);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The gst is:"+gst);
        System.out.println("The weight of the table is:"+weight);
        System.out.println("The different stock is:"+isAvailable);
        System.out.println("The reviews of the table is:"+reviews);
        System.out.println("The different product is:"+names[3]); 		
	    }
}