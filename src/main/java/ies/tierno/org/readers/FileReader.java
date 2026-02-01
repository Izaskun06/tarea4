package org.ies.tierno.readers;

import ies.tierno.org.models.File;
import ies.tierno.org.models.typefiles.TextFile;
import ies.tierno.org.models.typefiles.AudioFile;
import ies.tierno.org.models.typefiles.ImageFile;

import java.util.Random;

public class FileReader implements Reader<File> {

    private final Random rnd;
    private final Reader<AudioFile> audioReader;
    private final Reader<ImageFile> imageReader;
    private final Reader<TextFile> textReader;

    public FileReader(Random rnd,
                      Reader<AudioFile> audioReader,
                      Reader<ImageFile> imageReader,
                      Reader<TextFile> textReader) {
        this.rnd = rnd;
        this.audioReader = audioReader;
        this.imageReader = imageReader;
        this.textReader = textReader;
    }

    @Override
    public File read() {
        int option = rnd.nextInt(3);

        switch (option) {
            case 0:
                return textReader.read();
            case 1:
                return audioReader.read();
            default:
                return imageReader.read();
        }
    }
}