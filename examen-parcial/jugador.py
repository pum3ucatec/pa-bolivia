class jugador:
    def __init__(self, nombre_completo, posicion, edad):
        self.nombre_completo = nombre_completo
        self.posicion = posicion
        self.edad = edad

    def mostrar(self):
        print("+++++++++++++++ FICHA JUGADOR +++++++++++++++")
        print(f"Nombre Completo del Jugador: {self.nombre_completo}")
        print(f"Posición que Juega el Jugador: {self.posicion}")
        print(f"La Edad del Jugador: {self.edad}")
        print("++++++++++++++++++++++++++++++++++++++++++++\n")
