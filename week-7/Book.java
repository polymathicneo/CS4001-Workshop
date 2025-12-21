public class Book
{
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;
    private String genre;
    private boolean availabilityStatus;

    public Book(String title, String author, String isbn, int publicationYear, String genre, boolean availabilityStatus)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString()
    {
        String statusString = availabilityStatus ? "Available" : "Checked Out";
        return "Title: " + title + " | Author: " + author + " | Year: " + publicationYear + 
               " | Genre: " + genre + " | Status: " + statusString;
    }
}