class Harpic {
    String productType;    
    char quantityCode;     
    String fragrance;      
    double cost;           

    public Harpic() {
        this("Bathroom Cleaner");  
        System.out.println("Harpic product !!!!!!!!!");
    }

    public Harpic(String productType) {
        this("Toilet Cleaner", (char)200);  
        System.out.println("Product Type is : " + this.productType + " which gives shining and freshness...");
    }

    public Harpic(String productType, char quantityCode) {
        this("Floor Cleaner", 'M', "Lemon");  
        System.out.println("Cleaner Type : " + this.productType + " available in quantity code : " + this.quantityCode);
        System.out.println("Fragrance used is : " + this.fragrance);
    }

    public Harpic(String productType, char quantityCode, String fragrance) {
        this("Disinfectant", 'S', "Ocean Fresh", 149.50);  
        System.out.println("Maybe upgraded to product : " + this.productType + " with quantity code : " + this.quantityCode);
        System.out.println("And added fragrance : " + this.fragrance + " priced approximately : " + this.cost);
    }

    public Harpic(String productType, char quantityCode, String fragrance, double cost) {
        this.productType = productType;
        this.quantityCode = quantityCode;
        this.fragrance = fragrance;
        this.cost = cost;

        System.out.println("Harpic product details !");
        System.out.println(" Product Type: " + productType);
        System.out.println(" Quantity Code: " + quantityCode);
        System.out.println(" Fragrance: " + fragrance);
        System.out.println(" Cost: " + cost);
    }
}