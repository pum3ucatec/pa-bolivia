class Perfumes:
    def __init__(self, nombre, marca):
        self.nombre = nombre
        self.marca = marca

    def mostrar (self):
         print(f"Nombres: {self.nombre}")
         print(f"Marcas: {self.marca}")

    def obtener_nombre(self):
        return self.nombre

    def obtener_marca(self):
        return self.marca

    