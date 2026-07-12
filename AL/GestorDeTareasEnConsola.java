import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeTareasEnConsola {

    static class Tarea {
        String descripcion;
        boolean completada;

        public Tarea(String descripcion) {
            this.descripcion = descripcion;
            this.completada = false;
        }

        @Override
        public String toString() {
            return "[" + (completada ? "X" : " ") + "] " + descripcion;
        }
    }

    public static void main(String[] args) {
        ArrayList<Tarea> listaTareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Escriba la descripción de la tarea: ");
                    String desc = scanner.nextLine();
                    listaTareas.add(new Tarea(desc));
                    System.out.println("Tarea añadida correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE TAREAS ---");
                    if (listaTareas.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        for (int i = 0; i < listaTareas.size(); i++) {
                            System.out.println((i + 1) + ". " + listaTareas.get(i));
                        }
                    }
                    break;

                case 3:
                    if (listaTareas.isEmpty()) {
                        System.out.println("No hay tareas para marcar.");
                    } else {
                        System.out.print("Número de tarea a marcar como completada: ");
                        try {
                            int indice = Integer.parseInt(scanner.nextLine()) - 1;
                            if (indice >= 0 && indice < listaTareas.size()) {
                                listaTareas.get(indice).completada = true;
                                System.out.println("Tarea marcada como completada.");
                            } else {
                                System.out.println("Número fuera de rango.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada no válida.");
                        }
                    }
                    break;

                case 4:
                    if (listaTareas.isEmpty()) {
                        System.out.println("No hay tareas para eliminar.");
                    } else {
                        System.out.print("Número de tarea a eliminar: ");
                        try {
                            int indiceEliminar = Integer.parseInt(scanner.nextLine()) - 1;
                            if (indiceEliminar >= 0 && indiceEliminar < listaTareas.size()) {
                                listaTareas.remove(indiceEliminar);
                                System.out.println("Tarea eliminada.");
                            } else {
                                System.out.println("Número fuera de rango.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada no válida.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del gestor...");
                    break;

                default:
                    System.out.println("Opción no reconocida.");
                    break;
            }
        }
        scanner.close();
    }
}

//Claro. Te explico el programa **parte por parte**, qué hace cada cosa y por qué se colocó ahí.
//
//Este programa es un **gestor de tareas en consola**. Sirve para:
//
//1. Añadir tareas.
//2. Ver tareas.
//3. Marcar tareas como completadas.
//4. Eliminar tareas.
//5. Salir del programa.
//
//---
//
//## 1. Importaciones
//
//```java
//import java.util.ArrayList;
//import java.util.Scanner;
//```
//
//
//### ¿Qué hace esto?
//
//Estas líneas traen herramientas que Java ya tiene hechas.
//
//### `ArrayList`
//
//```java
//import java.util.ArrayList;
//```
//
//
//Sirve para crear una **lista que puede crecer o reducirse**.
//
//En este programa se usa para guardar las tareas.
//
//Por ejemplo, la lista puede tener:
//
//```plain text
//1. Hacer tarea
//2. Estudiar Java
//3. Comprar comida
//```
//
//
//Si agregas otra tarea, la lista crece.
//Si eliminas una tarea, la lista se reduce.
//
//---
//
//### `Scanner`
//
//```java
//import java.util.Scanner;
//```
//
//
//Sirve para leer lo que el usuario escribe por teclado.
//
//Por ejemplo, cuando el programa pregunta:
//
//```plain text
//Seleccione una opción:
//```
//
//
//`Scanner` permite capturar lo que escribes.
//
//---
//
//## 2. Clase principal
//
//```java
//public class GestorDeTareasEnConsola {
//```
//
//
//### ¿Qué hace?
//
//Esto define la clase principal del programa.
//
//En Java, casi todo va dentro de una clase.
//
//### ¿Por qué se colocó?
//
//Porque Java necesita una clase para organizar el código.
//
//El nombre de la clase es:
//
//```java
//GestorDeTareasEnConsola
//```
//
//
//Y normalmente el archivo debe llamarse igual:
//
//```plain text
//GestorDeTareasEnConsola.java
//```
//
//
//---
//
//## 3. Clase interna `Tarea`
//
//```java
//static class Tarea {
//```
//
//
//### ¿Qué hace?
//
//Aquí se crea una clase llamada `Tarea`.
//
//Una tarea tendrá sus propios datos:
//
//```java
//String descripcion;
//boolean completada;
//```
//
//
//### ¿Por qué se colocó?
//
//Porque una tarea no es solo texto. También necesitamos saber si está completada o no.
//
//Por ejemplo:
//
//```plain text
//[ ] Estudiar Java
//[X] Hacer ejercicio
//```
//
//
//Cada tarea tiene:
//
//- Una descripción.
//- Un estado: completada o no completada.
//
//---
//
//## 4. Variable `descripcion`
//
//```java
//String descripcion;
//```
//
//
//### ¿Qué hace?
//
//Guarda el texto de la tarea.
//
//Por ejemplo:
//
//```plain text
//"Estudiar Java"
//```
//
//
//### ¿Por qué es `String`?
//
//Porque una descripción es texto.
//
//---
//
//## 5. Variable `completada`
//
//```java
//boolean completada;
//```
//
//
//### ¿Qué hace?
//
//Guarda si la tarea está completada o no.
//
//Como es `boolean`, solo puede valer:
//
//```java
//true
//```
//
//
//o
//
//```java
//false
//```
//
//
//### Ejemplo
//
//Si está pendiente:
//
//```java
//completada = false;
//```
//
//
//Si ya se terminó:
//
//```java
//completada = true;
//```
//
//
//---
//
//## 6. Constructor de la tarea
//
//```java
//public Tarea(String descripcion) {
//    this.descripcion = descripcion;
//    this.completada = false;
//}
//```
//
//
//### ¿Qué hace?
//
//Este bloque se ejecuta cuando creas una tarea nueva.
//
//Por ejemplo:
//
//```java
//new Tarea("Estudiar Java")
//```
//
//
//Cuando haces eso, Java entra aquí:
//
//```java
//public Tarea(String descripcion)
//```
//
//
//Y recibe la descripción de la tarea.
//
//---
//
//### Esta línea:
//
//```java
//this.descripcion = descripcion;
//```
//
//
//Significa:
//
//> La descripción de esta tarea será igual a la descripción que me mandaron.
//
//Hay dos `descripcion`:
//
//```java
//String descripcion;
//```
//
//
//y
//
//```java
//public Tarea(String descripcion)
//```
//
//
//La primera es la variable de la tarea.
//La segunda es el dato que llega al constructor.
//
//Por eso se usa `this`.
//
//### ¿Qué significa `this`?
//
//`this` significa:
//
//> Este objeto actual.
//
//Entonces:
//
//```java
//this.descripcion = descripcion;
//```
//
//
//quiere decir:
//
//> La descripción de esta tarea será igual al texto recibido.
//
//---
//
//### Esta línea:
//
//```java
//this.completada = false;
//```
//
//
//Significa que cada tarea nueva empieza como **no completada**.
//
//Tiene sentido, porque cuando agregas una tarea nueva, normalmente todavía no está hecha.
//
//Ejemplo:
//
//```plain text
//[ ] Estudiar Java
//```
//
//
//No aparece con `X` todavía.
//
//---
//
//## 7. Método `toString`
//
//```java
//@Override
//public String toString() {
//    return "[" + (completada ? "X" : " ") + "] " + descripcion;
//}
//```
//
//
//### ¿Qué hace?
//
//Este método define cómo se verá una tarea cuando la imprimas.
//
//Por ejemplo, en vez de mostrar algo raro como:
//
//```plain text
//GestorDeTareasEnConsola$Tarea@1a2b3c
//```
//
//
//muestra algo bonito:
//
//```plain text
//[ ] Estudiar Java
//```
//
//
//o:
//
//```plain text
//[X] Estudiar Java
//```
//
//
//---
//
//### ¿Qué hace `@Override`?
//
//```java
//@Override
//```
//
//
//Significa que estamos reemplazando un método que ya existe en Java.
//
//Todas las clases en Java tienen un método llamado `toString()`, pero por defecto no muestra algo útil.
//
//Entonces aquí lo cambiamos para que muestre la tarea de forma entendible.
//
//---
//
//### Explicación de esta parte:
//
//```java
//(completada ? "X" : " ")
//```
//
//
//Esto se llama operador ternario.
//
//Es una forma corta de hacer un `if`.
//
//Significa:
//
//```plain text
//si completada es true, usa "X"
//si completada es false, usa " "
//```
//
//
//Es decir:
//
//```java
//completada ? "X" : " "
//```
//
//
//equivale a:
//
//```java
//if (completada) {
//    usar "X";
//} else {
//    usar " ";
//}
//```
//
//
//Entonces:
//
//```java
//return "[" + (completada ? "X" : " ") + "] " + descripcion;
//```
//
//
//Si la tarea está completada, devuelve:
//
//```plain text
//[X] Estudiar Java
//```
//
//
//Si no está completada, devuelve:
//
//```plain text
//[ ] Estudiar Java
//```
//
//
//---
//
//## 8. Método `main`
//
//```java
//public static void main(String[] args) {
//```
//
//
//### ¿Qué hace?
//
//Es el punto de inicio del programa.
//
//Cuando ejecutas el archivo, Java empieza leyendo desde aquí.
//
//### ¿Por qué se colocó?
//
//Porque todo programa de consola en Java necesita un `main` para poder ejecutarse.
//
//---
//
//## 9. Lista de tareas
//
//```java
//ArrayList<Tarea> listaTareas = new ArrayList<>();
//```
//
//
//### ¿Qué hace?
//
//Crea una lista vacía donde se guardarán las tareas.
//
//### Explicación por partes
//
//```java
//ArrayList<Tarea>
//```
//
//
//Significa:
//
//> Una lista que guarda objetos de tipo `Tarea`.
//
//No guarda números, no guarda cualquier cosa, guarda tareas.
//
//```java
//listaTareas
//```
//
//
//Es el nombre de la lista.
//
//```java
//new ArrayList<>()
//```
//
//
//Crea la lista nueva en memoria.
//
//Al inicio está vacía:
//
//```plain text
//[]
//```
//
//
//Después puedes agregar tareas:
//
//```plain text
//[Estudiar Java, Comprar comida, Hacer ejercicio]
//```
//
//
//---
//
//## 10. Scanner
//
//```java
//Scanner scanner = new Scanner(System.in);
//```
//
//
//### ¿Qué hace?
//
//Crea un lector para capturar lo que el usuario escribe.
//
//### ¿Por qué se colocó?
//
//Porque el programa necesita que el usuario elija opciones y escriba descripciones.
//
//Por ejemplo:
//
//```plain text
//Seleccione una opción: 1
//Escriba la descripción de la tarea: Estudiar Java
//```
//
//
//`Scanner` permite leer eso.
//
//---
//
//## 11. Variable `opcion`
//
//```java
//int opcion = 0;
//```
//
//
//### ¿Qué hace?
//
//Guarda la opción que el usuario selecciona en el menú.
//
//Por ejemplo:
//
//```plain text
//1
//2
//3
//4
//5
//```
//
//
//### ¿Por qué empieza en `0`?
//
//Porque el menú se repite mientras la opción sea diferente de `5`.
//
//Mira esto:
//
//```java
//while (opcion != 5)
//```
//
//
//Si `opcion` empezara en `5`, el programa terminaría inmediatamente.
//
//Como empieza en `0`, entra al menú por primera vez.
//
//---
//
//## 12. Ciclo `while`
//
//```java
//while (opcion != 5) {
//```
//
//
//### ¿Qué hace?
//
//Repite el menú mientras el usuario no elija salir.
//
//La opción para salir es:
//
//```plain text
//5. Salir
//```
//
//
//Entonces el programa dice:
//
//> Mientras la opción no sea 5, sigue mostrando el menú.
//
//### ¿Por qué se colocó?
//
//Porque queremos que el programa no termine después de hacer una sola cosa.
//
//Sin `while`, el usuario solo podría añadir una tarea o ver tareas una vez, y luego el programa acabaría.
//
//Con `while`, el menú se muestra una y otra vez.
//
//---
//
//## 13. Menú del programa
//
//```java
//System.out.println("\n--- GESTOR DE TAREAS ---");
//System.out.println("1. Añadir tarea");
//System.out.println("2. Ver tareas");
//System.out.println("3. Marcar tarea como completada");
//System.out.println("4. Eliminar tarea");
//System.out.println("5. Salir");
//System.out.print("Seleccione una opción: ");
//```
//
//
//### ¿Qué hace?
//
//Muestra las opciones disponibles.
//
//### Diferencia entre `println` y `print`
//
//```java
//System.out.println()
//```
//
//
//Imprime y baja a la siguiente línea.
//
//```java
//System.out.print()
//```
//
//
//Imprime, pero se queda en la misma línea.
//
//Por eso se usa:
//
//```java
//System.out.print("Seleccione una opción: ");
//```
//
//
//Para que el usuario escriba al lado:
//
//```plain text
//Seleccione una opción: 1
//```
//
//
//---
//
//## 14. Leer la opción con `try`
//
//```java
//try {
//    opcion = Integer.parseInt(scanner.nextLine());
//} catch (NumberFormatException e) {
//    System.out.println("Por favor, introduzca un número válido.");
//    continue;
//}
//```
//
//
//### ¿Qué hace?
//
//Intenta leer lo que el usuario escribió y convertirlo a número.
//
//---
//
//### Esta parte:
//
//```java
//scanner.nextLine()
//```
//
//
//Lee una línea completa de texto.
//
//Por ejemplo, si el usuario escribe:
//
//```plain text
//3
//```
//
//
//Java lo lee como texto:
//
//```java
//"3"
//```
//
//
//---
//
//### Esta parte:
//
//```java
//Integer.parseInt(scanner.nextLine())
//```
//
//
//Convierte ese texto a número entero.
//
//Ejemplo:
//
//```java
//"3"
//```
//
//
//se convierte en:
//
//```java
//3
//```
//
//
//---
//
//### ¿Por qué se usa `try/catch`?
//
//Porque el usuario podría escribir algo que no es un número.
//
//Por ejemplo:
//
//```plain text
//hola
//```
//
//
//Entonces esto fallaría:
//
//```java
//Integer.parseInt("hola")
//```
//
//
//Para evitar que el programa se cierre con error, usamos:
//
//```java
//try {
//    // intenta hacer esto
//} catch (NumberFormatException e) {
//    // si falla, haz esto
//}
//```
//
//
//---
//
//### ¿Qué es `NumberFormatException`?
//
//Es el error que ocurre cuando Java no puede convertir un texto a número.
//
//Ejemplo:
//
//```java
//Integer.parseInt("abc")
//```
//
//
//Eso produce un `NumberFormatException`.
//
//---
//
//### ¿Qué hace `continue`?
//
//```java
//continue;
//```
//
//
//Hace que el programa vuelva al inicio del `while`.
//
//O sea, vuelve a mostrar el menú.
//
//Se usa aquí porque si el usuario escribió algo inválido, no queremos pasar al `switch`.
//
//---
//
//## 15. `switch`
//
//```java
//switch (opcion) {
//```
//
//
//### ¿Qué hace?
//
//Revisa qué opción eligió el usuario.
//
//Si eligió `1`, hace el caso 1.
//Si eligió `2`, hace el caso 2.
//Si eligió `3`, hace el caso 3.
//Y así.
//
//### ¿Por qué se colocó?
//
//Porque tienes varias acciones posibles según el número ingresado.
//
//Es más ordenado que hacer muchos `if`.
//
//---
//
//# CASO 1: Añadir tarea
//
//```java
//case 1:
//    System.out.print("Escriba la descripción de la tarea: ");
//    String desc = scanner.nextLine();
//    listaTareas.add(new Tarea(desc));
//    System.out.println("Tarea añadida correctamente.");
//    break;
//```
//
//
//## ¿Qué hace?
//
//Permite agregar una nueva tarea a la lista.
//
//---
//
//### Esta línea:
//
//```java
//System.out.print("Escriba la descripción de la tarea: ");
//```
//
//
//Le pide al usuario que escriba la tarea.
//
//---
//
//### Esta línea:
//
//```java
//String desc = scanner.nextLine();
//```
//
//
//Lee la descripción escrita.
//
//Ejemplo:
//
//```plain text
//Estudiar Java
//```
//
//
//Y la guarda en:
//
//```java
//desc
//```
//
//
//---
//
//### Esta línea:
//
//```java
//listaTareas.add(new Tarea(desc));
//```
//
//
//Hace dos cosas:
//
//Primero crea una tarea nueva:
//
//```java
//new Tarea(desc)
//```
//
//
//Luego la agrega a la lista:
//
//```java
//listaTareas.add(...)
//```
//
//
//Ejemplo:
//
//Si `desc` vale:
//
//```java
//"Estudiar Java"
//```
//
//
//Entonces se crea:
//
//```plain text
//[ ] Estudiar Java
//```
//
//
//Y se guarda en la lista.
//
//---
//
//### Esta línea:
//
//```java
//break;
//```
//
//
//Termina el `case 1`.
//
//Si no pones `break`, Java podría seguir ejecutando el siguiente caso.
//
//---
//
//# CASO 2: Ver tareas
//
//```java
//case 2:
//    System.out.println("\n--- LISTA DE TAREAS ---");
//    if (listaTareas.isEmpty()) {
//        System.out.println("La lista está vacía.");
//    } else {
//        for (int i = 0; i < listaTareas.size(); i++) {
//            System.out.println((i + 1) + ". " + listaTareas.get(i));
//        }
//    }
//    break;
//```
//
//
//## ¿Qué hace?
//
//Muestra todas las tareas guardadas.
//
//---
//
//### Esta línea:
//
//```java
//if (listaTareas.isEmpty()) {
//```
//
//
//Pregunta:
//
//> ¿La lista está vacía?
//
//Si no hay tareas, muestra:
//
//```plain text
//La lista está vacía.
//```
//
//
//---
//
//### Si sí hay tareas:
//
//```java
//for (int i = 0; i < listaTareas.size(); i++) {
//```
//
//
//Este `for` recorre la lista.
//
//---
//
//### Explicación del `for`
//
//```java
//int i = 0;
//```
//
//
//Empieza desde la posición 0.
//
//En Java, las listas empiezan desde 0.
//
//Ejemplo:
//
//```plain text
//posición 0 -> Estudiar Java
//posición 1 -> Comprar comida
//posición 2 -> Hacer ejercicio
//```
//
//
//---
//
//```java
//i < listaTareas.size();
//```
//
//
//El ciclo se repite mientras `i` sea menor que la cantidad de tareas.
//
//Si hay 3 tareas:
//
//```java
//listaTareas.size()
//```
//
//
//vale `3`.
//
//Entonces `i` será:
//
//```plain text
//0, 1, 2
//```
//
//
//---
//
//```java
//i++
//```
//
//
//Aumenta `i` en 1 después de cada vuelta.
//
//---
//
//### Esta línea:
//
//```java
//System.out.println((i + 1) + ". " + listaTareas.get(i));
//```
//
//
//Muestra cada tarea.
//
//Se usa:
//
//```java
//i + 1
//```
//
//
//porque al usuario no le gusta ver tareas desde 0.
//
//Internamente Java usa:
//
//```plain text
//0, 1, 2
//```
//
//
//Pero al usuario se le muestra:
//
//```plain text
//1, 2, 3
//```
//
//
//Ejemplo:
//
//```plain text
//1. [ ] Estudiar Java
//2. [X] Comprar comida
//```
//
//
//---
//
//### Esta parte:
//
//```java
//listaTareas.get(i)
//```
//
//
//Obtiene la tarea en la posición `i`.
//
//Si `i = 0`, obtiene la primera tarea.
//
//---
//
//# CASO 3: Marcar tarea como completada
//
//```java
//case 3:
//    if (listaTareas.isEmpty()) {
//        System.out.println("No hay tareas para marcar.");
//    } else {
//        System.out.print("Número de tarea a marcar como completada: ");
//        try {
//            int indice = Integer.parseInt(scanner.nextLine()) - 1;
//            if (indice >= 0 && indice < listaTareas.size()) {
//                listaTareas.get(indice).completada = true;
//                System.out.println("Tarea marcada como completada.");
//            } else {
//                System.out.println("Número fuera de rango.");
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("Entrada no válida.");
//        }
//    }
//    break;
//```
//
//
//## ¿Qué hace?
//
//Permite elegir una tarea y marcarla como terminada.
//
//---
//
//### Primero revisa si hay tareas
//
//```java
//if (listaTareas.isEmpty()) {
//    System.out.println("No hay tareas para marcar.");
//}
//```
//
//
//Si la lista está vacía, no se puede marcar nada.
//
//---
//
//### Si hay tareas, pide un número
//
//```java
//System.out.print("Número de tarea a marcar como completada: ");
//```
//
//
//El usuario puede escribir, por ejemplo:
//
//```plain text
//2
//```
//
//
//---
//
//### Esta línea:
//
//```java
//int indice = Integer.parseInt(scanner.nextLine()) - 1;
//```
//
//
//Convierte lo que escribió el usuario en número.
//
//Pero se resta 1 porque el usuario ve las tareas desde 1, mientras Java las guarda desde 0.
//
//Ejemplo:
//
//Si el usuario escribe:
//
//```plain text
//1
//```
//
//
//Java necesita acceder a la posición:
//
//```java
//0
//```
//
//
//Por eso:
//
//```java
//1 - 1 = 0
//```
//
//
//Si el usuario escribe:
//
//```plain text
//2
//```
//
//
//Java usa:
//
//```java
//2 - 1 = 1
//```
//
//
//---
//
//### Validación del rango
//
//```java
//if (indice >= 0 && indice < listaTareas.size()) {
//```
//
//
//Esto revisa que el número exista en la lista.
//
//Por ejemplo, si hay 3 tareas, los índices válidos son:
//
//```plain text
//0, 1, 2
//```
//
//
//Entonces:
//
//```java
//indice >= 0
//```
//
//
//evita números negativos.
//
//```java
//indice < listaTareas.size()
//```
//
//
//evita números demasiado grandes.
//
//---
//
//### Marcar como completada
//
//```java
//listaTareas.get(indice).completada = true;
//```
//
//
//Esto obtiene la tarea elegida y cambia su variable `completada` a `true`.
//
//Antes:
//
//```plain text
//[ ] Estudiar Java
//```
//
//
//Después:
//
//```plain text
//[X] Estudiar Java
//```
//
//
//---
//
//# CASO 4: Eliminar tarea
//
//```java
//case 4:
//    if (listaTareas.isEmpty()) {
//        System.out.println("No hay tareas para eliminar.");
//    } else {
//        System.out.print("Número de tarea a eliminar: ");
//        try {
//            int indiceEliminar = Integer.parseInt(scanner.nextLine()) - 1;
//            if (indiceEliminar >= 0 && indiceEliminar < listaTareas.size()) {
//                listaTareas.remove(indiceEliminar);
//                System.out.println("Tarea eliminada.");
//            } else {
//                System.out.println("Número fuera de rango.");
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("Entrada no válida.");
//        }
//    }
//    break;
//```
//
//
//## ¿Qué hace?
//
//Permite borrar una tarea de la lista.
//
//Es muy parecido al caso 3.
//
//---
//
//### Esta línea:
//
//```java
//int indiceEliminar = Integer.parseInt(scanner.nextLine()) - 1;
//```
//
//
//Lee el número de tarea y lo convierte al índice real de Java.
//
//Si el usuario escribe:
//
//```plain text
//1
//```
//
//
//Java elimina la posición:
//
//```java
//0
//```
//
//
//---
//
//### Esta línea:
//
//```java
//listaTareas.remove(indiceEliminar);
//```
//
//
//Elimina la tarea de la lista.
//
//Ejemplo:
//
//Antes:
//
//```plain text
//1. [ ] Estudiar Java
//2. [ ] Comprar comida
//```
//
//
//Si eliminas la tarea 1:
//
//Después:
//
//```plain text
//1. [ ] Comprar comida
//```
//
//
//---
//
//# CASO 5: Salir
//
//```java
//case 5:
//    System.out.println("Saliendo del gestor...");
//    break;
//```
//
//
//## ¿Qué hace?
//
//Muestra un mensaje de salida.
//
//Después de esto, como `opcion` vale `5`, el `while` ya no se repite.
//
//Recuerda:
//
//```java
//while (opcion != 5)
//```
//
//
//Si `opcion` es `5`, el ciclo termina.
//
//---
//
//# DEFAULT: Opción no reconocida
//
//```java
//default:
//    System.out.println("Opción no reconocida.");
//    break;
//```
//
//
//## ¿Qué hace?
//
//Se ejecuta si el usuario escribe un número que no está en el menú.
//
//Por ejemplo:
//
//```plain text
//9
//```
//
//
//Como no existe `case 9`, entra en `default`.
//
//---
//
//## 16. Cerrar el scanner
//
//```java
//scanner.close();
//```
//
//
//### ¿Qué hace?
//
//Cierra el lector de teclado.
//
//### ¿Por qué se coloca?
//
//Es una buena práctica cerrar recursos cuando ya no se usan.
//
//Se coloca al final porque ya no necesitamos leer más datos.
//
//---
//
//# Resumen general del funcionamiento
//
//El programa hace esto:
//
//```plain text
//1. Crea una lista vacía de tareas.
//2. Muestra un menú.
//3. Lee la opción del usuario.
//4. Según la opción:
//   - agrega una tarea
//   - muestra tareas
//   - marca una tarea
//   - elimina una tarea
//   - sale
//5. Repite el menú hasta que el usuario elija 5.
//```
//
//
//---
//
//# La parte más importante del programa
//
//La estructura principal es esta:
//
//```java
//while (opcion != 5) {
//    mostrar menú
//    leer opción
//
//    switch (opcion) {
//        case 1:
//            añadir tarea
//            break;
//        case 2:
//            ver tareas
//            break;
//        case 3:
//            marcar tarea
//            break;
//        case 4:
//            eliminar tarea
//            break;
//        case 5:
//            salir
//            break;
//        default:
//            opción inválida
//            break;
//    }
//}
//```
//
//
//Esa es la lógica central.
//
//---
//
//# En palabras simples
//
//Este programa funciona como una libreta de tareas.
//
//La clase `Tarea` define cómo es una tarea:
//
//```plain text
//descripción + si está completada o no
//```
//
//
//El `ArrayList` guarda muchas tareas.
//
//El `while` mantiene el menú activo.
//
//El `switch` decide qué hacer según la opción.
//
//El `Scanner` lee lo que escribe el usuario.
//
//Y los `try/catch` evitan que el programa se dañe si el usuario escribe letras en vez de números.