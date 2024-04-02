package panaderia;

public class Panaderia {
    public static void main(String[] args) {
        Panadero panadero = new Panadero(1);
        Camion camion = new Camion();

        camion.suministarPan(panadero, 5);

        for (int i = 0; i < 6; i++) {
            panadero.mostrarInv();
            try {
                panadero.vendePan("Barra");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Cambio");
        System.out.println("Cambio 2")
    }
}
