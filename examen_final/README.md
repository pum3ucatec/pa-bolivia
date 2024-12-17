# examen_final:

Este proyecto es una aplicación gráfica en Java que permite dibujar figuras geométricas como triángulos y elipses. Utiliza Java Swing para la interfaz gráfica y clases personalizadas para representar y dibujar las figuras.

## Requisitos

- **JDK 8** o superior instalado en el sistema.
- Un entorno de desarrollo como **Eclipse**, **IntelliJ IDEA**, o cualquier editor de texto con soporte para proyectos Java.

## Estructura del Proyecto

El proyecto contiene las siguientes clases:

- **`Geometria`**: Clase abstracta base para las figuras geométricas.
- **`Dibujable`**: Interfaz que define el método `dibujar`.
- **`Triangulo`**: Representa y dibuja un triángulo.
- **`Elipse`**: Representa y dibuja una elipse.
- **`Principal`**: Clase principal que crea un panel con las figuras y muestra la ventana gráfica.

## Configuración

1. **Clona o descarga el proyecto:**
   ```bash
   git clone https://github.com/pum3ucatec/pa-bolivia.git
   cd examen_final
   ```

2. **Compila el proyecto:**
   Asegúrate de compilar todas las clases dentro del paquete `examen_final`.
   
   Desde la terminal, navega a la carpeta raíz del proyecto y ejecuta:
   ```bash
   javac examen_final/*.java
   ```

3. **Ejecuta la aplicación:**
   Ejecuta la clase `Principal` desde la terminal:
   ```bash
   java examen_final.Principal
   ```

   O usa la funcionalidad de "Run" de tu entorno de desarrollo.

## Ejecución

Al ejecutar el programa, se abrirá una ventana gráfica que mostrará:

- Un triángulo de color rojo.
- Una elipse de color azul.

Las figuras están posicionadas y dimensionadas según el código en la clase `Principal`.

## Personalización

- Para cambiar colores, posiciones o dimensiones de las figuras, edita el constructor de la clase `Principal`.
- Agrega nuevas figuras siguiendo la estructura de `Triangulo` o `Elipse`.

