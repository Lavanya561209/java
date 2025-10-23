 class Vitamin extends Nutrition {
    public void boostImmunity() {
        System.out.println("Vitamins boost immunity and keep your body energetic");
    }
	
 public static void main(String[] args) {
        Nutrition n = new Vitamin();
        n.consume();
        Vitamin v = (Vitamin) n;
        v.boostImmunity();

        Nutrition nutriProtein = new Protein();
        nutriProtein.consume();
        Protein p = (Protein) nutriProtein;
        p.buildMuscles();

        System.out.println(v instanceof Nutrition);
    }
}