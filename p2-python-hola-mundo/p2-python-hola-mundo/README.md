
# Ejercicio: Clase Persona en Python

## Descripción

Este proyecto consiste en la creación de una clase `Persona` en Python. La clase tiene dos atributos miembros (`nombres` y `apellidos`) y un método para mostrar la información de la persona. La clase está definida en un archivo llamado `persona.py`. Otro archivo llamado `main.py` utiliza esta clase para crear objetos y mostrar su información.

### Estructura del proyecto

```
proyecto/
├── persona.py     # Archivo que contiene la clase Persona
└── main.py        # Archivo principal para ejecutar el programa
```

## Enunciado del Ejercicio

1. Crear una clase llamada `Persona` en un archivo `persona.py` con los siguientes elementos:
    - **Atributos**:
        - `nombres`: Cadena de texto que almacena los nombres de la persona.
        - `apellidos`: Cadena de texto que almacena los apellidos de la persona.
    - **Métodos**:
        - `mostrar_informacion()`: Imprime en pantalla los nombres y apellidos de la persona.

2. Crear un archivo `main.py` que importe la clase `Persona` desde `persona.py` y permita:
    - Crear un objeto de la clase `Persona`.
    - Llamar al método `mostrar_informacion()` para mostrar los datos de la persona.

## Instrucciones para ejecutar el programa

### 1. Clonar el repositorio (opcional)
Si estás utilizando un repositorio de Git, clona el proyecto con:

```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
cd tu-repositorio
```

### 2. Asegurarse de tener Python instalado

Verifica que Python esté instalado ejecutando en la terminal:

```bash
python3 --version
```

### 3. Ejecutar el programa

Para ejecutar el programa, sigue estos pasos:

1. Navega al directorio del proyecto:

    ```bash
    cd proyecto
    ```

2. Ejecuta el archivo `main.py`:

    ```bash
    python3 main.py
    ```

### Ejemplo de salida esperada

```
Nombres: Ana María
Apellidos: Lopez Mendoza
```

## Requisitos

- Python 3.6 o superior
