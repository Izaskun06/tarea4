package ies.tierno.org.readers;

import ies.tierno.org.models.typefiles.AudioFile;

import java.util.Random;

public class AudioFileReader implements Reader<AudioFile> {

    private static final String[] DIRECTORIES = {
            "/Music",
            "/Desktop/Audio/WhatsApp",
            "/Desktop/Audio/Edits",
            "/Music/Albums"
    };

    private static final String[] DURATIONS = {
            "9:30", "2:03", "4:50", "1:00:43", "0:20", "4:09"
    };

    private final Random rng;

    public AudioFileReader(Random rng) {
        this.rng = rng;
    }

    @Override
    public AudioFile read() {
        int size = rng.nextInt(128);
        String directory = DIRECTORIES[rng.nextInt(DIRECTORIES.length)];
        String duration = DURATIONS[rng.nextInt(DURATIONS.length)];

        return new AudioFile(size, directory, duration);
    }
}