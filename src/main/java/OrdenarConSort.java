import java.util.Arrays;

public class OrdenarConSort {
    public static void main(String[] args) {
        
        String[] productos = new String[7];
        productos[0] = "USB";
        productos[1] = "Disco";
        productos[2] = "Teclado";
        productos[3] = "Mouse";
        productos[4] = "Monitor";
        productos[5] = "Tablet";
        productos[6] = "Maleta";


        System.out.println("productos[0] = " + productos[0]);


        // ordenar
        System.out.println("ordenar alfabeticamente");
        Arrays.sort(productos);

        String producto1 = productos[0];
        System.out.println("producto1 = " + producto1);

        String producto2 = productos[1];
        System.out.println("producto2 = " + producto2);

        String producto3 = productos[2];
        System.out.println("producto3 = " + producto3);


    }
}
