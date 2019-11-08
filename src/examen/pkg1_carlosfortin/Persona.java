package examen.pkg1_carlosfortin;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Fortin
 */
public class Persona {
    
    private String nombre;
    private String password;
    private Date nacimiento;
    private String telefono;
    private String correo;
    private String favGen;
    private ArrayList<Libro> libros=new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, String password, Date nacimiento, String telefono, String correo, String favGen) {
        this.nombre = nombre;
        this.password = password;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.favGen = favGen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFavGen() {
        return favGen;
    }

    public void setFavGen(String favGen) {
        this.favGen = favGen;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public Libro getLibro(int pos){
        return libros.get(pos);
    }
    
    public void setLibro(Libro libro){
        this.libros.add(libro);
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+" Telefono: "+this.telefono+" Correo: "+this.correo;
    }
    
}