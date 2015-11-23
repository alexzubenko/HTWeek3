package Natalie;

import java.io.*;

/**
 * Created by Family on 11/16/2015.
 */
public class Utils <V> implements Serializable{

    public void save(String path, V object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fileReader (String path){
        String fileContent ="";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
             fileContent = sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
             br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileContent ;
    }


    public void fileWriter(File file, String content){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.println(content);
        writer.close();
    }

    public V load(String path) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (V) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}
