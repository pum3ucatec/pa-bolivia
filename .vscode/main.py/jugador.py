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
