class Ground {
    public Ground() {
        this(4500.75);
        System.out.println("The ground is open for practice sessions");
    }

    public Ground(double areaSize) {
        this(11,"Stadium");
        System.out.println("The total area of the ground is: " + areaSize + " sq.m.");
    }

    public Ground(int players,String gameType) {
        System.out.println( "Number of players in the game: " + players+"The game to be played:"+gameType);
    }
}
