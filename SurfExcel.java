class SurfExcel {
    String variantName;         
    boolean isAvailable;        
    int stainRemovalPower;      
    double retailPrice;        
    public SurfExcel(String variantName, boolean isAvailable, int stainRemovalPower, double retailPrice) {
        this.variantName = variantName;
        this.isAvailable = isAvailable;
        this.stainRemovalPower = stainRemovalPower;
        this.retailPrice = retailPrice;

        System.out.println("Variant Name : " + variantName + " isAvailable in stores : " + isAvailable 
                           + " Stain Removal Power : " + stainRemovalPower + "/100 Cost : $" + retailPrice);
        
        startWashing();
    }

    public void startWashing() {
        System.out.println("Variant " + variantName + " is being used, starting to wash : " + isAvailable);
        stopWashing();
    }
    public int setWaterTemperature(int temperature) {
        System.out.println("Water temperature set to " + temperature + "°C");
        return -1;
    }
    public void stopWashing() {
        System.out.println("Washing complete. Remaining power level: " + stainRemovalPower);
        
        setWaterTemperature(40); 
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("--- Creating Surfexcel Object ---");
        
        SurfExcel maticLiquid = new SurfExcel("Matic Liquid", true, 99, 15.99); 
        System.out.println("------------------------------------");
    }
}