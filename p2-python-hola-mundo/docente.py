class Docente:
    def __init__(self, nombres, apellidos, profesion, registro):
        self.nombres = nombres
        self.apellidos = apellidos
        self.profesion = profesion
        self.registro = registro
    
    def mostrar(self):
        print(f"+++++++++++++++++++++++")
        print(f"Registro: {self.registro}")
        print(f"Nombres: {self.nombres}")
        print(f"Apellidos: {self.apellidos}")
        print(f"Profesion: {self.profesion}")
