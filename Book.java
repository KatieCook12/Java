import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// Defines the 'Book' class that implements Serializable.
class Book implements Serializable {

    // Stores the book's title in a public instance variable.
    public String title;

    // Stores the book's author in a public instance variable.
    public String author;

    // Stores the book's publication year in a public instance variable.
    public int publicationYear;

    // Defines a custom deserialization private method.
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{

        // Tries...
        try {

            // Restores the object's default values using the defaultReadObject method.
            in.defaultReadObject();

            // Prints a debug message.
            System.out.println("readObject for Book");

        // Prints and handles any exceptions.
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
    }
}
