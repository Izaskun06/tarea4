package ies.tierno.org.readers;


import ies.tierno.org.models.typefiles.TextFile;

import java.util.Random;


public class TextReader implements Reader<TextFile> {
    private final static String[] PATH = {"/Documents", "/Desktop/Apuntes", "/Documentos/Deberes", "/Desktop/Notas"};
    private final static String[] CONTENT = {"Hola mundo, adios mundo", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ut lacus enim. Sed euismod in ex a sagittis. Phasellus ullamcorper ut urna sit amet venenatis.", "Praesent viverra eros at dolor placerat, vel gravida nulla congue."};
    private final Random random;

    public TextReader(Random random) {
        this.random = random;
    }

    @Override
    public TextFile read() {
        return new TextFile(
                random.nextInt(128),
                PATH[random.nextInt(PATH.length)],
                CONTENT[random.nextInt(CONTENT.length)]
        );
    }
}