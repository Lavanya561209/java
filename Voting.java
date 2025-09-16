class Voting{
	static int roomNo=12;
	static String election="General Election";
	static long chalanNo=4563792L;
	static boolean isStarted=true;
	static char age=56;
	public static void Member(){
		int id=48;
		String name="Kalyan";
		char grade='A';
		System.out.println("Member name is:"+name);
		System.out.println("Member id is:"+id);
		System.out.println("Different election conducted is:"+election);
		System.out.println("The grade given to the member is:"+grade);
	}
	public static void Supporter(){
		double amount=345.897d;
		byte percentage=88;
		System.out.println("The alloted room is:"+roomNo);
		System.out.println("The total amount is available:"+amount);
		System.out.println("The percentage of supporters is:"+percentage);
	}
	public static void main(String[] args){
		Member();
		Supporter();
		System.out.println("The chalan number is:"+chalanNo);
		System.out.println("The voting day is started:"+isStarted);
		Exam.studentEligibility();
		Exam.upComingExams();
	}
}