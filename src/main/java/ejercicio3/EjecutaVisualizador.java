package ejercicio3;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.io.IOException;

public class EjecutaVisualizador {
    public static void main(String[] args) {
        System.out.print("Introduce una cadena: ");
        String line = Entrada.cadena();

        // definir cuantas veces debe salir la cadena
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", System.getProperty("java.class.path"), "ejercicio3.Visualizador", line, "5");

        // respuesta por el hijo con herencia
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);

        try {
            Process p = pb.start();
            int numSal = p.waitFor();

            System.out.println("Valor de salida: " + numSal);

            if (numSal == 0){
                System.out.println("Final correcto");
            } else {
                System.out.println("Final incorrecto");
            }


        } catch (IOException e) {
            System.out.println("ERROR: Error de I/O");
        } catch (InterruptedException e) {
            System.out.println("Proceso hijo interrumpido");
        }

    }
}
