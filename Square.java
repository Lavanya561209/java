class Square {
    int side;
    String shade;
    boolean isPainted;
    char symbol;

    public Square() {
        this(5);  
        System.out.println(" Square!");
    }

    public Square(int side) {
        this(7, "Blue");  
        System.out.println("Square initialized with custom side = " + this.side);
    }

    public Square(int side, String shade) {
        this(9, "Red", true);  
        System.out.println("Square with side: " + this.side + " and shade: " + this.shade);
    }

    public Square(int side, String shade, boolean isPainted) {
        this(10, "Green", true, 'S');  
        System.out.println("Square has shade: " + shade + " and current side: " + this.side);
    }

    public Square(int side, String shade, boolean isPainted, char symbol) {
        this.side = side;
        this.shade = shade;
        this.isPainted = isPainted;
        this.symbol = symbol;

        System.out.println("Final Square object created!");
        System.out.println(" Side Length: " + side);
        System.out.println(" Shade: " + shade);
        System.out.println(" Painted: " + isPainted);
        System.out.println(" Symbol: " + symbol);
    }
}