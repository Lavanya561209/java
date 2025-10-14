class SpeechRecognition {
    String speechText;      
    double accuracyRate;    
    boolean isRecognized;   
    long recordedTime;      

    public SpeechRecognition() {
        this("Unidentified Speech");  
        System.out.println("speech ");
    }

    public SpeechRecognition(String speechText) {
        this("Hello User", 0.0);  
        System.out.println("Speech text set to: " + speechText);
    }

    public SpeechRecognition(String speechText, double accuracyRate) {
        this("How are you?", 75.5, false); 
        System.out.println("Accuracy rate initialized to: " + accuracyRate);
    }

    public SpeechRecognition(String speechText, double accuracyRate, boolean isRecognized) {
        this("Welcome Back", 89.6, true, 1728593045000L); 
        System.out.println("Speech recognized status: " + isRecognized);
    }

    public SpeechRecognition(String speechText, double accuracyRate, boolean isRecognized, long recordedTime) {
        this.speechText = speechText;
        this.accuracyRate = accuracyRate;
        this.isRecognized = isRecognized;
        this.recordedTime = recordedTime;

        System.out.println("Final SpeechRecognition object created!");
        System.out.println(" Speech Text: " + speechText);
        System.out.println(" Accuracy Rate: " + accuracyRate);
        System.out.println(" Recognized: " + isRecognized);
        System.out.println(" Recorded Time: " + recordedTime);
    }
}