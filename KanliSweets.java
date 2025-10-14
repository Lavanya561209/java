class KanliSweets {
    String sweetName;
    int quantity;
    boolean isSugarFree;
    char sweetCode;

    public KanliSweets() {
        this("Sweet");  
        System.out.println(" Variety of sweets available in Kanli Sweets store!");
    }

    public KanliSweets(String sweetName) {
        this("Laddu", 10);  
        System.out.println(" Sweet name set to: " + sweetName);
    }

    public KanliSweets(String sweetName, int quantity) {
        this("Jalebi", 25, "Orange");  
        System.out.println(" Quantity set to " + quantity + " pieces for sweet: " + sweetName);
    }

    public KanliSweets(String sweetName, int quantity, String color) {
        this("KajuKatli", 15, "Silver", true);  
        System.out.println(" Color set to " + color + " for sweet: " + sweetName);
    }

    public KanliSweets(String sweetName, int quantity, String color, boolean isSugarFree) {
        this.sweetName = sweetName;
        this.quantity = quantity;
        this.isSugarFree = isSugarFree;
        this.sweetCode = 'K';

        System.out.println("Final KanliSweets object created!");
        System.out.println(" Sweet Name: " + sweetName);
        System.out.println(" Quantity: " + quantity);
        System.out.println(" Color: " + color);
        System.out.println(" Sugar Free: " + isSugarFree);
        System.out.println(" Sweet Code: " + sweetCode);
    }
}