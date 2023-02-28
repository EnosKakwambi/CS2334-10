
public class Book
{
	private static int count = 0;    
    private String title;
    public String author;
    private String iSBN;
    
    // Constructor
    public Book(String title, String author, String iSBN) {
        this.title = title;
        this.author = author;
        this.iSBN = iSBN;
        count++;
        
    }
    
    // Getters
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getISBN() {
        return iSBN;
    }
    
    public static int getCount() {
        return count;
    }
    
    public String toString() {
        return title;
    }
}
