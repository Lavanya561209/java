class Gallery {
    public Gallery() {
        this(25.5f);
        System.out.println("Welcome to the art gallery exhibition");
    }

    public Gallery(float entryFee) {
        this("ModernArt", 'A');
        System.out.println("The entry fee for the gallery is: " + entryFee);
    }

    public Gallery(String artType, char section) {
        System.out.println("Gallery section: " + section + " Art  different type displayed: " + artType);
    }
}
