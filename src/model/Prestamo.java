package model;
import  java.time.LocalDate;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionEstimada;
    private boolean devuelto;



public Prestamo(){
}

public Prestamo (Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucionEstimada, boolean devuelto){
    this.libro=libro;
    this.usuario=usuario;
    this.fechaPrestamo=fechaPrestamo;
    this.fechaDevolucionEstimada=fechaDevolucionEstimada;
    this.devuelto=devuelto;
}

//Getters
public Libro getLibro(){
    return libro;
}

public Usuario getUsuario(){
    return usuario;
}

public LocalDate getFechaPrestamo(){
    return fechaPrestamo;
}

public LocalDate getFechaDevolucionEstimada(){
    return fechaDevolucionEstimada;
}

public boolean isDevuelto(){
    return devuelto;

}

public boolean marcarComoDevuelto(){
    devuelto=true;
    return devuelto;

}

    public boolean estaVencido(){
    return LocalDate.now().isAfter(fechaDevolucionEstimada) && !devuelto;

    }

//Setters

    public void setLibro(Libro libro){
    this.libro = libro;
    }

    public void setUsuario(Usuario usuario){
    this.usuario = usuario;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo){
    this.fechaPrestamo  = fechaPrestamo;
    }

    public void setFechaDevolucionEstimada(LocalDate fechaDevolucionEstimada){
    this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public void setDevuelto(boolean devuelto){
    this.devuelto = devuelto;
    }

    public String resumenPrestamo(){
    return "Nombre del libro: " + libro.getTitulo() +
            "\nNombre del usuario: " + usuario.getNombre() +
            "\nFecha del prestamo: " + fechaPrestamo +
            "\nFecha de devolucion: " + fechaDevolucionEstimada +
            "\nEl libro ha sido devuelto?" + (devuelto ? "Si" : "No");
    }
}


