package ua.lviv.lga.lesson19.task;

import java.io.*;

public class Methods {
    public static void serialize(File file, Serializable object) throws Exception {

        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(object);
        if (os != null) os.close();
        if (oos != null) oos.close();

    }

    public static Serializable deserialize(File file) throws Exception {

        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable obj = (Serializable) ois.readObject();
        if (ois != null) ois.close();
        if (is != null) is.close();

        return obj;
    }
}
