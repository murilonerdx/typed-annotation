# typed-annotation
Como criar anotação customizada

A anotação @Target indica para qual tipo de elemento java a anotação que estamos definindo irá tratar. Ele pode ser:
TYPE: para classes, interfaces, ou enums;
FIELD: para atributos;
METHOD: para métodos;
PARAMETER: para parâmetros de métodos;
CONSTRUCTOR: em construtores;
LOCAL_VARIABLE: em variáveis locais;
ANNOTATION_TYPE: em uma outra anotação;
PACKAGE: nos pacotes java.


Já a anotação @Retention indica por quanto tempo a anotação será retida. Pode assumir os valores:
RUNTIME: as anotações são armazenadas na classe e estão disponíveis em tempo de execução;
SOURCE: as anotações são armazenadas na classe, mas NÃO estão disponíveis em tempo de execução;
CLASS: as anotações NÃO são armazenadas na classe (default).

Por último, a anotação @Inherited indica que as subclasses herdarão essa anotação.

A anotação acima servirá para mapear uma classe em uma tabela do banco de dados.
Ela será utilizada apenas em classes, ficará disponível em tempo de execução e poderá ser herdada por subclasses que a usarem.
