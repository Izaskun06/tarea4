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

    public abstract void abrir();

    public void mostrarInfo() {
        System.out.println("Tamaño: " + size);
        System.out.println("Ubicación: " + location);
    }

    public void cambiarRuta(String nuevaRuta) {
        if (location.equals(nuevaRuta)) {
            System.out.println("La ruta es la misma, no se ha modificado");
        } else {
            location = nuevaRuta;
            System.out.println("Archivo movido a: " + nuevaRuta);
        }
    }
}