class Indigo {
    String shadeName;           
    boolean isVisibleSpectrum;  
    int opacityPercentage;      
    double lightIntensity;      

    public Indigo(String shadeName, boolean isVisibleSpectrum, int opacityPercentage, double lightIntensity) {
        this.shadeName = shadeName;
        this.isVisibleSpectrum = isVisibleSpectrum;
        this.opacityPercentage = opacityPercentage;
        this.lightIntensity = lightIntensity;

        System.out.println("Shade Name : " + shadeName + " Is Visible Spectrum : " + isVisibleSpectrum 
                           + " Opacity : " + opacityPercentage + "% Light Intensity : " + lightIntensity + " lumens");
        
        illuminate();
    }

   
    public void illuminate() {
        System.out.println("Shade Name is : " + shadeName + " and then illuminate : " + isVisibleSpectrum);
        hide();
    }

    public int shiftFrequency(int frequency) {
        System.out.println("Shifted to frequency " + frequency + " THz");
        return -1;
    }
    public void hide() {
        System.out.println("Then hide it with opacity : " + opacityPercentage + "%");
        shiftFrequency(670); 
    }
    
  
    public static void main(String[] args) {
       
        System.out.println("--- Creating New Indigo Object ---");
        Indigo royalIndigo = new Indigo("Royal Indigo", true, 80, 5.2); 
        System.out.println("------------------------------------");
    }
}