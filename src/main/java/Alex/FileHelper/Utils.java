package Alex.FileHelper;

import java.io.*;

/**
 * Created by alex on 20.11.15.
 */
public class Utils <T> implements Serializable{

    public void save(String path, T object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            // try (FileOutputStream outputStream = new FileOutputStream(this.filePath.toFile())){
            oos.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public T load(String path) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (T) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }




}
