class DecorativeSunflower extends Sunflower {
    public void decorateGarden() {
        System.out.println("Decorative Sunflowers are used to beautify gardens and homes");
    }

    public static void main(String[] args) {
        Sunflower s = new DecorativeSunflower();
        s.grow(); 
        DecorativeSunflower ds = (DecorativeSunflower) s;
        ds.decorateGarden();

        Sunflower oilSun = new OilSunflower();
        oilSun.grow();
        OilSunflower os = (OilSunflower) oilSun;
        os.produceOil();

        System.out.println(ds instanceof Sunflower);
	}
}