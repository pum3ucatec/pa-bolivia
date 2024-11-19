class Jugador:
    def __init__(self, nombre_completo, posicion, edad):
        self.NombreCompleto = nombre_completo
        self.Posicion = posicion
        self.Edad = edad

    def mostrar(self):
        print(f"Jugador: {self.NombreCompleto}")
        print(f"Posicion: {self.Posicion}")
        print(f"Edad: {self.Edad}")
        print("-" * 30)  

#Son jugadores de un deporte electronico (LOL)
jugador1 = Jugador("Faker", "Midlaner", 28)
jugador2 = Jugador("Keria", "Support", 22)
jugador3 = Jugador("Oner", "Jungla", 23)

jugador1.mostrar()
jugador2.mostrar()
jugador3.mostrar()