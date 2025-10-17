class Alphonso extends MangoTree {
    public void sweetAroma() {
        System.out.println("The Alphonso mango spreads a rich, sweet aroma");
    }

    public static void main(String[] args) {
        System.out.println("===== Super class =====");
        Tree t = new Tree();
        t.grow();

        System.out.println("======= Up casting Example =======");
        Tree plant = new MangoTree();
        plant.grow();

        System.out.println("---------------");
        MangoTree mango = new MangoTree();
        mango.produceFruit();
        mango.grow();

        System.out.println("===========");
        Alphonso a = new Alphonso();
        a.produceFruit();
        a.grow();
        a.sweetAroma();

        System.out.println("$$$$$$$$$$$$$$");
        MangoTree mt = a;
        mt.produceFruit();
		mt.grow();
	}
}