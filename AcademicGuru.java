class AcademicGuru extends Guru {
    public void teach() {
        System.out.println("Academic Guru imparts knowledge and mentors students for excellence");
    }

    public static void main(String[] args) {
        Guru g = new AcademicGuru();
        g.guide();
        AcademicGuru ag = (AcademicGuru) g;
        ag.teach();

   
        Guru spiritual = new SpiritualGuru();
        spiritual.guide();
        SpiritualGuru sg = (SpiritualGuru) spiritual;
        sg.meditate();

        System.out.println(ag instanceof Guru);
	}
}