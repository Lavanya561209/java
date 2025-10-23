class MintGum extends Gum {
    public void freshBreath() {
        System.out.println("Refreshing breath with cool mint flavor!");
    }

    public static void main(String[] args) {
        Gum g = new MintGum();
        g.chew();
        MintGum mg = (MintGum) g;
        mg.freshBreath();

       
        Gum gumBubble = new BubbleGum();
        gumBubble.chew();
        BubbleGum bg = (BubbleGum) gumBubble;
        bg.blowBubble();

        System.out.println(mg instanceof Gum);
    }
}
