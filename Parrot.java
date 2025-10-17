class Parrot extends Bird {
	@Override
	public void takeCare(){
		System.out.println("Parrot will take care of their babies");
	}
	@Override
	public void feed(){
		System.out.println("Parrot will give their food to their babies");
	}
	@Override
	public void construct(){
		System.out.println("The  parrots will make an new house for their shelter");
	}
}
