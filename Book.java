class Book{
	static String kind="intelligent";
	static int percentage=72;
	static char grade='A';
	static float value=5.2f;
	static double number=5678d;
	public static void biology(){
		System.out.println("Biology is my favourite subject:"+kind);
		chemistry();
	}
	public static void chemistry(){
		System.out.println("I like chemistry little:"+percentage);
		physics();
	}
	public static void physics(){
		System.out.println("I like physics more than chemistry:"+grade);
		mathematics();
	}
	public static void mathematics(){
		System.out.println("I don't like mathematics:"+value);
		none();
	}
	public static void none(){
		System.out.println("Nothing else:"+number);
	}
	public static void main(String[] args){
		biology();
	} 
}