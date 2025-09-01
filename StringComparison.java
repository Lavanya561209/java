class StringComparison {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        if (str1 == str2) { 
            System.out.println("str1 == str2 is true.");
        }

        if (str1 == str3) { 
            System.out.println("str1 == str3 is true.");
        } else {
            System.out.println("str1 == str3 is false.");
        }

        if (str1.equals(str3)) { 
            System.out.println("str1.equals(str3) is true.");
        }
    }
}