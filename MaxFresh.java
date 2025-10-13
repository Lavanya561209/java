class MaxFresh {
    String flavorName;         
    boolean isFluorideAdded;    
    int freshnessDuration;      
    double tubeWeightInGrams;
    public MaxFresh(String flavorName, boolean isFluorideAdded, int freshnessDuration, double tubeWeightInGrams) {
        this.flavorName = flavorName;
        this.isFluorideAdded = isFluorideAdded;
        this.freshnessDuration = freshnessDuration;
        this.tubeWeightInGrams = tubeWeightInGrams;
        System.out.println("Flavor : " + flavorName + " Fluoride Added : " + isFluorideAdded 
                           + " Freshness Duration : " + freshnessDuration + " minutes Weight : " + tubeWeightInGrams + "g");
        beginBrushing();
    }
    public void beginBrushing() {
       
        System.out.println("Applying " + flavorName + ", beginning to brush : " + isFluorideAdded);
        finishBrushing();
    }
    public int adjustBrushingPressure(int pressure) {
        System.out.println("Brushing pressure adjusted to " + pressure + " PSI");
        return -1;
    }

    public void finishBrushing() {
        System.out.println("Brushing complete. Max freshness lasts for: " + freshnessDuration + " minutes");
       
        adjustBrushingPressure(60); 
    }
    
  
    public static void main(String[] args) {
        System.out.println("--- Creating MaxFresh Object ---");
        MaxFresh icyMenthol = new MaxFresh("Icy Menthol", true, 45, 150.0); 
        System.out.println("------------------------------------");
    }
}