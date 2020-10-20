package gt.url.compis.proyectofas1;

%%

%class Lexico
%standalone
%line
%column

P= "."
incr = "++"
decr = "--"
pot = "^"
dig = "=="
neg = "!="
ig            = "="
log           = (AND|OR)
entrada       = [^\r\n]
terminacion   = \r|\n|\r\n
contenido     = ( [^*] | \*+ [^/*] )*
comentario1   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
comentario2   = "//" {entrada}* {terminacion}?
comentario3   = "/**" {contenido} "*"+ "/"
Ides = ([a-zA-z]+)([0-9]+)?
FesR = "real cadenaAreal"
FesI = "entero cadenaAentero"
FesB = "boleano cadenaAboleano"
S = "real seno"
C = "real coseno"
T = "real tangente"
L = "real logaritmo"
R = "real raiz"
Fconv = ({S}|{C}|{T}|{L}|{R})
pi = "("
pd = ")"
espc = " "
c = "cadena"
r = "real"
Cas = {pi}{c}{espc}{Ides}{pd}
Car = {pi}{r}{espc}{Ides}{pd} 

NumerosINT = (-?)[0-9]+
NumerosREAL = (-?)([1-9][0-9]*{P}[0-9]+((E(-?)[1-9][0-9]*))?)
Op = {pot}|([<|>|=|%|*|/|+|-])|{incr}|{decr}|{P}|{dig}|{neg}|{ig}|{log}
MetRes = (constructor|destructor|Principal)(\(\))
preservada = "si"|"entonces"|"devolver"|"sino"|"clase"|"propiedades"|"metodos"|"publicas"|"publicos"|"privadas"|"privados"|"protegidas"|"protegidos"|"instanciar"|"entero"|"real"|"cadena"|"boleano"|"nulo"|"incluir"|"leer"|"escribir"|"desde"|"mientras"|"hacer"|"incrementar"|"decrementar"|"extiende"
FuncES = (({FesR}|{FesI}|{FesB}){Cas})|({Fconv}{Car})
Comentario = {comentario1} | {comentario2} | {comentario3}
palabra = "\""[a-zA-z]+"\""
simbolo = "\)"|"\("|"\}"|"\{"|"\]"|"\["|","|":"
finlinea = ";"


NoIdes = ([0-9]+)([a-zA-z]+)([0-9]+)?
ERROR = [$]+

%%

{Op}            { System.out.println("LEX: Encontre un operador: " + yytext()); }
{NumerosINT}    { System.out.println("LEX: Encontre un numero: " + yytext()); }
{MetRes}        { System.out.println("LEX: Encontre un metodo reservado: " + yytext()); }
{palabra}       { System.out.println("LEX: Encontre una palabra: " + yytext()); }
{preservada}    { System.out.println("LEX: Encontre una palabra reservada: " + yytext()); }
{Ides}          { System.out.println("LEX: Encontre un identificador: " + yytext()); }
{FuncES}        { System.out.println("LEX: Encontre una Fespecial: " + yytext()); }
{Comentario}    { System.out.println("LEX: Encontre un comentario: " + yytext());}
{simbolo}       { System.out.println("LEX: Encontre un simbolo: " + yytext());}
{finlinea}      { System.out.println("LEX: Encontre un simbolo de final de linea: " + yytext());}

{NoIdes}        { System.out.println("LEX-ERROR: no Ides: " + yytext()); }    
{ERROR}         { System.out.println("LEX: ERROR: " + yytext() + " L: " + yyline); }
.               {  }