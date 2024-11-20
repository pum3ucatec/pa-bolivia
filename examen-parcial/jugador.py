# main.py
from jugador import Jugador


def main():
   # Crear tres objetos de la clase Jugador
   jugador1 = Jugador("Mauricio Aguilar", "Arquero", 33)
   jugador2 = Jugador("Cristiano Ronaldo", "Delantero", 39)
   jugador3 = Jugador("Luka Modrić", "Mediocampista", 38)
  
   # Mostrar la información de cada jugador
   jugador1.mostrar()
   jugador2.mostrar()
   jugador3.mostrar()


if __name__ == "__main__":
   main()
