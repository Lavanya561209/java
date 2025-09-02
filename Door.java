class Door{
		static String material="Plastic";
		static char grading='B';
		static byte capacity=1;
		static long numbers=8976543291l;
		static int price=4000;
        static float rating=0.22f;
        static short weight=400;
        static boolean isAvailable=false;
        static double reviews=100d;
        static String[] name={"Polished Steel","Interior Wooden","Designed Interior","Membrance Designer"};
	    public static void main(String [] args){
        material="Wooden";
        grading='A';
        capacity=5;
        numbers=9823521734l;
        price=4500;
        rating=0.33f;
        weight=500;
        isAvailable=true;
        reviews=120d;
        name[3]="Interior Wood";
        System.out.println("The materials are used is:"+material);
        System.out.println("The grading of the product is is:"+grading);
		System.out.println("The capacity of material is:"+capacity);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The rating of the product is:"+rating);
        System.out.println("The weight of the product is:"+weight);
        System.out.println("The different stock is:"+isAvailable);
        System.out.println("The reviews of the product is:"+reviews);
        System.out.println("The different product is:"+name[3]); 		
	    }
}