package ies.tierno.org;

import ies.tierno.org.models.Program;
import ies.tierno.org.models.typefiles.TextFile;
import ies.tierno.org.readers.ProgramReader;
import ies.tierno.org.readers.TextReader;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        TextReader textReader = new TextReader(random);

        ProgramReader<TextFile> programReader = new ProgramReader<>(random, textReader);

        Program<TextFile> program = programReader.read();

        System.out.println("Introduce nuevo path: ");
        String outputPath = scanner.nextLine();

        program.run(outputPath);
    }
}