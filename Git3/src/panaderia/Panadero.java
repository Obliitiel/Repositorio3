package panaderia;

import java.util.ArrayList;
import java.util.Collection;

public class Panadero {
    // Variables
    private ArrayList<Pan> alacena = new ArrayList<Pan>();

    // Getters
    public Collection<Pan> getAlacena() {
        return alacena;
    }

    // Setters
    public void setAlacena(ArrayList<Pan> alacena) {
        this.alacena = alacena;
    }

    // Constructor
    public Panadero() {
        alacena.add(new Pan("Baguette", 1.0f));
        alacena.add(new Pan("Barra", 0.50f));
        alacena.add(new Pan("Mohoso", 0.05f));
        alacena.add(new Pan("Cruasan", 0.39f));
        alacena.add(new Pan("Barra", 0.50f));
    }

    public Panadero(int numPanes){
        for (int i = 0; i < numPanes; i++) {
            alacena.add(new Pan());
        }
    }
    
    // Metodos de Panadero//

    // Metodo vendePan: Pide el nombre del pan a comprar y comprueba si existe o no en la alacena
        // String nombre: es el nombre del pan a pedir
    public Pan vendePan(String nombre) throws ExceptionPan {
        // Variables de la funcion
        int contador = 0;
        boolean encontrado = false;
        Pan pan = null;

        if(alacena.size()==0){
            throw new ExceptionPan("No hay nada de pan");
        }

        while (contador < alacena.size() && !encontrado) {
            if (alacena.get(contador) != null && alacena.get(contador).getNombre().equals(nombre)) {
                pan = alacena.get(contador);
                alacena.remove(contador);
                encontrado = true;
            }
            contador++;
        }

        if (!encontrado){
            throw new ExceptionPan("No tengo ese Pan");
        }
        return pan;
    }


    //Metodo mostrarInv: Muestra por consola el numero de panes que hay y una lista de ellos con su precio
    public void mostrarInv(){
        int cont = 1;
        System.out.println("Tengo [" + alacena.size() + "] pan(es) en la alacena");
        for (int i = 0; i < alacena.size(); i++) {
            if (alacena.get(i)!=null) {
                System.out.println(cont + ": " + alacena.get(i).getNombre() + " precio: " + alacena.get(i).getPrecio());
                cont++;
            }
        }
    }
}