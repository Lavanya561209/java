class StoryBook {
String storyBookTitle;
int numberOfPages;
boolean isAvailable;
float rating = 3.7f;        
byte shelfNumber = 15;         
public StoryBook() {
System.out.println("StoryBook created");
}
public StoryBook(String storyBookTitle) {
System.out.println("Story Book Title: " + storyBookTitle);
}
public StoryBook(int numberOfPages, boolean isAvailable) {
System.out.println("The total number of pages in book are : " + numberOfPages + "Is the book Available: " + isAvailable);
}
public static void main(String[] args) {
StoryBook bl = new StoryBook();
StoryBook bl1 = new StoryBook("Alice in Wonderland");
StoryBook bl2 = new StoryBook(400, true);
System.out.println("Rating: " + bl2.rating);
System.out.println("Book Rack is : " + bl2.shelfNumber);
    }
}