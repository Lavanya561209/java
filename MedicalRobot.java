class MedicalRobot extends Robot {
    public void assistSurgery() {
        System.out.println("Medical robot is assisting doctors in a precise surgical operation");
    }

    public static void main(String[] args) {
        Robot r = new MedicalRobot();
        r.start(); 
        MedicalRobot mr = (MedicalRobot) r;
        mr.assistSurgery();

        Robot service = new ServiceRobot();
        service.start();
        ServiceRobot sr = (ServiceRobot) service;
        sr.cleanRoom();
        System.out.println(mr instanceof Robot);
	}
}