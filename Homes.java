class Homes {
    String ownerName;
    char type;          
    byte rooms;
    short areaSqFt;
    int priceUSD;
    long builtYear;
    float gardenSize;   
    double distanceToCity; 
    boolean hasGarage;

    public static void main(String[] args) {
        Homes h0 = new Homes();
        h0.ownerName = "Ravi"; 
        h0.type = 'H'; 
        h0.rooms = 4; 
        h0.areaSqFt = 2200; 
        h0.priceUSD = 250000; 
        h0.builtYear = 2010; 
        h0.gardenSize = 500.5f; 
        h0.distanceToCity = 12.5; 
        h0.hasGarage = true;
		
		System.out.println("Home Details of h0:");
        System.out.println("Owner: " + h0.ownerName);
        System.out.println("Type: " + h0.type);
        System.out.println("Rooms: " + h0.rooms);
        System.out.println("Area (sq ft): " + h0.areaSqFt);
        System.out.println("Price (USD): " + h0.priceUSD);
        System.out.println("Built Year: " + h0.builtYear);
        System.out.println("Garden Size: " + h0.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h0.distanceToCity + " km");
        System.out.println("Has Garage: " + h0.hasGarage);
        System.out.println("===============================");

        Homes h1 = new Homes();
        h1.ownerName = "Anita"; 
        h1.type = 'A'; 
        h1.rooms = 3; 
        h1.areaSqFt = 1200; 
        h1.priceUSD = 150000; 
        h1.builtYear = 2018; 
        h1.gardenSize = 0; 
        h1.distanceToCity = 5.0; 
        h1.hasGarage = false;
		
		System.out.println("Home Details of h1:");
        System.out.println("Owner: " + h1.ownerName);
        System.out.println("Type: " + h1.type);
        System.out.println("Rooms: " + h1.rooms);
        System.out.println("Area (sq ft): " + h1.areaSqFt);
        System.out.println("Price (USD): " + h1.priceUSD);
        System.out.println("Built Year: " + h1.builtYear);
        System.out.println("Garden Size: " + h1.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h1.distanceToCity + " km");
        System.out.println("Has Garage: " + h1.hasGarage);
        System.out.println("===============================");

        Homes h2 = new Homes();
        h2.ownerName = "Suresh"; 
        h2.type = 'V'; 
        h2.rooms = 5; 
        h2.areaSqFt = 3500; 
        h2.priceUSD = 450000; 
        h2.builtYear = 2015; 
        h2.gardenSize = 800.0f; 
        h2.distanceToCity = 20.0; 
        h2.hasGarage = true;
		
		System.out.println("Home Details of h2:");
        System.out.println("Owner: " + h2.ownerName);
        System.out.println("Type: " + h2.type);
        System.out.println("Rooms: " + h2.rooms);
        System.out.println("Area (sq ft): " + h2.areaSqFt);
        System.out.println("Price (USD): " + h2.priceUSD);
        System.out.println("Built Year: " + h2.builtYear);
        System.out.println("Garden Size: " + h2.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h2.distanceToCity + " km");
        System.out.println("Has Garage: " + h2.hasGarage);
        System.out.println("===============================");

        Homes h3 = new Homes();
        h3.ownerName = "Priya"; 
        h3.type = 'H'; 
        h3.rooms = 3; 
        h3.areaSqFt = 1800; 
        h3.priceUSD = 200000; 
        h3.builtYear = 2008; 
        h3.gardenSize = 300.0f; 
        h3.distanceToCity = 10.0; 
        h3.hasGarage = true;
		
		System.out.println("Home Details of h3:");
        System.out.println("Owner: " + h3.ownerName);
        System.out.println("Type: " + h3.type);
        System.out.println("Rooms: " + h3.rooms);
        System.out.println("Area (sq ft): " + h3.areaSqFt);
        System.out.println("Price (USD): " + h3.priceUSD);
        System.out.println("Built Year: " + h3.builtYear);
        System.out.println("Garden Size: " + h3.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h3.distanceToCity + " km");
        System.out.println("Has Garage: " + h3.hasGarage);
        System.out.println("===============================");

        Homes h4 = new Homes();
        h4.ownerName = "Vikram"; 
        h4.type = 'A'; 
        h4.rooms = 2; 
        h4.areaSqFt = 900; 
        h4.priceUSD = 100000; 
        h4.builtYear = 2020; 
        h4.gardenSize = 0; 
        h4.distanceToCity = 2.0; 
        h4.hasGarage = false;
		
		System.out.println("Home Details of h4:");
        System.out.println("Owner: " + h4.ownerName);
        System.out.println("Type: " + h4.type);
        System.out.println("Rooms: " + h4.rooms);
        System.out.println("Area (sq ft): " + h4.areaSqFt);
        System.out.println("Price (USD): " + h4.priceUSD);
        System.out.println("Built Year: " + h4.builtYear);
        System.out.println("Garden Size: " + h4.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h4.distanceToCity + " km");
        System.out.println("Has Garage: " + h4.hasGarage);
        System.out.println("===============================");

        Homes h5 = new Homes();
        h5.ownerName = "Meera"; 
        h5.type = 'V'; 
        h5.rooms = 6; 
        h5.areaSqFt = 4000; 
        h5.priceUSD = 500000; 
        h5.builtYear = 2012; 
        h5.gardenSize = 1000.0f; 
        h5.distanceToCity = 15.0; 
        h5.hasGarage = true;
		
		System.out.println("Home Details of h5:");
        System.out.println("Owner: " + h5.ownerName);
        System.out.println("Type: " + h5.type);
        System.out.println("Rooms: " + h5.rooms);
        System.out.println("Area (sq ft): " + h5.areaSqFt);
        System.out.println("Price (USD): " + h5.priceUSD);
        System.out.println("Built Year: " + h5.builtYear);
        System.out.println("Garden Size: " + h5.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h5.distanceToCity + " km");
        System.out.println("Has Garage: " + h5.hasGarage);
        System.out.println("===============================");

        Homes h6 = new Homes();
        h6.ownerName = "Rahul"; 
        h6.type = 'H'; 
        h6.rooms = 4; 
        h6.areaSqFt = 2000; 
        h6.priceUSD = 220000; 
        h6.builtYear = 2005; 
        h6.gardenSize = 400.0f; 
        h6.distanceToCity = 8.0; 
        h6.hasGarage = true;
		
		System.out.println("Home Details of h6:");
        System.out.println("Owner: " + h6.ownerName);
        System.out.println("Type: " + h6.type);
        System.out.println("Rooms: " + h6.rooms);
        System.out.println("Area (sq ft): " + h6.areaSqFt);
        System.out.println("Price (USD): " + h6.priceUSD);
        System.out.println("Built Year: " + h6.builtYear);
        System.out.println("Garden Size: " + h6.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h6.distanceToCity + " km");
        System.out.println("Has Garage: " + h6.hasGarage);
        System.out.println("===============================");

        Homes h7 = new Homes();
        h7.ownerName = "Sonia"; 
        h7.type = 'A'; 
        h7.rooms = 3; 
        h7.areaSqFt = 1100; 
        h7.priceUSD = 140000; 
        h7.builtYear = 2019; 
        h7.gardenSize = 0; 
        h7.distanceToCity = 4.5; 
        h7.hasGarage = false;
		
		System.out.println("Home Details of h7:");
        System.out.println("Owner: " + h7.ownerName);
        System.out.println("Type: " + h7.type);
        System.out.println("Rooms: " + h7.rooms);
        System.out.println("Area (sq ft): " + h7.areaSqFt);
        System.out.println("Price (USD): " + h7.priceUSD);
        System.out.println("Built Year: " + h7.builtYear);
        System.out.println("Garden Size: " + h7.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h7.distanceToCity + " km");
        System.out.println("Has Garage: " + h7.hasGarage);
        System.out.println("===============================");

        Homes h8 = new Homes();
        h8.ownerName = "Karan"; 
        h8.type = 'V'; 
        h8.rooms = 5; 
        h8.areaSqFt = 3600; 
        h8.priceUSD = 480000; 
        h8.builtYear = 2016; 
        h8.gardenSize = 900.0f; 
        h8.distanceToCity = 18.0; 
        h8.hasGarage = true;
		
		System.out.println("Home Details of h8:");
        System.out.println("Owner: " + h8.ownerName);
        System.out.println("Type: " + h8.type);
        System.out.println("Rooms: " + h8.rooms);
        System.out.println("Area (sq ft): " + h8.areaSqFt);
        System.out.println("Price (USD): " + h8.priceUSD);
        System.out.println("Built Year: " + h8.builtYear);
        System.out.println("Garden Size: " + h8.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h8.distanceToCity + " km");
        System.out.println("Has Garage: " + h8.hasGarage);
        System.out.println("===============================");

        Homes h9 = new Homes();
        h9.ownerName = "Tina"; 
        h9.type = 'H'; 
        h9.rooms = 4; 
        h9.areaSqFt = 1900; 
        h9.priceUSD = 210000; 
        h9.builtYear = 2011; 
        h9.gardenSize = 350.0f; 
        h9.distanceToCity = 9.0; 
        h9.hasGarage = true;
		
		System.out.println("Home Details of h9:");
        System.out.println("Owner: " + h9.ownerName);
        System.out.println("Type: " + h9.type);
        System.out.println("Rooms: " + h9.rooms);
        System.out.println("Area (sq ft): " + h9.areaSqFt);
        System.out.println("Price (USD): " + h9.priceUSD);
        System.out.println("Built Year: " + h9.builtYear);
        System.out.println("Garden Size: " + h9.gardenSize + " sq ft");
        System.out.println("Distance to City: " + h9.distanceToCity + " km");
        System.out.println("Has Garage: " + h9.hasGarage);
        System.out.println("===============================");
    }
}