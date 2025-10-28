 class Earth extends Planets{
        public void supportLife(){
            System.out.println("Earth supports life with air and water.");
        }
        public void showContinents(){
            System.out.println("Earth has 7 continents.");
        }

        public static void main(String[] args){
            Planets p = new Earth(); 
            p.rotate();
            p.revolve();

            Earth e = (Earth)p; 
            e.supportLife();
            e.showContinents();

            System.out.println(e instanceof Planets);

            if(p instanceof Earth){
                Earth earthObj = (Earth)p;
                earthObj.supportLife();
                earthObj.showContinents();
                earthObj.rotate();
            } else {
                System.out.println("Not an Earth object!");
            }
		}
    }