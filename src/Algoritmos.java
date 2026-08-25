public class Algoritmos {
    public static void main(String[] args) throws Exception {

       Nodo head = new Nodo(20);
       
       
       Nodo nodo23 = new Nodo(23);
       Nodo nodo19 = new Nodo(19);
       Nodo nodo57 = new Nodo(57);
       Nodo nodo67 = new Nodo(67);
       Nodo nodo99 = new Nodo(99);

       head.hijo1 = nodo23;
       head.hijo2 = nodo19;

       nodo23.hijo2 = nodo57;

       nodo19.hijo3 = nodo67;

       nodo67.hijo2 = nodo99;


       System.out.println("Nodo 57: " + head.hijo1.hijo2.dato);
       System.out.println("Nodo 99: " + head.hijo2.hijo3.hijo2.dato);

    }
}

class Nodo {
            int dato;
            Nodo hijo1; 
            Nodo hijo2;
            Nodo hijo3;

            public Nodo(int valor) {
                this.dato = valor;
                this.hijo1 = null;
                this.hijo2 = null;
                this.hijo3 = null;
            }

        }
