class DailyRoutine1{
	public static void earlyMorning(){
		System.out.println("I wake early morning at 6:00 am in the morning");
		breakfast();
	}
	public static void breakfast(){
		System.out.println("I had breakfast at 9:30 am in the morning");
		lunch();
	}
	public static void lunch(){
		System.out.println("I had lunch at 1:30 pm in the afternoon");
		evening();
	}
	public static void evening(){
		System.out.println("The had a cup of milk at the evening");
		dinner();
	}
	public static void dinner(){
		System.out.println("The dinner at 8:30 at night");
	}
	public static void main(String[] args){
		earlyMorning();
	}
	
}