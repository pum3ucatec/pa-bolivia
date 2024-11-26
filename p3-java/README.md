
# Cómo compilar y ejecutar un archivo `.java` en Ubuntu

Sigue estos pasos para compilar y ejecutar un archivo Java en Ubuntu.

---

## **1. Instalar Java**
Asegúrate de tener instalado el compilador y el entorno de ejecución de Java (como OpenJDK). Puedes verificarlo con:

```bash
java -version
javac -version
```

Si no está instalado, puedes instalarlo con:
```bash
sudo apt update
sudo apt install openjdk-11-jdk -y
```

---

## **2. Crear el archivo `.java`**
Crea un archivo `.java`. Por ejemplo, `HolaMundo.java`:

```bash
nano HolaMundo.java
```

Agrega el siguiente código:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

Guarda el archivo (`Ctrl + O`, luego `Enter` y `Ctrl + X`).

---

## **3. Compilar el archivo**
Compila el archivo usando el compilador `javac`:

```bash
javac HolaMundo.java
```

Esto generará un archivo llamado `HolaMundo.class` en el mismo directorio.

---

## **4. Ejecutar el archivo compilado**
Ejecuta el archivo compilado con el comando `java`:

```bash
java HolaMundo
```

Deberías ver el siguiente resultado:

```
¡Hola, Mundo!
```

---

## **Notas importantes**
- El nombre del archivo `.java` debe coincidir con el nombre de la clase pública. En este ejemplo, el archivo se llama `HolaMundo.java` porque la clase pública se llama `HolaMundo`.
- Para limpiar los archivos generados (`.class`), puedes usar:
  ```bash
  rm *.class
  ```

---

¡Y eso es todo! Ahora sabes cómo compilar y ejecutar un programa Java en Ubuntu.