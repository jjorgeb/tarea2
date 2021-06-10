Para poder probar las funcionalidades del programa hay que ejecutar las clases xTest.java, las cuales existen para cada una de las clases principales.
Para poder probar las funcionalidades del programa hay que ejecutar las clases xTest.java, las cuales existen para cada una de las clases principales.
La idea del programa es encapsular los tipos primitivos de java en clases que permitan abstraer el funcionamiento de estos tipos. Para eso cada clase se puede transformar
en algunas de las otras dependiendo de cuál sea mediante un método.
Para la realización de las operaciones entre clases se utiliza el patrón de diseño Double Dispatch, y dado que no existía simetría entre las operaciones de todas
las clases se tuvo que crear varias interfaces para poder simplificar las operaciones entre clases.
Las funciones que cumplen lo pedido son x.suma(y), x.resta(y), x.multiplicación(y), x.division(y), x.Or(y), x.And(y) y x.negacion().
