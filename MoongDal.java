class MoongDal extends Dal {
    public void makeKhichdi() {
        System.out.println("Moong dal is used to prepare light and healthy khichdi");
    }

    public static void main(String[] args) {
        Dal d = new MoongDal();
        d.cook();
        MoongDal md = (MoongDal) d;
        md.makeKhichdi();

        Dal dalToor = new ToorDal();
        dalToor.cook();
        ToorDal td = (ToorDal) dalToor;
        td.makeSambar();
		
        System.out.println(md instanceof Dal);
	}
}