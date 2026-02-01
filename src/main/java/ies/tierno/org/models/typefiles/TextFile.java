package ies.tierno.org.models.typefiles;

import ies.tierno.org.models.File;

public class TextFile extends File {

    private String content;

    // Constructor corregido
    public TextFile(int size, String location, String content) {
        super(size, location);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void open() {
        System.out.println("Abriendo archivo de tipo texto");
        super.openGeneral();
        System.out.println("Texto del archivo:");
        System.out.println(content);
    }
}