class Persona:
    def __init__(self, n, a):
        self.nombres = n
        self.apellidos = a
    
    def mostrar(self):
        print(f"Nombres: {self.nombres}")
        print(f"Apellidos: {self.apellidos}")
