class Manager extends Employees {
	@Override
	public void salary(){
		System.out.println("The salary has more to manager"); 
	}
	@Override
	public void timings(){
		System.out.println("Office timings is differnt from employees");
	}
	@Override
	public void lunchBreak(){
		System.out.println("The manager will eat lunch at afternoon"); 
	}
}
