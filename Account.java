class Account extends Banks {
	@Override
	public void gst(){
		System.out.println("We should pay gst");
	}
	@Override
	public void documents(){
		System.out.println("They will keep documents as confidential");
	}
	@Override
	public void rules(){
		System.out.println("Accont holders should follow some rules and regulations");
	}
}
