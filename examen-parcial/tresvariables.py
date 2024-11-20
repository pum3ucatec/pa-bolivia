class Jugador:
    def __init__(self, nombre_completo, posicion, edad):
        # Variables miembro
        self.nombre_completo = nombre_completo
        self.posicion = posicion
        self.edad = edad

    # Método para mostrar la información del jugador
    def mostrar_informacion(self):
        print(f"Nombre: {self.nombre_completo}")
        print(f"Posición: {self.posicion}")
        print(f"Edad: {self.edad} años")

    # Getters y setters (opcional, pero se puede usar si deseas controlarlos)
    def get_nombre_completo(self):
        return self.nombre_completo

    def set_nombre_completo(self, nombre_completo):
        self.nombre_completo = nombre_completo

    def get_posicion(self):
        return self.posicion

    def set_posicion(self, posicion):
        self.posicion = posicion

    def get_edad(self):
        return self.edad

    def set_edad(self, edad):
        self.edad = edad


# Ejemplo de uso
jugador1 = Jugador("Lionel Messi", "Delantero", 36)

# Mostrar la información del jugador
jugador1.mostrar_informacion()


