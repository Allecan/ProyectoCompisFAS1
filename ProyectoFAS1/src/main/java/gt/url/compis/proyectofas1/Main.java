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
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void Escribir(String texto) throws IOException {

        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("tokens.txt");
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

    public static String convertStringArrayToString(String[] strArr, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str).append(delimiter);
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        String codarch = convertStringArrayToString(args, ",");
        try {
            Lexico lexer = new Lexico(new InputStreamReader(new FileInputStream(codarch)));
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
                    case Identificador:
                    case Numero:
                    case Reservadas:
                    case Simbolo:
                    case Final_Linea:
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    default:
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
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
