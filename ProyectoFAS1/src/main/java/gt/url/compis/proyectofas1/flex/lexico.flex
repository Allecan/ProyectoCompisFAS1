package gt.url.compis.proyectofas1;
import static gt.url.compis.proyectofas1.Tokens.*;
%%
%class Lexico
%type Tokens

P= "."
incr = "++"
decr = "--"
pot = "^"
dig = "=="
neg = "!="
ig            = "="
log           = (AND|OR)
Ides = ([a-zA-z]+)([0-9]+)?
FesR = "real cadenaAreal"
FesI = "entero cadenaAentero"
FesB = "boleano cadenaAboleano"
S = "real seno"
C = "real coseno"
T = "real tangente"
Log = "real logaritmo"
R = "real raiz"
Fconv = ({S}|{C}|{T}|{Log}|{R})
pi = "("
pd = ")"
espc = " "
c = "cadena"
r = "real"
Cas = {pi}{c}{espc}{Ides}{pd}
Car = {pi}{r}{espc}{Ides}{pd} 
NumerosREAL = (-?)([1-9][0-9]*{P}[0-9]+((E(-?)[1-9][0-9]*))?)
Op = {pot}|([<|>|=|%|*|/|+|-])|{incr}|{decr}|{P}|{dig}|{neg}|{ig}|{log}
MetRes = (constructor|destructor|Principal)(\(\))
FuncES = (({FesR}|{FesI}|{FesB}){Cas})|({Fconv}{Car})
finallinea = ";"
simbolo = "\)"|"\("|"\}"|"\{"|"\]"|"\["|","|":"
 Comentario    = {comentario1} | {comentario2} | {comentario3}
 entrada       = [^\r\n]
 terminacion   = \r|\n|\r\n
 comentario1   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
 comentario2   = "//" {entrada}* {terminacion}?
 comentario3   = "/**" {contenido} "*"+ "/"
 contenido     = ( [^*] | \*+ [^/*] )*
NoIdes = ([0-9]+)([a-zA-z]+)([0-9]+)?
palabra = "\""[a-zA-z]+"\""
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}

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
entero |
real |
cadena |
boleano |
nulo |
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
{L}({L}|{D})*       {lexeme=yytext(); return Identificador;}
[0-9]+("."[0-9]+)?  {lexeme=yytext(); return Numero;}
{finallinea}        {lexeme=yytext(); return Final_Linea;}
{simbolo}           {lexeme=yytext(); return Simbolo;}
{Comentario}        {lexeme=yytext(); return Comentario;}
{palabra}           {lexeme=yytext(); return Palabra;}
{Op}                {lexeme=yytext(); return Operador;}
{MetRes}            {lexeme=yytext(); return Metodo_Reservado;}
{FuncES}            {lexeme=yytext(); return Funcion_Especial;}
{NoIdes}            {lexeme=yytext(); return No_Ides;}   
{espacio}           {/*Ignore*/}
"//".*              {/*Ignore*/}
 .                  {return ERROR;}





