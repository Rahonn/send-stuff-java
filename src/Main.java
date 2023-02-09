import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

    public static byte[] convertFileToByteArray(String filePath) throws IOException {
        File file = new File(filePath);
        byte[] bFile = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(bFile);
        fileInputStream.close();
        return bFile;
    }

    public static void convertByteArrayToFile(byte[] byteArray, String filePath) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        fileOutputStream.write(byteArray);
        fileOutputStream.close();
    }

    public static byte[] convertObjectToByteArray(Serializable object) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static Object convertByteArrayToObject(byte[] byteArray) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        return object;
    }

    public static byte[] convertStringToByteArray(String str) {
        return str.getBytes();
    }

    public static void main(String[] args) {

        System.out.println("Hello World!");

    }

}
