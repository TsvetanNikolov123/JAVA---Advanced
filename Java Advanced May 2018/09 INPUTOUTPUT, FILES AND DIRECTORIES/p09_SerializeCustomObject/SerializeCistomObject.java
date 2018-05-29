package p09_SerializeCustomObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCistomObject {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.color = "green";
        cube.width = 14.3d;
        cube.height = 12.4d;
        cube.depth = 3d;

        String path = "/home/tsvetan/Save.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(cube);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

