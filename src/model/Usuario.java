package model;

public class Usuario {

    private String nombre;
    private String telefono;
    private String correo;

    public Usuario(){}

    public Usuario (String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getCorreo(){
        return correo;
    }

    //Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String mostrarUsuario(){
        return "Nombre usuario: " + nombre +
                "Telefono: " + telefono +
                "Correo: " + correo;

    }
}
