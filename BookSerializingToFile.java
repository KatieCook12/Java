import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// Defines a class called 'BookSerializingToFile'.
public class BookSerializingToFile {

    // Writes a serialized object to a file.
    public static void serializeToFile(Object obj, String filename) {

        // Tries...
        try{

            // Creates a new FileOutputStream writing to a file the serialized object.
            FileOutputStream file = new FileOutputStream(filename);

            // Creates an ObjectOutputStream in order to serialise the object.
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Prints a message indicating that serialisation is in progress.
            System.out.println("Serializing " + obj.toString() + " to " + filename);

            // The specified object is serialised and written to the ObjectOutputStream.
            out.writeObject(obj);

            //  Terminates serialisation by closing the ObjectOutputStream.
            out.close();

            // Closes the FileOutputStream.
            file.close();

            // Prints a message of a successful confirmation of serialization.
            System.out.println("Book object serialized and saved to LibraryBooks.ser");

        } catch (Exception e) {

            // Handles exceptions that may arise during the serialisation process.
            System.out.println("Exception: " + e.toString());
        }
    }
}
