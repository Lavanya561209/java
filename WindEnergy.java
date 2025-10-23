class WindEnergy extends EnergySource {
    public void spinTurbines() {
        System.out.println("Spinning wind turbines to produce clean and renewable power!");
    }

    public static void main(String[] args) {
        EnergySource e = new WindEnergy();
        e.generate();
        WindEnergy we = (WindEnergy) e;
        we.spinTurbines();

        EnergySource energySolar = new SolarEnergy();
        energySolar.generate();
        SolarEnergy se = (SolarEnergy) energySolar;
        se.absorbSunlight();

        System.out.println(we instanceof EnergySource);
	}
}