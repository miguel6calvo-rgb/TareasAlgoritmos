public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] topes = {10, 100, 1000, 10000, 100000, 1000000};


        for(int tope : topes) {

            int[] info = new int [tope];
            for(int i = 0; i< tope; i++) {
                info[i] = (i + 1) * 5;
            }

            int buscado = tope * 5;
            
            int izq = 0;
            int der = info.length - 1;
            boolean encontrado = false;

            while (izq <= der) {
                int medio = izq + (der - izq) /2;

                if (info[medio] == buscado) {
                    System.out.println("Con n =" + tope + " el dato " + buscado + " se encontro en la posición " + medio);
                    encontrado = true;
                    break;
                }

                if (info[medio] < buscado) {
                    izq = medio + 1;
                } else {
                    der = medio - 1;
                }
            }

            if(!encontrado) {
                System.out.println(" Con n =" + tope + "no existe en la lista");
            }
        }
    }
}
