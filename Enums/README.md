
# enums o enumerable java

Los enums o enumerables en java son un tipo de "Clase" en el cual Permite representar conjuntos de constantes

Estas enumeraciones se utilizan cuando se tiene conocimiento completo con respecto de los valores posibles en tipo de compilación, como pueden ser las opciones en un menú y demás. Esto quiere decir que el uso de los enums se recomienda cuando se tengan valores que se sabe que no van a ser modificados, como pueden ser colores, meses o días específicos, entre otros.


Aunque los enums y las clases en Java comparten algunas similitudes, como la capacidad de tener campos, métodos y constructores, hay diferencias clave entre ellos. Aquí hay algunas de las diferencias más destacadas:

Instancias Limitadas:

En un enum, las instancias están predefinidas y son finitas. Los enums son utilizados para representar conjuntos fijos y conocidos de constantes.
En una clase, puedes crear instancias de la misma dinámicamente en cualquier momento, y el número de instancias no está predefinido.
Constantes con Nombre:

Las instancias de un enum son constantes con nombre. Cada valor en un enum tiene un nombre asociado, y esos nombres se utilizan para referirse a las instancias del enum.
En una clase, las instancias no tienen nombres predefinidos.
Uso de enum Keyword:

Para definir un enum en Java, utilizas la palabra clave enum. Por ejemplo: enum DiaDeLaSemana { LUNES, MARTES, MIÉRCOLES }.
Para definir una clase, utilizas la palabra clave class.
Comparaciones más Seguras:

Debido a que las instancias de un enum son constantes predefinidas, las comparaciones de igualdad (==) son más seguras. Por ejemplo, if (dia == DiaDeLaSemana.MARTES) { ... }.
En las clases, las comparaciones de igualdad pueden depender de la implementación de los métodos equals() y hashCode().
Enumeraciones Ordinales:

Los enums tienen un orden ordinal predeterminado basado en el orden en que se declaran las constantes en la enumeración.
Las clases no tienen un orden ordinal predefinido.
Uso en Switch:

Los enums son a menudo utilizados con declaraciones switch de una manera más legible. Cada constante enum se puede manejar de manera individual en una cláusula case.
Las clases generalmente no se utilizan de la misma manera en declaraciones switch.



## Authors

- [@mmg114](https://www.github.com/octokatherine)
