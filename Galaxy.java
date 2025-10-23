class Galaxy extends Space {
    public void shine() {
        System.out.println("Billions of stars twinkling together form a beautiful galaxy");
    }

    public static void main(String[] args) {
        Space s = new Galaxy();
        s.explore();
        Galaxy g = (Galaxy) s;
        g.shine();

        Space spacePlanet = new Planet();
        spacePlanet.explore();
        Planet p = (Planet) spacePlanet;
        p.revolve();

        System.out.println(g instanceof Space);
	}
}