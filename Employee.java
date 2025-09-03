class Employee{
	static String name="Rama";
	static int id=1072;
	static double salary=459034.56d;
	static String department="IT Field";
	static boolean isPermanent=true;
	public static void personName(){
		System.out.println("Employee name is:"+name);
		contactNumber();
	}
	public static void contactNumber(){
		System.out.println("Employee number is:"+id);
		salary();
	}
	public static void salary(){
		System.out.println("Employee salary is:"+salary);
		working();
	}
	public static void working(){
		System.out.println("Employee working location is:"+department);
		status();
	}
	public static void status(){
		System.out.println("Employee status are:"+isPermanent);
	}
	public static void main(String[] args){
		personName();
	} 
}