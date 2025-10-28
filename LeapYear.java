class LeapYear extends Years{
        public void checkLeap(){
            System.out.println("Leap year occurs every 4 years");
        }
        public void displayDays(){
            System.out.println("Leap year has 366 days.");
        }

        public static void main(String[] args){
            Years y = new LeapYear(); 
            y.showDecade();
            y.countYears();

            LeapYear ly = (LeapYear)y; 
            ly.checkLeap();
            ly.displayDays();

            System.out.println(ly instanceof Years);

            if(y instanceof LeapYear){
                LeapYear leap = (LeapYear)y;
                leap.checkLeap();
                leap.displayDays();
                leap.showDecade();
            } else {
                System.out.println("Not a Leap Year object");
            }
		}
}   