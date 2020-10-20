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

ERROR = [$]+

%%
{Op}            { System.out.println("LEX: Encontre un operador: " + yytext()); }
{NumerosINT}    { System.out.println("LEX: Encontre un numero: " + yytext()); }
{ERROR}         { System.out.println("LEX: ERROR: " + yytext() + " L: " + yyline); }
.               {  }