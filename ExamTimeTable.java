class ExamTimeTable extends Schedule{
	public void firstPuc(){
		System.out.println("Exam starts after second year pu");
	}
	public void secondPuc(){
		System.out.println("Exam with commenced on march");
	}
	public static void main(String[] args){
		Schedule schedule=new ExamTimeTable();
		schedule.timings();
		schedule.leave();
		ExamTimeTable tt=(ExamTimeTable)schedule;
		tt.firstPuc();
		tt.secondPuc();
		System.out.println(tt instanceof ExamTimeTable);
	}
}