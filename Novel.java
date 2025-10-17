class Novel extends Books {
	@Override
	public void pages(){
		System.out.println(" Total number of pages");
	}
	@Override
	public void list(){
		System.out.println("Content list");
	}
	@Override
	public void made(){
		System.out.println("Novel has made in india");
	}
}
