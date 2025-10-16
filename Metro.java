class Metro extends Trains {
	@Override
	public void ticket(){
		System.out.println("Ticket published");
	}
	@Override
	public void seatingArrangement(){
		System.out.println("Seating are reserved");
	}
}
