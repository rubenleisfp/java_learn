# Learning Java

## Objetivo

Proporcionar una guía a los alumnos sobre qué contenido ver sobre Java y qué ejercicios pueden realizar para practicar su uso. Se proporciona una base teórica que tiene su correspondencia con actividades de refuerzo, de tal manera que el alumno deberá primero informarse sobre la teoría para luego aplicarla realizando los ejercicios correspondientes.

---

## Teoría

### Videotutoriales de Programación

- [Curso Gratis Java Para Principiantes](https://www.youtube.com/watch?v=qxXcI56NfnE&ab_channel=TodoCode)
- [JAVA Desde Cero: Primeros Pasos en una Hora](https://www.udemy.com/course/algoritmos-desde-cero/)

### 0 - Aprende algoritmos y diagramas de flujo

- [Algoritmo y diagrama de flujo](https://www.youtube.com/watch?v=SZTXmCbfjP0&ab_channel=CompilaTec)
- [Diagramas de flujo](https://www.youtube.com/watch?v=1frV9cIgAow&list=PL46-B5QR6sHm_qTw3tet7XHynE8bEucoa&index=8&ab_channel=EstudiaConMarisol)

### Algoritmos

- [Curso de Algoritmos desde Cero](https://www.udemy.com/course/algoritmos-desde-cero/)
- [Libro de Algoritmos](https://editorial.uaa.mx/docs/algoritmos.pdf)
- [Video sobre Algoritmos](https://www.youtube.com/watch?v=SZTXmCbfjP0&ab_channel=CompilaTec)

### Diagramas de Flujo

- [Receta de Cocina](https://www.diagramadeflujo.net/receta-de-cocina/)
- [Control de Flujo](http://lsi.vc.ehu.es/asignaturas/Inf_Bas/2005-06/comun/04%20Control%20flujo.pdf)
- [Bucles](http://lsi.vc.ehu.es/asignaturas/Inf_Bas/2005-06/comun/05%20Bucles.pdf)
- [Diagramas de Flujo - Área Tecnología](https://www.areatecnologia.com/diagramas-de-flujo.htm#google_vignette)


### 1 - Entorno: IntelliJ, Debug, Librerías y Maven

- [Instalar JDK](https://www3.ntu.edu.sg/home/ehchua/programming/howto/jdk_howto.html)
- [Guía de IntelliJ](https://www.jetbrains.com/help/idea/sdk.html#access-external-documentation)
- **Atajos en IntelliJ:**
  - Ir a clase: `Ctrl + N`
  - Ir a fichero: `Ctrl + Mayús + N`
  - Formatear código: `Ctrl + Alt + L`
  - Organizar imports: `Ctrl + Alt + O`

#### Debug:

- **DEPURACIÓN (DEBUG) en JAVA con INTELLIJ IDEA - Tutorial Completo Fácil**  
  [Debugging Your First Java Application](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html#analyzing-state)

#### Jar/Librería:

- **LIBRERÍAS (bibliotecas) vs FRAMEWORKS ¿Cuáles son sus DIFERENCIAS? 🖥️ | DESARROLLO WEB 🌎**  
  - Exportar: [Compiling Applications](https://www.jetbrains.com/help/idea/compiling-applications.html#package_into_jar)  
  - Importar: [Working with Module Dependencies](https://www.jetbrains.com/help/idea/working-with-module-dependencies.html)

![Intellij import jar](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/intellij_import_jar.PNG)

- **Librerías top de Java:**  
  [20 Essential Java Libraries and APIs](https://medium.com/javarevisited/20-essential-java-libraries-and-apis-every-programmer-should-learn-5ccd41812fc7)

#### Maven:

- **¿Qué es MAVEN? ¿Cómo usar MAVEN? MAVEN vs Gradle 🖥️ | DESARROLLO JAVA 🌎**  
  - [Curso de Maven - 1 Introducción](https://www.arquitecturajava.com/que-es-maven/)

### 2 - Java Básico

- [Variables, Condicionales, Bucles y Arrays](https://www.w3schools.com/java/default.asp)

### 3 - Clases y Objetos

- [Conceptos de Clases y Objetos](https://www.w3schools.com/java/java_classes.asp)

### 4 - Static como Atributo

- [Explicación de Static](https://refactorizando.com/directiva-static-java/)

---

## Actividades de Refuerzo

### **Grupo 1 - IntelliJ, Librerías y Maven**

#### **Actividad 101: Crear un Proyecto Java Calculadora**

1. Descarga e instala IntelliJ.
2. Crea un proyecto Java (que no sea Maven) llamado `calculadora`.
3. Dentro de él, crea un paquete `com.fp`.
4. Implementa una clase `Calculadora` con métodos `sumar`, `restar`, `multiplicar` y `dividir`.
5. Utiliza el debugger para comprobar su funcionamiento.

#### **Actividad 102: Crear y Usar un JAR**

1. Exporta el proyecto anterior como un `jar` llamado `calculadora.jar`.
2. Prueba que funciona correctamente ejecutando el siguiente comando: java -jar calculadora.jar
3. Crea un nuevo proyecto Java (no Maven) Java llamado `matemáticas`.
4. Importa el `jar` anterior y utilízalo en una clase.

#### **Actividad 103: Crea un proyecto Maven Calculadora**

1. Crea un proyecto Maven en Intellij con estos datos:
   1. Group id: `com.fp`
   2. Artifact id: `calculadoramaven`
2. Crea un paquete `com.fp`
3. Copia la clase `Calculadora` del anterior proyecto dentro de dicho paquete

![Crear proyecto Maven](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/intellij_calculadora_maven.PNG)

#### **Actividad 104: Crea un proyecto Maven Matematicas donde uses Calculadora**
1. Crea un proyecto Maven en IntellIij con estos datos:
   1. Group id:  com.fp
   2. Artifact id: matematicasmaven
2. Crea un paquete com.fp
3. Importa como dependencia el proyecto del anterior ejercicio com.fp:calculadoramaven
4. Utiliza la clase calculadora dentro de tu proyecto matemáticas


#### **Actividad 105: Crea un proyecto para los siguientes Grupos. Learn Java **
1. Crea un proyecto Maven en IntellIij con estos datos:
  1. Group id: org.learn
  2. Artifact id: learn_java
2. Será el proyecto dónde ubicamos las siguiente actividades que realicemos a lo largo de esta documento
3. Cuando tengas que crear código en las siguientes actividades, hazlo dentro de su subpaquete con el código de la actividad a la que pertenece.
4. Otra opción es clonarlo dentro de esta ubicación de Git, concretamente la rama starter: https://github.com/rubenleisfp/java_learn

![Intellij learn java](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/intellij_learn_java.PNG)


#### **Actividad 116: Crea un proyecto para las siguientes actividades. Learn Java. Hola Mundo **
1. Dentro del proyecto anterior:
  1. Group id: org.learn
  2. Artifact id: learn_java
3. Crea un paquete llamado  org.example.entorno
4. Dentro de ese paquete crea otro llamado actividad116
5. Crea una clase HolaMundo en el paquete anterior que ejecute un “Hola Mundo” en IntellIij .


#### **Actividad 116: Learn Java. Fibonacci** 
1. Vamos a evaluar tu conocimiento sobre Java. Sino eres capaz de realizar este ejercicio, no te preocupes, 
simplemente es que necesitas aprender más sobre [Java Básico](# **Grupo-2-Java-Básico**)
2. Crea el paquete:  `org.learn.entorno.actividad117`
3. Crea un programa que escriba por pantalla el valor enésimo de la secuencia de Fibonacci. El valor n se recibirá como argumento por pantalla.

[//]: # (Ejemplo)
Introduce el número de la secuencia de Fibonacci que deseas ver: 6
El número 6 de la secuencia de Fibonacci es: 8

[//]: # (Hint)
En matemática, la sucesión de Fibonacci se trata de una serie infinita de números naturales que empieza con un 0 y un 1 y continúa añadiendo números que son la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597…  
El sexto número de la serie es el 8  
Los 2 primeros números de la serie son fijos a los que podríamos llamar a y b, los siguientes serán a suma de a y b.



### **Grupo 2 - Java Básico**

#### **Actividad 201: Tipos de Datos**

1. Crea un paquete `org.learn.basico.actividad201`.
2. Escribe variables de los siguientes tipos: `char`, `String`, `int`, `double`, `BigDecimal`, `boolean`.
3. Realiza conversiones entre ellos e imprime los valores.

#### **Actividad 202: Operaciones Matemáticas**

1. Crea un paquete `org.learn.basico.actividad202`.
2. Escribe un programa que realice las operaciones básicas con dos números ingresados por el usuario.

#### **Actividad 203: Condicionales**

1. Crea un paquete `org.learn.basico.actividad203`.
2. Escribe un programa que reciba dos números e indique cuál es mayor y si cada uno es par o impar.

### **Grupo 3 - Clases y Objetos**

#### **Actividad 301: Clase Círculo**

1. Crea un paquete `org.learn.clases.actividad301`.
2. Implementa una clase `Círculo` con métodos para calcular su perímetro y área.

#### **Actividad 302: Clase Cuenta Bancaria**

1. Crea un paquete `org.learn.clases.actividad302`.
2. Implementa una clase `Cuenta` con titular y cantidad.
3. Implementa métodos para ingresar y retirar dinero.
4. Crea una clase `App` para probar su funcionamiento.

### **Grupo 4 - Static**

#### **Actividad 402: Tienda de Productos**

1. Crea un paquete `org.learn.staticproperty.actividad402`.
2. Implementa una clase `Producto` con nombre y precio.
3. Implementa una clase `Tienda` con un contador estático de ventas.
4. Implementa un método `realizarVenta(Producto p)`.
5. Prueba el sistema en una clase `Main`.

### **Grupo 5 - Colecciones**

#### **Actividad 502: CRUD de Artistas**

1. Crea un paquete `org.learn.colecciones.actividad502`.
2. Implementa un sistema CRUD para una lista de artistas.
3. Ofrece opciones para agregar, eliminar, consultar y actualizar.

### **Grupo 6 - Herencia**

#### **Actividad 602: Gestión de Empleados**

1. Crea un paquete `org.learn.herencia.actividad602`.
2. Implementa una clase base `Empleado` con nombre y salario.
3. Implementa `EmpleadoTemporal` y `EmpleadoPermanente` con diferentes cálculos de salario.
4. Prueba las clases en un `Main`.

### **Grupo 7 - Interfaces**

#### **Actividad 702: Caravana de Vehículos**

1. Crea un paquete `org.learn.interfaz.actividad702`.
2. Implementa una interfaz `Vehiculo` con métodos de velocidad.
3. Implementa clases `Turismo`, `Autobús` y `Camión`.
4. Crea una lista de vehículos y muestra sus velocidades.

### **Grupo 8 - Polimorfismo**

#### **Actividad 801: Entender el Polimorfismo**

1. Crea un paquete `org.learn.interfaz.actividad801`.
2. Implementa el ejemplo del blog [Arquitectura Java](https://www.arquitecturajava.com/java-polimorfismo-herencia-y-simplicidad/).

---

## Anexo: Más Ejercicios

- [Ejercicios de Java Básico](https://www.w3resource.com/java-exercises/basic/index.php)
- [Ejercicios de Bucles](https://manolohidalgo.com/ejercicios-bucles-en-java/)
- [Ejercicios de Arrays](https://dam.org.es/ejercicios-de-arrays-resueltos/)
- [Ejercicios de POO](https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/)

Este documento incluye toda la información estructurada en Markdown para facilitar su uso y comprensión.
