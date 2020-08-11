/*
DEBE TENER UN MISMO TIPO DE DATO
LOS NODOS TIENEN DOS CAMPOS
* EL CONTENIDO Y UN PUNTERO QUE ES LA DIRECCION DEL SIGUIENTE NODO
* EXISTE UN PRIMERO,
 */

public class Nodo {
    // CAMPOS
    int dato;
    String datoString;
    double datoDouble;
    Nodo siguiente; // Teoria Recursiva

    // Constructor por defecto
    Nodo(){
        datoDouble = 0.0;
        datoString = " ";
        dato = 0;
        siguiente = null;// es de tipo null por que es el valor por defecto de los objetos
    }
    //Constructor ordinario
    public Nodo(int valorDato){
        dato = valorDato;
        siguiente = null;
    }

    public Nodo(String valorString){
        datoString = valorString;
        siguiente = null;
    }

    public Nodo(double valorDouble) {
        datoDouble = valorDouble;
        siguiente = null;
    }
}
