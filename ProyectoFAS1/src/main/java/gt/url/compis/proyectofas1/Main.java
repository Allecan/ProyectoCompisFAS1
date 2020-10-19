/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.url.compis.proyectofas1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allec
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        String texto = "";
        String fin = "end";
        System.out.println("Escriba: ");

        System.out.println(input);
        while (input != "end") {

            if (input.equals("end")) {
                break;
            } else {
                input = in.nextLine();
                texto = texto + "\n" + input;

            }
        }

        try {
            File archivo = new File("prueba2a.txt");
            PrintWriter writer;
            writer = new PrintWriter(archivo);
            writer.print(texto);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

//        try {
//            Lexico lex = new Lexico(new InputStreamReader(new FileInputStream("codigo.txt")));
//            lex.yylex();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
