package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class TransformadorTxt {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line;
            while ((line = br.readLine()) != null) {
                // entrada a mayúsculas
                System.out.println(line.toUpperCase());
            }
        }catch (IOException e){
            System.out.println("Error de lectura " + e.getMessage());
        }
    }
}
