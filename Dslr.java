class Dslr extends Camera {
	@Override
	public void adjust(){
		System.out.println("Adjustment sizes are provided");
	}
	@Override
	public void delete(){
		System.out.println("We can delete an photo copy");
	}
	@Override
	public void clarity(){
		System.out.println("It has good clarity");
	}
}
