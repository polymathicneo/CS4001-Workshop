import java.util.ArrayList;

public class LibrarySystem
{
    public static void main(String[] args)
    {
        ArrayList<Book> library = new ArrayList<Book>();

        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925, "Classic", false);
        Book b2 = new Book("Harry Potter", "J.K. Rowling", "9780590353427", 1997, "Fantasy", true);
        Book b3 = new Book("Atomic Habits", "James Clear", "9780735211292", 2018, "Self-Help", true);
        Book b4 = new Book("The Hunger Games", "Suzanne Collins", "9780439023481", 2008, "Dystopian", true);

        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);

        System.out.println("--- All Books ---");
        for(Book b : library) {
            System.out.println(b.toString());
        }

        System.out.println("\n--- Available Books ---");
        for(Book b : library) {
            if(b.isAvailable() == true) {
                System.out.println(b.getTitle());
            }
        }

        System.out.println("\n--- Unavailable Books ---");
        for(Book b : library) {
            if(b.isAvailable() == false) {
                System.out.println(b.getTitle());
            }
        }

        System.out.println("\n--- Available & New (Post-2000) ---");
        for(Book b : library) {
            if(b.isAvailable() == true && b.getPublicationYear() > 2000) {
                System.out.println(b.getTitle() + " (" + b.getPublicationYear() + ")");
            }
        }
    }
}