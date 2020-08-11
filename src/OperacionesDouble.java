public class OperacionesDouble {
    public void insertarNnodosDouble(Lista lista) {
        System.out.println("Numero de Nodos = ");
        int numeroDeNodos = Leer.datoInt();
        double d;
        for(int i = 1; i <= numeroDeNodos; i++) {
            System.out.println(" Dato = ");
            d = Leer.datoDouble();
            lista.insertaDouble(d);
        }
    }

    public void mostrarListaDouble(Lista lista)
    {
        Nodo aux = lista.primero;
        while(aux != null){
            System.out.println(aux.datoDouble + " ");
            aux = aux.siguiente;
        }
    }


    public void mayorNegativo(Lista lista){
        Nodo aux = lista.primero;
        double mayor = aux.datoDouble;
        while (aux != null){
            if((aux.datoDouble > mayor) && (aux.datoDouble < 0.0)){
                mayor = aux.datoDouble;
            }
            aux = aux.siguiente;
        }
        System.out.println("Mayor = " + mayor);
    }

    public void menorPositivo(Lista lista){
        Nodo aux = lista.primero;
        double mayor = aux.datoDouble;
        while (aux != null){
            if((aux.datoDouble < mayor) && (aux.datoDouble > 0.0)){
                mayor = aux.datoDouble;
            }
            aux = aux.siguiente;
        }
        System.out.println("Menor = " + mayor);
    }

    public void promedio(Lista lista){
        Nodo aux = lista.primero;
        double contador = 0;
        double sumatoria = 0;
        while (aux != null){
            sumatoria += aux.datoDouble;
            contador++;
            aux = aux.siguiente;
        }
        System.out.println("Promedio = " + (sumatoria/contador * 2.0));
    }
}
