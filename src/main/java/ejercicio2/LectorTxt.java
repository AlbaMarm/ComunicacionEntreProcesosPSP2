package ejercicio2;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.io.*;

public class LectorTxt {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", System.getProperty("java.class.path"), "ejercicio2.TransformadorTxt");

        try {
            Process p = pb.start();

            BufferedWriter toSon = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            BufferedReader fromSon = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = Entrada.cadena();
            while (line != null && !line.equalsIgnoreCase("fin")) {
                toSon.write(line);
                toSon.newLine();
                toSon.flush();
                System.out.println(fromSon.readLine());
                line = Entrada.cadena();
            }

            // cerramos la entrada del hijo: recibe fin de datos y termina
            toSon.close();
            p.waitFor();
        } catch (IOException e) {
            System.out.println("ERROR: Error de I/O");
        } catch (InterruptedException e) {
            System.out.println("Proceso interrumpido");
        }
    }
}