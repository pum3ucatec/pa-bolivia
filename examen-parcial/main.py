from jugador import Jugador

def main():
    jugador1 = Jugador("Angel Guzman", "Delantero", 36)
    jugador2 = Jugador("Roberto Meneces", "Delantero", 38)
    jugador3 = Jugador("Jorge Alfonso", "Delantero", 24)

    jugador1.mostrar()
    jugador2.mostrar()
    jugador3.mostrar()

if __name__ == "__main__":
    main()