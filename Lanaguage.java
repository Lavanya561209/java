class Language{
	public static void kannada(){
		System.out.println("kannada is my mother toungue language");
		telugu();
	}
	public static void telugu(){
		System.out.println("I know telugu language to speak well");
		hindi();
	}
	public static void hindi(){
		System.out.println("Hindi is an national language in india");
		english();
	}
	public static void english(){
		System.out.println("English is an foriegn language");
		tamil();
	}
	public static void tamil(){
		System.out.println("Tamil language is most popular in tamil nadu");
	}
	public static void main(String [] args){
		kannada();
	}
}