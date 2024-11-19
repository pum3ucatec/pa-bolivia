class Jugador:
    def __init__(self, nombre_completo, posicion, edad):
        self.NombreCompleto = nombre_completo
        self.Posicion = posicion
        self.Edad = edad

    def mostrar(self):
        print(f"Jugador: {self.NombreCompleto}")
        print(f"Posicion: {self.Posicion}")
        print(f"Edad: {self.Edad}")

jugador1 = Jugador("Faker", "Midlaner", 28)
jugador1.mostrar()