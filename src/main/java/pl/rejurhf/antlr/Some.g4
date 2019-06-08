grammar Some;

classDeclaration : CLASS className IS (declaration)*(method)* BEGIN (main)? END;
className : NAME;

// Declaration
declaration: TYPE NAME SEMI;


// Method ---------------------------------------------------------------------------------
method: FUNCTION methodName LEFT_PAREN arguments? RIGHT_PAREN (RETURN TYPE)? IS
    BEGIN line* (RETURN value SEMI)? END;
methodName: NAME;

arguments: (TYPE COLON NAME COMMA)* TYPE COLON NAME;

methodCall: NAME LEFT_PAREN (callArguments)? RIGHT_PAREN;

callArguments: (value COMMA)* value;


// Main -----------------------------------------------------------------------------------
main: line*;


// Line -----------------------------------------------------------------------------------
line: (ifDefinition | subLine);

subLine: (printf | assigment | methodCall) SEMI;

printf: PRINTF LEFT_PAREN value RIGHT_PAREN;

assigment: NAME ASSIGN value;


// if --------------------------------------------------------------------------------------
ifDefinition: IF LEFT_PAREN conditions RIGHT_PAREN BEGIN ifBody
    (ELSIF LEFT_PAREN conditions RIGHT_PAREN BEGIN ifBody)*
    (ELSE ifBody)? END;

ifBody: line*;

conditions: (condition logicOperator)* condition;

condition: subMathValue relationOperator subMathValue;

logicOperator: (AND | OR);

relationOperator: ( EQUAL | GREATER_EQUAL | GREATER | LESSER | LESSER_EQUAL);


// Others -----------------------------------------------------------------------------------
value: (subValue | mathOperation | methodCall);

subValue: (STRING_VALUE | subMathValue);

mathOperation: mathOperation operator mathOperation
    | LEFT_PAREN mathOperation RIGHT_PAREN
    | (MINUS)? subMathValue;

operator: (PLUS | MINUS | MUL | DIV);

subMathValue: (NAME | INTEGER_VALUE);


// tokens ---------------------------------------------------------------------------------

CLASS : 'class' ;
IS : 'is' ;
BEGIN : 'begin' ;
END : 'end' ;
RETURN : 'return' ;
FUNCTION : 'function' ;
IF : 'if' ;
ELSE : 'else' ;
ELSIF : 'elsif' ;
PRINTF : 'printf' ;
TYPE : 'Integer' | 'String' ;

MUL : '*' ;
DIV : '/';
PLUS : '+' ;
MINUS : '-' ;
ASSIGN : ':=' ;

COLON : ':';
SEMI : ';' ;
COMMA : ',' ;

LEFT_PAREN : '(' ;
RIGHT_PAREN : ')' ;

EQUAL : '==' ;
GREATER : '>' ;
LESSER : '<' ;
GREATER_EQUAL : '>=';
LESSER_EQUAL : '<=';

AND : '&&' ;
OR : '||' ;

INTEGER_VALUE : '0' | [1-9][0-9]* ;
STRING_VALUE : '"' ~["]* '"';
NAME : [a-zA-Z0-9]+ ;
NAMEU : [A-Za-z]+[a-zA-Z0-9]* ;
WS: [ \t\n\r]+ -> skip ;