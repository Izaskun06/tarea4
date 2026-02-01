package ies.tierno.org.readers;

import ies.tierno.org.models.typefiles.ImageFile;
import java.util.Random;

public class ImageReader implements Reader<ImageFile> {

    private static final String[] IMAGE_PATHS = {
            "/Image",
            "/Desktop/Imagenes/Tarea",
            "/Desktop/Imagenes/Dibujos",
            "/Image/CapturasDePantalla"
    };

    private Random rng;

    public ImageReader(Random rng) {
        this.rng = rng;
    }

    @Override
    public ImageFile read() {
        int size = rng.nextInt(128);
        String location = IMAGE_PATHS[rng.nextInt(IMAGE_PATHS.length)];
        int width = rng.nextInt(100000);
        int height = rng.nextInt(100000);

        return new ImageFile(size, location, width, height);
    }
}