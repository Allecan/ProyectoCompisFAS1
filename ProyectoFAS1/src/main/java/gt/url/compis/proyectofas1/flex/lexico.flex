package gt.url.compis.proyectofas1;

%%

%class Lexico
%standalone
%line
%column

P= "."

NumerosINT = (-?)[0-9]+
NumerosREAL = (-?)([1-9][0-9]*{P}[0-9]+((E(-?)[1-9][0-9]*))?)
incr = "++"
decr = "--"
pot = "^"
dig = "=="
neg = "!="
ig = "="
log = (AND|OR)
Op = {pot}|([<|>|=|%|*|/|+|-])|{incr}|{decr}|{P}|{dig}|{neg}|{ig}|{log}
preservada = "si"|"entonces"|"devolver"|"sino"|"clase"|"propiedades"|"metodos"|"publicas"|"publicos"|"privadas"|"privados"|"protegidas"|"protegidos"|"instanciar"|"entero"|"real"|"cadena"|"boleano"|"nulo"|"incluir"|"leer"|"escribir"|"desde"|"mientras"|"hacer"|"incrementar"|"decrementar"|"extiende"
Comentario    = {comentario1} | {comentario2} | {comentario3}
entrada       = [^\r\n]
terminacion   = \r|\n|\r\n
comentario1   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
comentario2   = "//" {entrada}* {terminacion}?
comentario3   = "/**" {contenido} "*"+ "/"
contenido     = ( [^*] | \*+ [^/*] )*
palabra = "\""[a-zA-z]+"\""
simbolo = "\)"|"\("|"\}"|"\{"|"\]"|"\["|","|":"
finallinea = ";"
ERROR = [$]+

%%
{Op}            { System.out.println("LEX: Encontre un operador: " + yytext()); }
{NumerosINT}    { System.out.println("LEX: Encontre un numero: " + yytext()); }
{palabra}       { System.out.println("LEX: Encontre una palabra: " + yytext()); }
{preservada}    { System.out.println("LEX: Encontre una palabra reservada: " + yytext()); }
{Comentario}    {System.out.println("Encontre un comentario: " + yytext());}
{simbolo} {System.out.println("Encontre un simbolo: " + yytext());}
{finallinea} {System.out.println("Encontre un simbolo de final de linea: " + yytext());}
{ERROR}         { System.out.println("LEX: ERROR: " + yytext() + " L: " + yyline); }
.               {  }