class Waterfall extends Falls{
        public void height(){
            System.out.println("This waterfall is 100 meters tall");
        }

        public void sparkle(){
            System.out.println("The water sparkles under the sunlight");
        }

        public static void main(String[] args){
            Falls f = new Waterfall();
            f.flow();
            f.sound();

            Waterfall w = (Waterfall) f;
            w.height();
            w.sparkle();

            System.out.println(w instanceof Falls);

            if(f instanceof Waterfall){
                Waterfall wf = (Waterfall) f;
                wf.height();
                wf.sparkle();
                wf.flow();
            } else {
                System.out.println("No waterfall found");
            }
		}
    }
