from persona import Persona
from docente import Docente
from bicicleta import Bicicleta

objGaston = Persona("Gaston Genaro", "Quelali Calcina")
objRaul = Persona("Raul", "Heredia")

objGaston.mostrar()
objRaul.mostrar()

objGastonDocente = Docente("GASTON GENARO", "QUELALI CALCINA", "Lic. en Ing. de Sistemas", 451245)
objGastonDocente.mostrar()

objBici = Bicicleta("BMX", "Montañera", "Adulto","Negro")
objBici.mostrar()