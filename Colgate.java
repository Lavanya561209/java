class Colgate
{
    static byte warranty;
    static short weight;       
    static int quantity;      
    static long price;    
    static double fluoridePercent;
    static String flavor;
    static char grade;    
    static float length; 
    static boolean isHerbal;

    public static byte warranty(){
        warranty = 1; 
        return warranty;
    }

    public static short weight(){
        weight = 200; 
        return weight;
    }

    public static int quantity(){
        quantity = 150; 
        return quantity;
    }

    public static long price(){
        price = 120L;
        return price;
    }

    public static double fluoridePercent(){
        fluoridePercent = 0.32; 
        return fluoridePercent;
    }

    public static String flavor(){
        flavor = "Mint";
        return flavor;
    }

    public static char grade(){
        grade = 'A'; 
        return grade;
    }

    public static float length(){
        length = 18.5f;
        return length;
    }

    public static boolean isHerbal(){
        isHerbal = false;
        return isHerbal;
    }

    public static void workProcess(){
        System.out.println("This is Colgate Toothpaste Details.");
    }

    public static void main(String[] args){
        System.out.println("=== Colgate ===");
        System.out.println("Warranty : " + warranty() + " year");
        System.out.println("Weight : " + weight() + " g");
        System.out.println("Quantity : " + quantity() + " ml");
        System.out.println("Price : ₹" + price());
        System.out.println("Fluoride Percent : " + fluoridePercent() + "%");
        System.out.println("Flavor : " + flavor());
        System.out.println("Grade : " + grade());
        System.out.println("Tube Length : " + length() + " cm");
        System.out.println("Is Herbal? : " + isHerbal());
        workProcess();
    }
}