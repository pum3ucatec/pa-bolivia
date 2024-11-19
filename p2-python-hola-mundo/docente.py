class Celular:
    def __init__(self, marca, modelo, caracteristica, codigo):
        self.marcas = marcas
        self.modelos = modelos
        self.caracteristica = caracteristica
        self.codigo = codigo
    
    def mostrar(self):
        print(f"+++++++++++++++++++++++")
        print(f"Codigo: {self.codigo}")
        print(f"Marca: {self.marcas}")
        print(f"Modelos: {self.modelos}")
        print(f"Caracteristica: {self.caracteristica}")
    
