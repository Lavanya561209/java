class Exam{
	static int rollNo=27;
	static String name="Radha";
	static long contactNumber=9876543291L;
	static boolean prepared=true;
	static char exceptedResult=90;
	public static void studentEligibility(){
		int marks=70;
		String branch="BCA";
		boolean isPassed=false;
		System.out.println("The student name is:"+name);
		System.out.println("The student belongs to branch name is:"+branch);
		System.out.println("The register number of student is:"+rollNo);
		System.out.println("The outcome of the performance in exam is:"+prepared);
	}
	public static void upComingExams(){
		double number=34.897d;
		byte percentage=85;
		System.out.println("The number is:"+number);
		System.out.println("The excepted percentage in exam is:"+percentage);
		System.out.println("Promoted to next class");
		System.out.println("The results are announced is:"+exceptedResult);
		System.out.println("The reference number is:"+contactNumber);
		
	}
}