/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.url.compis.proyectofas1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



  

public class Main {
    
    public static void Escribir(String texto) throws IOException {

        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("codigo.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println(texto);
                linea.close();
                escribir.close();
            } catch (Exception e) {
            }

        } else {
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println(texto);
                linea.close();
                escribir.close();
            } catch (Exception e) {
            }

        }
    }

  
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        String input = "";
        String texto = "";
        String fin = "end";
        System.out.println("Escriba su codigo: ");

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
            File archivo = new File("codigo.loop");
            PrintWriter writer;
            writer = new PrintWriter(archivo);
            writer.print(texto);
            writer.close();
            Lexico lexer = new Lexico(new InputStreamReader(new FileInputStream("codigo.loop")));
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    Escribir(resultado);
                    System.out.println(resultado);
                    return;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Simbolo no definido\n";
                        break;
                    case Identificador: case Numero: case Reservadas: case Simbolo: case Final_Linea:
                        resultado += "Encontre un/a:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    default:
                        resultado += "Encontre un/a:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
