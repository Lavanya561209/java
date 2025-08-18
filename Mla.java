class Mla {
   
    public static void main(String[] args) {
        
		byte age;                // age (small range)
    short yearElected;       // year elected
    int constituencyNumber;  // constituency number
    long votesReceived;      // number of votes received
    float attendancePercent; // attendance percentage
    double assetsValue;      // value of assets
    char gender;             // gender: 'M' or 'F'
    boolean isMinister;      // true if MLA is a minister
    String courses;      // about courses

        
        this age = 45;
        this yearElected = 2023;
        this constituencyNumber = 112;
        this votesReceived = 523456;
        this attendancePercent = 87.5f;
        this assetsValue = 15430000.75;
        this gender = 'M';
        this isMinister = true;
		this courses="B.com","BBA","M.Com","MBA/PGDM";

        void displayDetails(){
        System.out.println("MLA Details:");
        System.out.println("age: " + this age);
        System.out.println("yearElected: " + this yearElected);
        System.out.println("constituencyNumber: " + this constituencyNumber);
        System.out.println("votesReceived: " + this votesReceived);
        System.out.println("attendancePercentage: " + this attendancePercent);
        System.out.println("assetsValue: " + this assetsValue);
        System.out.println("gender: " + this gender);
        System.out.println("isMinister: " + this isMinister);
		System.out.println("the courses are:"+this courses);
		}
    }
	
}
 