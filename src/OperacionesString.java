public class OperacionesString {
    public void insertarNnodosString(Lista lista) {
        System.out.println("Numero de Nodos = ");
        int numeroDeNodos = Leer.datoInt();
        String d;
        for(int i = 1; i <= numeroDeNodos; i++) {
            System.out.println(" Dato = ");
            d = Leer.dato();
            lista.insertaString(d);
        }
    }

    public void mostrarListaString(Lista lista)
    {
        Nodo aux = lista.primero;
        while(aux != null){
            System.out.println(aux.datoString + " ");
            aux = aux.siguiente;
        }
    }

    public void repeticiones(Lista lista, String elementoDado) {
        Nodo aux = lista.primero;
        int contador = 0;
        while(aux != null){
            if(aux.datoString.equals(elementoDado)) {
                contador++;
            }
            aux = aux.siguiente;
        }
        System.out.println(" El numero de veces que se repite la palabra"+ elementoDado + " es "+contador);
    }
}
