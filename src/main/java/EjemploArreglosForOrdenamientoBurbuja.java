import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo){
        System.out.println("usando el for");
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

       String[] productos = {
               "USB","Disco","Teclado","Mouse","Monitor","Tablet","Maleta"
       };
        int total = productos.length;

        int contador = 0;

        for(int i = 0; i<total; i++){
            for(int j = 0; j<total; j++){
                if(productos[i].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

     //   Arrays.sort(productos);
     //   arregloInverso(productos);
     //   Collections.reverse(Arrays.asList(productos));


      for(int i = 0; i < total; i++) {
          System.out.println("para indice " + i + " "+productos[i] + " valor" + productos[i]);
      }


    }
}
