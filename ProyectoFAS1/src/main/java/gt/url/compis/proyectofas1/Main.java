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

    public static void Escribir2(String texto) throws IOException {
        try {            
            File archivo = new File("tabla.txt");
            PrintWriter writer;
            writer = new PrintWriter(archivo);
            writer.print(texto);
            writer.close();
        } catch (Exception e) {
        }

    }

    public static String analisis(String archivo) {
        String tab = "";
        String ide = "";    //identificador
        String n = "";      //numero
        String ps = "";     //palabra reservada
        String simb = "";   //simbolo
        String fdl = "";    //eof
        String cm = "";     //comentario
        String pl = "";     //palabra
        String fe = "";     //funcion especial
        String op = "";     //operador
        String mr = "";     //metodo reservado

        try {
            Lexico lexer = new Lexico(new InputStreamReader(new FileInputStream(archivo)));
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    tab += "\t->NUMEROS<-\n" + n + "\n"
                            + "\t->PALABRA<-\n" + pl + "\n"
                            + "\t->OPERADOR<-\n" + op + "\n"
                            + "\t->SIMBOLO<-\n" + simb + "\n"
                            + "\t->IDENTIFICADOR<-\n" + ide + "\n"
                            + "\t->PALABRA RESERVADA<-\n" + ps + "\n"
                            + "\t->FUNCION ESPECIAL<-\n" + fe + "\n"
                            + "\t->METODO RESERVADO<-\n" + mr + "\n"
                            + "\t->COMENTARIOS<-\n\n" + cm + "\n"
                            + "\t->EOF<-\n" + fdl + "\nFIN de: "+archivo+"\n\n";                    
                    return tab;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Simbolo no definido\n";
                        break;
                    case Identificador:
                        ide += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case Numero:
                        n += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case Reservadas:
                        ps += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case Simbolo:
                        simb += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case Final_Linea:
                        fdl += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case Comentario:
                        cm += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case Palabra:
                        pl += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case Operador:
                        op += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case Metodo_Reservado:
                        mr += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case Funcion_Especial:
                        fe += tokens + ":$ " + lexer.lexeme + "\n";
                        resultado += "LEX Encontre:   " + tokens + "  " + lexer.lexeme + "\n";
                        break;
                    case No_Ides:
                        String err = "LEXERROR:   " + tokens + "  " + lexer.lexeme + "\n";
                        System.out.println(err);
                        System.exit(0);
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
        return "";
    }

    public static void main(String[] args) throws IOException {
        String codarch = "";

        String finalt = "\t\t\t\t----<<<Inicia Tabla>>>----\n";
        for (int i = 0; i < args.length; i++) {
            codarch = args[i];
            finalt += analisis(codarch);
           
        }
        System.out.println("Analisis completado");
        System.out.println("ARCHIVO GUARDADO EN: tabla.txt");
        Escribir2(finalt);
    }
}
