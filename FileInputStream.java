import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeProduct {

    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("product.ser"))) {
            Product product = (Product) in.readObject();
            System.out.println("Deserialized Product:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}