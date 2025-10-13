class LifeBuoy {
    String soapType;            
    boolean isGermProtection;   
    int latherVolume;          
    double netWeightInGrams;    

   
    public LifeBuoy(String soapType, boolean isGermProtection, int latherVolume, double netWeightInGrams) {
        this.soapType = soapType;
        this.isGermProtection = isGermProtection;
        this.latherVolume = latherVolume;
        this.netWeightInGrams = netWeightInGrams;

        
        System.out.println("Soap Type : " + soapType + " Germ Protection : " + isGermProtection 
                           + " Lather Volume : " + latherVolume + "/100 Net Weight : " + netWeightInGrams + "g");
        
       
        beginLathering();
    }

    public void beginLathering() {
       
        System.out.println("Using " + soapType + ", beginning to lather : " + isGermProtection);
        finishRinsing();
    }

    public int adjustWaterFlow(int flowRate) {
        System.out.println("Water flow rate adjusted to " + flowRate + " LPM");
        return -1;
    }

    public void finishRinsing() {
        System.out.println("Rinsing completed. Max germ kill rating: " + latherVolume + "/100");
        
        adjustWaterFlow(10); 
    }
    
    public static void main(String[] args) {
        
        System.out.println("--- Creating LifeBuoy Object ---");
       
        LifeBuoy totalProtect = new LifeBuoy("Total Protect", true, 85, 125.0); 
        System.out.println("------------------------------------");
    }
}