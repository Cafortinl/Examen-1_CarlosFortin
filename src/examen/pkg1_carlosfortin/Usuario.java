package examen.pkg1_carlosfortin;

import java.util.Date;

/**
 *
 * @author Carlos Fortin
 */
public class Usuario extends Persona{

    public Usuario() {
        super();
    }

    public Usuario(String nombre, String password, Date nacimiento, String telefono, String correo, String favGen) {
        super(nombre, password, nacimiento, telefono, correo, favGen);
    }

    @Override
    public String toString() {
        return "Usuario{" +super.toString()+ '}';
    }
    
    
    
}
