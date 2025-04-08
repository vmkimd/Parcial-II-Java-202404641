# Examen Parcial - Listas Enlazadas en Java 

##  Información del estudiante

Nombre: Kimberly Dayana Vasquez Mayén  
Carné: **202404641**  
Grupo asignado: **Grupo 2**  
DPI utilizado: **3153821980502**

---

##  Descripción del proyecto

Este proyecto fue desarrollado para la segunda evaluación parcial del curso de Estructura de Datos.  
Consiste en la implementación **desde cero** de una **lista enlazada simple en Java**, utilizando nodos y referencias, sin estructuras como `LinkedList`, `ArrayList`, `Vector`, etc.

Además, el proyecto:

 Usa mi **DPI como lista inicial**  
 Aplica todas las operaciones del **Grupo 2**  
 Es completamente **interactivo** para que pueda ingresar los datos manualmente durante la ejecución  
 Está comentado, ordenado y explicado con mi razonamiento

---

##  Estructura del proyecto

###  `Nodo.java`
Contiene la clase `Nodo`, que representa un nodo con:
- `dato` → el valor que guarda
- `siguiente` → la referencia al siguiente nodo

###  `ListaEnlazada.java`
Contiene la lógica de la lista enlazada simple. Incluye los siguientes métodos:
- `agregar(int dato)`
- `agregarAlInicio(int dato)`
- `agregarEnPosicion(int dato, int posicion)`
- `eliminar(int dato)`
- `contiene(int valor)`
- `invertir()`
- `imprimir()`

###  `Main.java`
Ejecuta paso a paso todas las operaciones del examen:
- Carga la lista inicial con los dígitos de mi DPI
- Luego me pide ingresar manualmente los valores según las instrucciones del Grupo 2
- Se imprime la lista después de cada paso para observar los cambios

---

##  ¿Cómo ejecutar?

1. Abre Visual Studio Code
2. Asegúrate de tener:
   - `Nodo.java`
   - `ListaEnlazada.java`
   - `Main.java`
3. Abre una terminal dentro de la carpeta del proyecto
4. Escribe:


---

##  Interacción esperada

Durante la ejecución, el programa me pedirá que ingrese:

1. Un número para agregar al inicio
2. Un número para agregar al final
3. Un número para insertar en posición 1
4. Un número para eliminar
5. Un número más para agregar al final
6. Dos números para verificar si están en la lista (uno debe estar, otro no)
7. Se invertirá la lista
8. Finalmente, se me pedirá ingresar otro número para agregar al inicio

---

##  Ejemplo real en consola

```plaintext
Lista inicial creada con el DPI:
3 -> 1 -> 5 -> 3 -> 8 -> 2 -> 1 -> 9 -> 8 -> 0 -> 5 -> 0 -> 2 -> null

Ingrese el número que desea agregar al INICIO: 1
Lista actual: 1 -> 3 -> 1 -> 5 -> ...

Ingrese el número que desea agregar al FINAL: 3
Lista actual: ...

Ingrese el número que desea agregar en la posición 1: 5
...

Ingrese el número que desea ELIMINAR: 3
...

Ingrese el número que desea agregar al FINAL nuevamente: 7
...

Ingrese un número para verificar si está en la lista: 5
¿Contiene el número 5? true

Ingrese otro número para verificar si está en la lista: 9
¿Contiene el número 9? true

Invirtiendo la lista...
...

Ingrese el último número que desea agregar al INICIO: 9
Lista final: 9 -> ...

