class Jugador:
    def __init__(self, nombre_completo, posicion, edad):
        # Variables miembro
        self.nombre_completo = nombre_completo
        self.posicion = posicion
        self.edad = edad

    # Método para mostrar la información del jugador
    def mostrar(self):
        print(f"Nombre: {self.nombre_completo}")
        print(f"Posición: {self.posicion}")
        print(f"Edad: {self.edad} años")

    # Getters y setters (opcional)
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
jugador2 = Jugador("Cristiano Ronaldo", "Delantero", 39)

# Mostrar la información de los jugadores
jugador1.mostrar()
jugador2.mostrar()
