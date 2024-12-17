# Proyecto de Figuras Geométricas

Este proyecto dibuja varias figuras geométricas en una ventana utilizando Java y Swing.

## Requisitos

- Java Development Kit (JDK) 8 o superior
    ```sh
    https://www.oracle.com/java/technologies/downloads/#jdk23-windows
    ```

- Un entorno de desarrollo integrado (IDE) como Visual Studio Code

## Estructura del Proyecto

El proyecto contiene las siguientes clases:

- `Principal`: Clase principal que extiende `JPanel` y dibuja las figuras geométricas.
- `Rectangulo`, `Circulo`, `Cuadrado`, `Triangulo`, `Elipse`: Clases que representan diferentes figuras geométricas.
- `Geometria`: Clase abstracta base para todas las figuras geométricas.

## Instrucciones para Ejecutar el Proyecto

1. Clona el repositorio o descarga los archivos del proyecto.

    ```sh
    git clone https://github.com/tu-usuario/tu-repositorio.git
    cd tu-repositorio
    ```

2. Abre el proyecto en tu IDE preferido.

3. Asegúrate de que el JDK esté configurado correctamente en tu IDE.

4. Compila y ejecuta la clase `Principal`.

    - En Visual Studio Code: Abre `Principal.java`, presiona `F5` y selecciona `Java`.

## Ejemplo de Uso

Al ejecutar el proyecto, se abrirá una ventana que mostrará varias figuras geométricas dibujadas en diferentes colores.

## Instrucciones de Cómo agregar una nueva forma

1. Crea una clase "Rombo.java" con un método "dibujar(Graphics g)".
2. Importa "Rombo" en "Principal.java".
3. Instancia "Rombo" en el constructor de `Principal`.
4. Llama a `dibujar(g)` de "Rombo" en `paintComponent(Graphics g)`.