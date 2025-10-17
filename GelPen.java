class GelPen extends Pens{
    public void inkType() {
        System.out.println("This gel pen uses waterproof ink and gives a bold finish!");
    }

    public static void main(String[] args) {
        System.out.println("========= Super Class =========");
        Stationery s = new Stationery();
        s.item();

        System.out.println("======= Upcasting ========");
        Stationery st = new Pens();
        st.item();

        System.out.println("---------------------------");
        Pens p = new Pens();
        p.write();
        p.item();

        System.out.println("===========");
        GelPen gp = new GelPen();
        gp.write();
        gp.item();
        gp.inkType();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        Pens penRef = gp;
        penRef.write();
		penRef.item();
	}
}