package panaderia;

public class Camion {

    public void suministarPan(Panadero panadero, int numeroPanes){
        for (int i = 0; i < numeroPanes; i++) {
            panadero.getAlacena().add(new Pan());
        }
    }

    public void suministarPan(Panadero panadero){
        panadero.getAlacena().add(new Pan("Baguette", 1.0f));
        panadero.getAlacena().add(new Pan("Barra", 0.50f));
        panadero.getAlacena().add(new Pan("Mohoso", 0.05f));
        panadero.getAlacena().add(new Pan("Cruasan", 0.39f));
        panadero.getAlacena().add(new Pan("Barra", 0.50f));
    }
}
