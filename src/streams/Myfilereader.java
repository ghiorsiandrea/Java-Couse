package streams;

import java.io.FileReader;
import java.io.IOException;

/**
 * This class was created attending the course of Streams - Java - of "Pildoras Informaticas"
 */

public class Myfilereader {

    public void readd() {
        try {
            FileReader entrada = new FileReader("/home/dalga/andrea/proyectos/Cliente-Servidor/streams/readme.txt");
            int c = entrada.read();
            while (c != -1) {
                char letra =(char) c;
                System.out.print(letra);
                c = entrada.read();

            }
            entrada.close();
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
