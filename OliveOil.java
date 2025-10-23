class OliveOil extends Oil {
    public void cooking() {
        System.out.println("Using olive oil for healthy cooking");
    }

    public static void main(String[] args) {
        
        Oil o = new OliveOil();
        o.use(); 

        
        OliveOil oo = (OliveOil) o;
        oo.cooking();

       
        Oil coo = new CocountOil();
        coo.use();

       
        CocountOil cooil = (CocountOil)coo;
        cooil.hairCare();

        
        System.out.println(oo instanceof Oil);
    }
}