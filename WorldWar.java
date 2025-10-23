class WorldWar extends Wars {
    public void globalBattle() {
        System.out.println("World war erupts — multiple countries join the global conflict");
    }

    public static void main(String[] args) {
        Wars w = new WorldWar();
        w.startWar();
        WorldWar ww = (WorldWar) w;
        ww.globalBattle();

        Wars civil = new CivilWar();
        civil.startWar();
        CivilWar cw = (CivilWar) civil;
        cw.internalConflict();

        System.out.println(ww instanceof Wars);
	}
}