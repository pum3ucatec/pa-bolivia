# jugador.py
class Jugador:
   def __init__(self, nombre_completo, posicion, edad):
       self.NombreCompleto = nombre_completo
       self.Posicion = posicion
       self.Edad = edad


   def mostrar(self):
       print(f"Nombre: {self.NombreCompleto}")
       print(f"Posición: {self.Posicion}")
       print(f"Edad: {self.Edad}")
       print("-" * 20)
