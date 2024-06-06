public class EjemploArreglos {
    public static void main(String[] args) {
        // declarar arreglo
        int[] numeros;
        int[] numeros_2 = new int[3];


        // declarar con tipo primitivo
        //  Producto[] productos = new Producto[3];
        String[] nombres = new String[5];

        // posiciones
        numeros_2[0] = 1;
        numeros_2[1] = 2;
        numeros_2[2] = 3;

        // productos[0] = new Producto("mesa comedor");
        // productos[1] = new Producto("tv sony LED");
        // productos[2] = new Producto("Bicicleta oxford");

        // instanciarlo directamente
        int[] numeros_directo = {1,2,3};

        String[] nombres_test = {"Andres", "Maria", "Jose", "Isabel", "Juan"};

        for(int i =0; i< nombres_test.length; i++){
            System.out.println("nombre " + i + "=" + nombres_test[i]);
        }

        System.out.println();
        System.out.println("usando for each");
        System.out.println();
        for(String nom:nombres_test){
            System.out.println("nombre = " + nom);
        }
    }
}
