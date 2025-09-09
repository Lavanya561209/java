class Data{
	 static  String names="Rama";
	 static  char alphabets='A';
     static  byte numbers=28;
	 static  long phoneNumbers=8867374592l;
	 static  int price=39000;
	 static float gst=23.456f;
	 static short weight=700;
	 static boolean isAvailable=true;
	 static double reviews=34d;
	 static String[] members={"Shafiya","Sumeriya","Farveen"};
	 public static void main (String[] args){
		System.out.println("The name of the person is:"+names);
		System.out.println("The grade of the every person:"+alphabets);
		System.out.println("The different capacity is:"+numbers);
		System.out.println("The different contact number is:"+phoneNumbers);
		System.out.println("The cost of product is:"+price);
		System.out.println("The cost of gst id:"+gst);
		System.out.println("The average weight of different product is:"+weight);
		System.out.println("The product of stock ratings are:"+isAvailable);
		System.out.println("How many they have watched:"+reviews);
		System.out.println("The different workers are:"+members[2]);
	}
}
