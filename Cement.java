class Cement{
		static String material="Companies";
		static char grading='B';
		static byte packets=4;
		static long numbers=8976543291l;
		static int price=377;
        static float chloride=0.22f;
        static short weight=40;
        static boolean isAvailable=false;
        static double reviews=100d;
        static String[] name={"Ultra Tech","ACC Cement","Shree Cement","Dalmia Cement"};
	    public static void main(String [] args){
        material="Company names";
        grading='A';
        packets=5;
        numbers=9823521734l;
        price=1885;
        chloride=0.33f;
        weight=50;
        isAvailable=true;
        reviews=120d;
        name[3]="JK Cement";
        System.out.println("The materials are used is:"+material);
        System.out.println("The grading of the product is is:"+grading);
		System.out.println("The packing is:"+packets);
        System.out.println("The different number is:"+numbers);
        System.out.println("The price of the product is:"+price);
        System.out.println("The material is used:"+chloride);
        System.out.println("The weight of the product is:"+weight);
        System.out.println("The different stock is:"+isAvailable);
        System.out.println("The reviews of the product is:"+reviews);
        System.out.println("The different product is:"+name[3]); 		
	    }
}