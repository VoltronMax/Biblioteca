package model;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private boolean disponible;


    public Libro(){}

    public Libro(String titulo, String genero, String isbn, boolean disponible){
        this(titulo, "N/A", genero, isbn, disponible);
    }

    public Libro (String titulo, String autor, String genero, String isbn, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getGenero(){
        return genero;
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean isDisponible(){
        return disponible;
    }


    //Setters

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public String mostrarInfo(){
        return "Titulo: " + titulo +
                "\nAutor: " + autor +
                "\nGenero: " + genero +
                "\nIsbn: " + isbn +
                "\n¿Disponible?: " + (disponible ? "Si" : "No");
        
    }


}
