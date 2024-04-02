package panaderia;

public class ExceptionPan extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
