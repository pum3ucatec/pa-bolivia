class Jugador:
    def __init__(self, nombreCompleto, posicion, edad):
        self.nombreCompleto = nombreCompleto
        self.posicion = posicion
        self.edad = edad
    
    def mostrar(self):
        print(f"Nombre: {self.nombreCompleto}")
        print(f"Posición: {self.posicion}")
        print(f"Edad: {self.edad}")
        print("--------------")