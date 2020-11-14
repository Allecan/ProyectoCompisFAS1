package gt.url.compis.proyectofas1;
import static gt.url.compis.proyectofas1.Tokens.*;
%%
%class Lexico
%type Tokens
%line
%{
    public String lexeme;
%}

/*NO TOKENS*/
let            = [:jletter:]+                                                   /*Letras o palabras incluido el guion*/
letdig         = [:jletterdigit:]+                                              /*Letras con digitos */    
lqs            = .*                                                             /*Cualquier caracter excepto \n*/
com            = \"
entrada        = [^\r\n]
contenido      = ( [^*] | \*+ [^/*] )*
terminacion    = \r|\n|\r\n
ctipo1         = "/*" [^*] ~"*/" | "/*" "*"+ "/"                                /*tipo 1 de comentario*/
ctipo2         = "//" {entrada}* {terminacion}?                                 /*tipo 2 de comentario*/
ctipo3         = "/**" {contenido} "*"+ "/"                                     /*tipo 3 de comentario*/    

COMENTARIO     = {ctipo1} | {ctipo2} | {ctipo3}


/*TOKENS*/
SPC             = [ \t\f]                                                       /*Identacion o espacio blanco*/
P               = "."
INCR            = "++"
DECR            = "--"
POT             = "^"
EQ              = "="
EQEQ            = "=="
NEQ             = "!="
MYQ             = ">"
MNQ             = "<"
PIZ             = "("
PDR             = ")"
FLC             = ";"                                                           /*Final de linea con ;*/
F               = \n                                                            /*Fin de linea*/
OLOG            = (AND|OR|NOT)
MetRes          = (constructor|destructor|Principal)                            /*metodos reservados*/
INT             = "entero"
STRING          = "cadena"
BOOL            = "boleano"
FLOAT           = "real"
NBOOL           = 1|0
NUM             = 0|(-?)[1-9][0-9]* 


NUMR            = (-?)[0-9]+{P}[0-9]+                                           /*Numeros reales*/
IDEN            = {let}({NUM}?{let}?)*                              
CADTXT          = {com}({let}|{SPC}|{letdig}|{lqs})*{com}                       /*Cadenas de texto*/
FcF             = {FLOAT}{SPC}"cadenaAreal"                                     /*Funciones especiales*/
FcI             = {INT}{SPC}"cadenaAentero"
FcB             = {BOOL}{SPC}"cadenaAboleano"
SEN             = {FLOAT}{SPC}"seno"
COS             = {FLOAT}{SPC}"coseno"
TAN             = {FLOAT}{SPC}"tangente"
LOG             = {FLOAT}{SPC}"logaritmo"
SQRT            = {FLOAT}{SPC}"raiz"                                            /*Funciones especiales*/

/*ERRORES TOKENS*/
NoIdes = ([0-9]+)([a-zA-z]+)([0-9]+)?

%%

si |
entonces |
devolver |
sino |
clase |
propiedades |
metodos |
publicas |
publicos |
privadas |
privados |
protegidas |
protegidos |
instanciar |
incluir |
leer |
escribir |
desde |
mientras |
hacer |
incrementar |
decrementar |
extiende |

while               {lexeme=yytext(); return Reservadas;}
{IDEN}              {lexeme=yytext(); return Identificador;}
{NUM}               {lexeme=yytext(); return Numero;}
{finallinea}        {lexeme=yytext(); return Final_Linea;}

{CADTXT}           {lexeme=yytext(); return Palabra;}                           /*CAMBIAR en tokens y main*/

{MetRes}            {lexeme=yytext(); return Metodo_Reservado;}

{NoIdes}            {lexeme=yytext() + " Linea: " + yyline; return No_Ides;}   

{COMENTARIO}        {/*Ignore*/}                                                /*QUITARLO DE TOKENS y MAIN*/
{SPC}               {/*Ignore*/}
"//".*              {/*Ignore*/}
 .                  {return ERROR;}

/*QUITAR simbolos, operadores, FuncEs y palabras reservadas de TOKENS y MAIN*/