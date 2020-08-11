public class Operaciones {
    //Insertar N nodos
    public void insertarNnodos(Lista lista){ // lista es un objeto de la clase lista //se recibe la direccion de memoria
        System.out.println("Numero de Nodos = ");
        int numeroDeNodos = Leer.datoInt();
        int d;
        for(int i = 1; i <= numeroDeNodos; i++) {
            System.out.println(" Dato = ");
            d = Leer.datoInt();
            lista.insertar(d);
        }
    }
    //Mostrar lista
    public void mostrarLista(Lista lista)
    {
        Nodo aux = lista.primero;
        while(aux != null){
            System.out.println(aux.dato + " ");
            aux = aux.siguiente;
        }
    }

    // Mayor
    public void mayor(Lista lista){
        Nodo aux = lista.primero;
        int mayor = aux.dato;
        while (aux != null){
            if(aux.dato > mayor){
                mayor = aux.dato;
            }
            aux = aux.siguiente;
        }
        System.out.println("Mayor = " + mayor);
    }

    // Mostrar los datos impares positivos
    public void imparesPositivo(Lista lista) {
        Nodo aux = lista.primero;
        while(aux != null){
            if((aux.dato > 0) && (aux.dato % 2 != 0)){
                System.out.println(aux.dato + " , ");
            }
            aux = aux.siguiente;
        }
    }
    // Contar pares negativos
    public void contarParesNegativos(Lista lista) {
        Nodo aux = lista.primero;
        int contador = 0;
        while(aux != null){
            if((aux.dato < 0) && (aux.dato % 2 == 0)){
                contador++;
            }
            aux = aux.siguiente;
        }
        System.out.println("Cantidad de Pares Negativos = --> " + contador + " <-- " );
    }
}
