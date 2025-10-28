class ScientificCalculator extends Calculator {
    public void addition() {
        System.out.println("Performing addition of two numbers");
    }

    public void squareRoot() {
        System.out.println("Calculating the square root of a number");
    }

    public static void main(String[] args) {
        Calculator calc = new ScientificCalculator();
        calc.start();
        calc.shutdown();

        ScientificCalculator sciCalc = (ScientificCalculator) calc;
        sciCalc.addition();
        sciCalc.squareRoot();

        System.out.println(sciCalc instanceof ScientificCalculator);
	}
}