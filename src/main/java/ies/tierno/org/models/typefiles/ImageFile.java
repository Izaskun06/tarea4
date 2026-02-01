package ies.tierno.org.models.typefiles;

import ies.tierno.org.models.File;
import java.util.Objects;

public class ImageFile extends File {

    private int imageWidth;
    private int imageHeight;

    public ImageFile(int fileSize, String location, int imageWidth, int imageHeight) {
        super(fileSize, location);
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ImageFile)) return false;
        if (!super.equals(obj)) return false;
        ImageFile other = (ImageFile) obj;
        return imageWidth == other.imageWidth &&
                imageHeight == other.imageHeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), imageWidth, imageHeight);
    }

    @Override
    public void open() {
        System.out.println("Archivo de imagen");
        super.openGeneral();
        System.out.println("Resolución:");
        System.out.println(imageWidth + " x " + imageHeight);
    }
}