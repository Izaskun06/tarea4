package ies.tierno.org.models.typefiles;

import ies.tierno.org.models.File;
import java.util.Objects;

public class AudioFile extends File {

    private String duration;

    public AudioFile(int fileSize, String location, String duration) {
        super(fileSize, location);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        AudioFile other = (AudioFile) obj;
        return Objects.equals(duration, other.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration);
    }

    @Override
    public void open() {
        System.out.println("Archivo de tipo audio");
        super.openGeneral();
        System.out.println("Duración: " + duration);
    }
}