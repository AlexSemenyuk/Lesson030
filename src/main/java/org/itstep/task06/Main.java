package org.itstep.task06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO: проверяйте ваш код здесь
        int n = 10;

        XmlReader [] arr = new XmlReader[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = new XmlReader();
        }

        readXml(arr);
    }

    static void readXml(XmlReader [] arrays) throws IOException {
        for (XmlReader array: arrays){
            try {
                array.read();
            } catch (FileSystemAlreadyExistsException | FileNotFoundException ex){
                throw new FileNotFoundException();
            } catch (NullPointerException | Error e){
                e.printStackTrace();
            }
        }
    }
}
