package ies.tierno.org.models;

import java.util.Arrays;
import java.util.Objects;

public class Program<T extends File> {

    private String title;
    private T[] fileList;

    public Program(String title, T[] fileList) {
        this.title = title;
        this.fileList = fileList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public T[] getFileList() {
        return fileList;
    }

    public void setFileList(T[] fileList) {
        this.fileList = fileList;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Program<?> other)) return false;
        return Objects.equals(title, other.title)
                && Arrays.deepEquals(fileList, other.fileList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, Arrays.deepHashCode(fileList));
    }

    public void run(String destinationPath) {
        System.out.println("Aplicación: " + title);
        System.out.println("Lista de archivos:");

        for (T f : fileList) {
            f.open();
            f.move(destinationPath);
        }
    }
}