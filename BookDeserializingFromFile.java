import java.io.FileInputStream;
import java.io.ObjectInputStream;

// Defines a class called 'BookDeserializingFromFile'.
public class BookDeserializingFromFile {

    // Defines a method for deserializing an object from a file.
    public static Object deserializeFromFile(String filename){

        // Returns an empty Object reference.
        Object obj = new Object();

        // Tries...
        try {

            // Constructs a 'FileInputStream' to read from the given filename.
            FileInputStream file = new FileInputStream(filename);

            // Constructs an ObjectInputStream in order to deserialize the object.
            ObjectInputStream in = new ObjectInputStream(file);

            // Prints a message indicating that the deserialization process has begun.
            System.out.println("Deserialization from " + filename);

            // Object is read from the ObjectInputStream and stored in 'obj'.
            obj = in.readObject();

            // The ObjectInputStream and FileInputStream are closed.
            in.close();
            file.close();

            // Prints a message of a successful confirmation of deserialization.
            System.out.println("Book object deserialized from LibraryBooks.ser");
        }
        catch (Exception e) {

            // If a problem occurs during deserialization, this method prints an exception message.
            System.out.println("Exception: " + e.toString());
        }

        // Returns the deserialized object.
        return obj;
    }

}
