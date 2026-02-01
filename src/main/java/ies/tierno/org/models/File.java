package ies.tierno.org.models;

import java.util.Objects;

public abstract class File {
    private int size;
    private String location;

    public File(int size, String location) {
        this.size = size;
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        File archivo = (File) obj;
        return size == archivo.size && Objects.equals(location, archivo.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, location);
    }

    // Método abstracto que deben implementar las subclases
    public abstract void open();

    // Método común para mostrar información básica
    public void mostrarInfo() {
        System.out.println("Tamaño: " + size);
        System.out.println("Ubicación: " + location);
    }

    // Método común que pueden usar las subclases
    public void openGeneral() {
        System.out.println("Archivo ubicado en: " + location);
        System.out.println("Tamaño: " + size + " KB");
    }

    // Método para cambiar ruta (antes llamado cambiarRuta)
    public void move(String newPath) {
        if (location.equals(newPath)) {
            System.out.println("La ruta es la misma, no se ha modificado");
        } else {
            location = newPath;
            System.out.println("Archivo movido a: " + newPath);
        }
    }
}