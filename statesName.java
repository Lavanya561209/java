class statesName {
    public static void main(String[] args) {
        String[] namesOfIndia = {
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh",
            "Goa", "Gujarat", "Haryana", "Karnataka", "Tripura"
        };
        System.out.println("statesName:");
        for (int i = 0; i < namesOfIndia.length; i++) {
            System.out.println("Names of india: " +namesOfIndia [i]);
        }
	System.out.println("==============");
        for (String name : namesOfIndia) {
            System.out.println("statesName: " +name );
            
        }
    }
}