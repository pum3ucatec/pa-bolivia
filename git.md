
# Comandos de Git y su Explicación

A continuación, se describen algunos comandos de Git que pueden ser útiles para gestionar un repositorio. Este documento fue creado basándose en un historial de comandos ejecutados.

## Explicación de los comandos

### 1. `git status`
Muestra el estado del área de trabajo. Te permite ver qué archivos han sido modificados, cuáles están en el área de preparación (staging area) y cuáles no están siendo rastreados por Git.

**Uso**:
```bash
git status
```

### 2. `git --version`
Muestra la versión de Git que tienes instalada en tu sistema.

**Uso**:
```bash
git --version
```

### 3. `git clean -f`
Elimina archivos no rastreados del directorio de trabajo. El flag `-f` (force) es necesario para ejecutar el comando.

**Uso**:
```bash
git clean -f
```

### 4. `git branch`
Lista todas las ramas en tu repositorio. Marca con un asterisco (*) la rama en la que te encuentras actualmente.

**Uso**:
```bash
git branch
```

### 5. `git log`
Muestra el historial de commits realizados en el repositorio, en orden cronológico inverso.

**Uso**:
```bash
git log
```

### 6. `git fetch`
Descarga los cambios del repositorio remoto, pero no los fusiona con tu rama actual. Es útil para obtener los últimos cambios sin afectar tu trabajo.

**Uso**:
```bash
git fetch
```

### 7. `git pull`
Descarga y fusiona los cambios del repositorio remoto con tu rama actual. Es equivalente a ejecutar `git fetch` seguido de `git merge`.

**Uso**:
```bash
git pull
```

### 8. `git revert <commit>`
Deshace un commit específico creando uno nuevo que invierte sus cambios. En este caso, el comando `git revert 84deb55f096ca877dedeb2f163db71e424ee4b17` revertiría el commit con ese hash.

**Uso**:
```bash
git revert <commit-hash>
```

### 9. `git push origin master`
Envía los commits locales de la rama `master` al repositorio remoto. Asegúrate de estar en la rama correcta antes de ejecutar este comando.

**Uso**:
```bash
git push origin master
```

### 10. `code .`
Abre el directorio actual en Visual Studio Code. Es útil para iniciar rápidamente el editor en el directorio en el que estás trabajando.

**Uso**:
```bash
code .
```

### 11. `cd <directorio>`
Cambia al directorio especificado. Por ejemplo, `cd p1-bolivia-info/` te moverá al directorio `p1-bolivia-info`.

**Uso**:
```bash
cd <directorio>
```

### 12. `ls -la`
Lista todos los archivos y directorios, incluidos los ocultos, en el directorio actual con detalles adicionales como permisos, propietario, tamaño y fecha de modificación.

**Uso**:
```bash
ls -la
```

## Notas adicionales

- Recuerda que para que algunos de estos comandos funcionen, debes estar en un directorio que sea un repositorio de Git.
- Usa `git help <comando>` si necesitas más detalles sobre cómo funciona un comando específico.

---

**Autor**: Gastón Quellalí
