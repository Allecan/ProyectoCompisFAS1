package gt.url.compis.proyectofas1;

%%

%class Lexico
%standalone
%line
%column

Numeros = [0-9]+

%%

{Numeros}        { System.out.println("LEX: Encontre un numero: " + yytext()); }
.                {  }