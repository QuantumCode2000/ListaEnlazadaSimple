public class Lista {
    // Campos
    Nodo primero;
    //Constructor por defecto
    Lista(){
        primero = null;
    }
    // Inicializar
    public void inicializar() {
        primero = null;
    }
    //Verificar si la lista esta vacia
    //Retornafalse o true

    public boolean listaVacia(){
        return primero == null;
    }



    // Insertar al principio de la lista
    public void insertar(int x) {
        // Crear el nuevo Nodo
        Nodo nuevoNodo = new Nodo(x);
        //Conectar el nuevo nodo a la lista
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }
    public void insertaString(String x) {
        // Crear el nuevo Nodo
        Nodo nuevoNodo = new Nodo(x);
        //Conectar el nuevo nodo a la lista
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }

    public void insertaDouble(double x) {
        // Crear el nuevo Nodo
        Nodo nuevoNodo = new Nodo(x);
        //Conectar el nuevo nodo a la lista
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }

    // Eliminar al principio de la Lista
    public void eliminar(){
        if(!listaVacia()) {
            //Lista No vacia
            primero = primero.siguiente;
        }
    }
    // Mostrar Lista

}
