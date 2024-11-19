class Bicicleta:
    def __init__(self, marca, modelo, categoria, color):
        self.marca = marca
        self.modelo = modelo
        self.categoria = categoria
        self.color = color
    
    def mostrar(self):
        print(f"+++++++++++++++++++++++")
        print(f"Marca Bicicleta: {self.marca}")
        print(f"Modelo Bicicleta: {self.modelo}")
        print(f"Tamaño Bicicleta: {self.categoria}")
        print(f"Color Bicicleta: {self.color}")