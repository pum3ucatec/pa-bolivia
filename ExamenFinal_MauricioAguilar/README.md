//*
# Cómo ejecutar los programas de animación en Java

Este proyecto contiene dos programas independientes en Java que animan figuras geométricas: una elipse y un triángulo. Cada figura tiene su propia clase (*ClaseElipse* y *ClaseTriangulo*), y se ejecutan en ventanas separadas.

## **Requisitos previos**

1. Tener instalada una versión reciente del **JDK (Java Development Kit)** (preferentemente Java 8 o superior).
2. Contar con un editor de texto o un entorno de desarrollo integrado (IDE) como **IntelliJ IDEA**, **Eclipse**, o **Visual Studio Code** con soporte para Java.

---

## **Pasos para ejecutar el programa**

### **1. Descargar el código**

1. Copia y pega el código de las clases `ClaseElipse` y `ClaseTriangulo` en archivos separados con los siguientes nombres:
   - `ClaseElipse.java`
   - `ClaseTriangulo.java`

   Asegúrate de guardar los archivos en la misma carpeta para facilitar la compilación.

### **2. Compilar los programas**

1. Abre una terminal o el terminal integrado de tu IDE.
2. Navega al directorio donde guardaste los archivos usando el comando:

   ```bash
   cd /ruta/a/la/carpeta
   ```

3. Compila las clases usando el compilador de Java:

   ```bash
   javac ClaseElipse.java
   javac ClaseTriangulo.java
   ```

   Esto generará archivos `.class` en el mismo directorio.

### **3. Ejecutar los programas**

1. Una vez compilados, puedes ejecutar cada clase de forma independiente. Por ejemplo:

   Para ejecutar la animación de la elipse:

   ```bash
   java ClaseElipse
   ```

   Para ejecutar la animación del triángulo:

   ```bash
   java ClaseTriangulo
   ```

2. Aparecerá una ventana para cada programa que muestra la animación correspondiente.

---

## **Solución de problemas comunes**

1. **Error: 'javac' no se reconoce como un comando interno o externo:**
   - Asegúrate de que el JDK esté instalado y que la variable de entorno `PATH` esté configurada correctamente.

2. **El programa no abre una ventana:**
   - Verifica que no haya errores al compilar el código.
   - Revisa que el archivo tenga el mismo nombre que la clase correspondiente (por ejemplo, `ClaseElipse.java` para la clase `ClaseElipse`).

---

## **Personalización adicional**

- Puedes modificar los colores de las figuras cambiando los valores de `g.setColor(Color.X)` en las clases.
- Ajusta la velocidad de movimiento modificando el valor en `Thread.sleep(10)` (un número más alto reducirá la velocidad).
- Cambia las dimensiones o trayectorias editando las fórmulas de movimiento en los métodos `moverElipse()` y `moverTriangulo()`.

---

¡Disfruta explorando y modificando estas animaciones en Java! Si tienes alguna duda o problema, no dudes en pedir ayuda.

//