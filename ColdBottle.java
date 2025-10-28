class ColdBottle extends Bottles{
        public void keepCold(){
            System.out.println("Cold bottle keeps water cool for 24 hours!");
        }
        public void bottleColor(){
            System.out.println("The cold bottle comes in silver and blue colors.");
        }

        public static void main(String[] args){
            Bottles b = new ColdBottle();
            b.storeWater();
            b.materialType();

            ColdBottle cb = (ColdBottle)b;
            cb.keepCold();
            cb.bottleColor();

            System.out.println(cb instanceof Bottles);

            if(b instanceof ColdBottle){
                ColdBottle chill = (ColdBottle)b;
                chill.keepCold();
                chill.bottleColor();
                chill.storeWater();
            } else {
                System.out.println("Not a ColdBottle object");
            }
		}
}