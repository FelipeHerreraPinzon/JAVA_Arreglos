import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

       // String[] productos = new String[7];

        /*
        productos[0] = "USB";
        productos[1] = "Disco";
        productos[2] = "Teclado";
        productos[3] = "Mouse";
        productos[4] = "Monitor";
        productos[5] = "Tablet";
        productos[6] = "Maleta";
        */

       String[] productos = {
               "USB","Disco","Teclado","Mouse","Monitor","Tablet","Maleta"
       };


        // ordenar alfab.
        Arrays.sort(productos);
        int total = productos.length;
        // for

        System.out.println("usando el for");
      for(int i = 0; i < total; i++) {
          System.out.println("para indice " + i + " "+productos[i] + " valor" + productos[i]);
      }

      // ordenar en inversa
        System.out.println("ordenar en inversa");
        for(int i = 0; i < total; i++) {
            System.out.println("para indice " + (total-1-i) + " " + productos[total-1-i]);
        }


        // ordenar en inversa 2
        System.out.println("ordenar en inversa 2");
        for(int i = total - 1; i>= 0; i--){
            System.out.println("para i = " + i + " valor " + productos[i]);
        }

    }
}
