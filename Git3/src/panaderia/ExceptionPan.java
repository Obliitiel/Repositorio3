package panaderia;

public class ExceptionPan extends Exception{
    public ExceptionPan(){
        super("Mensaje por defecto");
    }
    public ExceptionPan(String mensaje){
        super(mensaje);
    }
    public ExceptionPan(String mensaje, Exception causa){
        super(mensaje, causa);
    }
}
