class LuggageWeight extends Weight {
    public void checkLimit() {
        System.out.println("Checking luggage weight to avoid excess baggage charges");
    }

    public static void main(String[] args) {
        Weight w = new LuggageWeight();
        w.measure();
        LuggageWeight lw = (LuggageWeight) w;
        lw.checkLimit();

        Weight body = new BodyWeight();
        body.measure();
        BodyWeight bw = (BodyWeight) body;
        bw.trackFitness();

        System.out.println(lw instanceof Weight);
	}
}