public class main {
    import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();

        int n;

        System.out.println("Ingrese la dimensión del patio:");
        n = sc.nextInt();

        // Crear arreglo de objetos
        ObjVehiculo[] vehiculos = new ObjVehiculo[n];

        // Llamar métodos
        vehiculos = m.LlenarRegistros(vehiculos);
        vehiculos = m.CalcularNuevoPago(vehiculos);
        m.MostrarRegistros(vehiculos);

        sc.close();
    }
}

}
