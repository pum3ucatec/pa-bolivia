# Importar la clase Perfumes
from perfumes import Perfumes

# Crear instancias de la clase Perfumes
perfume1 = Perfumes("born in Roma", "Valentino")
perfume2 = Perfumes("Scandal", "Jean Paul Gaultier")
perfume3 = Perfumes("Rave", "Lataffa")

# Llamar a los métodos para obtener el nombre y la marca
print(f"Perfume 1: Nombre - {perfume1.obtener_nombre()}, Marca - {perfume1.obtener_marca()}")
print(f"Perfume 2: Nombre - {perfume2.obtener_nombre()}, Marca - {perfume2.obtener_marca()}")
print(f"Perfume 3: Nombre - {perfume3.obtener_nombre()}, Marca - {perfume3.obtener_marca()}")