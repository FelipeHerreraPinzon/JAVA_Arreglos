import java.sql.SQLOutput;
import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "USB";
        productos[1] = "Disco";
        productos[2] = "Teclado";
        productos[3] = "Mouse";
        productos[4] = "Monitor";
        productos[5] = "Tablet";
        productos[6] = "Maleta";

        int total = productos.length;;

        // ordenar alfab.
        Arrays.sort(productos);

        // for
        System.out.println("usando el for");
      for(int i = 0; i < total; i++) {
          System.out.println("para indice " + i + " "+productos[i]);

      }

      // for each
      System.out.println("usando el foreach");
      for(String prod: productos){
          System.out.println("prod = " + prod);
      }

        // while
        System.out.println("usando el while");
        int i =0;
        while(i < total){
            System.out.println("para indice " + i + " "+productos[i]);
            i++;
        }

        //do while
        System.out.println("usando el do while");
        int j =0;
        do{
            System.out.println("para indice " + j + " "+productos[j]);
            j++;
        }while(j < total);

        //////// otro ejemplo

        int[] numeros = new  int[10];
        int totalNumeros = numeros.length;
        for(int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;
        }

        for(int k = 0; k < totalNumeros; k++){
            System.out.println("numeros[k] = " + numeros[k]);
        }


    }
}
