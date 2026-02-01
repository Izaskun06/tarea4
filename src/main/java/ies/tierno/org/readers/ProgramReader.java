package ies.tierno. org.readers;

import ies.tierno.org.models.File;
import ies.tierno.org.models.Program;
import ies.tierno.org.models.typefiles.TextFile;

import java.util.Random;

public class ProgramReader<T extends File> implements Reader<Program<TextFile>> {

    private static final String[] PROGRAM_NAMES = {
            "Audacity", "Word", "Krita", "Photoshop",
            "MuseHub", "CakeWalk", "Google Chrome"
    };

    private final Random rng;
    private final Reader<TextFile> textFileReader;

    public ProgramReader(Random rng, Reader<TextFile> textFileReader) {
        this.rng = rng;
        this.textFileReader = textFileReader;
    }

    @Override
    public Program<TextFile> read() {
        int totalFiles = rng.nextInt(2, 10);
        TextFile[] textFiles = new TextFile[totalFiles];

        for (int i = 0; i < totalFiles; i++) {
            textFiles[i] = textFileReader.read();
        }

        String programName = PROGRAM_NAMES[rng.nextInt(PROGRAM_NAMES.length)];
        return new Program<>(programName, textFiles);
    }
}