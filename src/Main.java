public class Main {
    public static void main(String[] args) {

        // EJERCICIO NUMERO 1
        Lista lista = new Lista();
        Operaciones operacion_nodo = new Operaciones();
        operacion_nodo.insertarNnodos(lista);
        operacion_nodo.mostrarLista(lista);
        operacion_nodo.mayor(lista);
        operacion_nodo.imparesPositivo(lista);


        // EJERCICIO NUMERO 2
        Lista listaString = new Lista();
        OperacionesString operacionString = new OperacionesString();
        operacionString.insertarNnodosString(listaString);
        operacionString.mostrarListaString(listaString);
        operacionString.repeticiones(listaString,"Agua");


        // EJERCICIO NUMERO 3
        Lista listaDouble = new Lista();
        OperacionesDouble operacionesDouble = new OperacionesDouble();
        operacionesDouble.insertarNnodosDouble(listaDouble);
        operacionesDouble.mostrarListaDouble(listaDouble);
        operacionesDouble.mayorNegativo(listaDouble);
        operacionesDouble.menorPositivo(listaDouble);
        operacionesDouble.promedio(listaDouble);

    }
}
