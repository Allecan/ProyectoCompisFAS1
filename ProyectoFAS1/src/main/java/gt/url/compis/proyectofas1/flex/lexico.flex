package gt.url.compis.proyectofas1;

%%

%class Lexico
%standalone
%line
%column

Numeros = [0-9]+
ERROR = [ak]+
%%

{Numeros}        { System.out.println("LEX: Encontre un numero: " + yytext()); }
{ERROR}          { System.out.println("LEX: ERROR: " + yytext() + " L: " + yyline); }
.                {  }