grammar LFA_Questao3;

goal                :  statement EOF;

Identificador          :   [a-zA-Z_][0-9a-zA-Z_]*;

type                :    'int'
                    |    'int' '[' ']'
                    |    'boolean'
                    |    Identificador;

statement           :    '{' statement* '}'
                    |    'if' '(' expression ')' statement   'else'? statement?
                    |    'while' '(' expression ')' statement
                    |    'for' '(' type + Identificador '=' expression ';' expression ';' expression + Operador_atribuicao')' statement
                    |    'System.out.println' '(' expression ')' ';'
                    |    Identificador '=' expression';'
                    |    Identificador '[' expression ']' '=' expression ';';


expression          :    expression '.length'
                    |    expression '[' expression ']'
                    |    expression '.' Identificador '(' ( expression ( ',' expression )* )? ')'
                    |    expression Operador_relacional expression
                    |    expression Operador_matematico expression
                    |    'this'
                    |    'new' 'int' '[' expression ']'
                    |    'new' Identificador '(' ')'
                    |    '!' expression
                    |    '(' expression ')'
                    |    Inteiro_literal
                    |    Numero_decimal
                    |    Operador_Booleano
                    |    Operador_atribuicao
                    |    Operador_matematico
                    |    Identificador;



Operador_Booleano   :   'true' | 'false';
Operador_relacional :   '>' | '<' | '&&' |'||'| '>=' |'<='|'==';
Operador_atribuicao :    '++' |'--';
Operador_matematico :   '^' | '*' | '/' | '+' | '-'| '='  ;


Inteiro_literal      :   '0' | [1-9][0-9]*;
Numero_decimal             :   Inteiro_literal? '.' [0-9]*;
Espaco_branco          :   [ \r\t\n]+ -> skip;
Comentar_variaslinhas   :   '/*' .*? '*/' -> skip;
Comentarumalinha        :   '//' .*? '\n' -> skip;
