class Language{
	static String name="favourite language";
	static char grade='A';
	static float value=5.2f;
	static double percentage=99;
	static byte used=10;
	public static void kannada(){
		System.out.println("kannada is my mother toungue language:"+name);																																																																									
		telugu();
	}
	public static void telugu(){
		System.out.println("I know telugu language to speak well:"+grade);
		hindi();
	}
	public static void hindi(){
		System.out.println("Hindi is an national language in india:"+value);
		english();
	}
	public static void english(){
		System.out.println("English is an foriegn language:"+percentage);
		tamil();
	}
	public static void tamil(){
		System.out.println("Tamil language is most popular in tamil nadu:"+used);
	}
	public static void main(String [] args){
		kannada();
	}
}