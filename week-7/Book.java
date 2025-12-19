class Book{
    String title;
    String author;
    String isbn;
    int publicationyear;
    String genre;
    boolean availability;
    
    Book(String title,String author,String isbn,int publicationyear,String genre,boolean availability){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationyear = publicationyear;
        this.genre = genre;
        this.availability = availability;
        
    }
    public void main (String []args){
        Book obj = new Book("No one hurt me","David Goggins","192-6555-990",2018,"self help",true);
        Book obj1 = new Book("muna madan","Laxmi Prasad Devkota","192-6555-991",2018,"Fiction",false);
        Book obj2 = new Book("Berserk","kentaro miuera","192-6556-992",2010,"Fiction",true);
        
        System.out.println(obj.title +" " + obj.author +" " + obj.isbn +" " + obj.publicationyear +" " + obj.genre +" " + obj.availability +" ");
        System.out.println(obj1.title +" " + obj1.author +" " + obj1.isbn +" " + obj1.publicationyear +" " + obj1.genre +" " + obj1.availability +" ");
        System.out.println(obj2.title +" " + obj2.author +" " + obj2.isbn +" " + obj2.publicationyear +" " + obj2.genre +" " + obj2.availability +" ");

        

        
        

        
    }
    
}