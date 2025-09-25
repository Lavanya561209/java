class Biscut
{
    public static byte quantity(){
        byte qty = 10;
        return qty;
    }

    public static short weight(){
        short wt = 250;
        return wt;
    }

    public static int price(){
        int cost = 50;
        return cost;
    }

    public static long barcode(){
        long code = 123456789012L;
        return code;
    }

    public static double calories(){
        double cal = 456.75;
        return cal;
    }

    public static String brand(){
        String name = "Parle-G"; 
        return name;
    }

    public static char grade(){
        char g = 'A';
        return g;
    }

    public static float length(){
        float len = 5.5f;
        return len;
    }

    public static boolean isSweet(){
        boolean sweet = true;
        return sweet;
    }

    public static void main(String[] args){
        System.out.println("=== Biscut Details ===");
        System.out.println("Quantity : " + quantity() + " pieces");
        System.out.println("Weight : " + weight() + " g");
        System.out.println("Price : ₹" + price());
        System.out.println("Barcode : " + barcode());
        System.out.println("Calories : " + calories() + " kcal");
        System.out.println("Brand : " + brand());
        System.out.println("Grade : " + grade());
        System.out.println("Length : " + length() + " cm");
        System.out.println("Sweet? : " + isSweet());
    }
}