from jugador import Jugador  # Importamos la clase Jugador desde su archivo

def main():
    # Crear tres objetos de la clase Jugador
    jugador1 = Jugador("Lionel Messi", "Delantero", 36)
    jugador2 = Jugador("Cristiano Ronaldo", "Delantero", 39)
    jugador3 = Jugador("Kylian Mbappé", "Delantero", 24)

    # Mostrar la información de los jugadores
    print("Información de los jugadores:")
    jugador1.mostrar()
    print()  # Línea en blanco
    jugador2.mostrar()
    print()  # Línea en blanco
    jugador3.mostrar()

if __name__ == "__main__":
    main()
