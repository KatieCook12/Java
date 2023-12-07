public class Main {

    // Program's main method.
    public static void main(String args[]) {

        // Creates a new book object.
        Book book = new Book();

        // Sets the 'Book' object's name and address fields.
        book.author = "Lewis Carrol";
        book.title = "Alice's Adventures in Wonderland";
        book.publicationYear = 1865;

        // Specifies the filename for the serialised item.
        String file = "LibraryBooks.ser";

        // Serialises and writes the 'Book' object to the specified file using the 'serializeToFile' method.
        BookSerializingToFile.serializeToFile(book, file);

        // Object was deserialized from the file and cast to a Book object.
        Book book2 = (Book)BookDeserializingFromFile.deserializeFromFile(file);

        // Prints out the book's deserialized author, title and publication year.
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Publication year: " + book2.publicationYear);
    }

}
