package ies.tierno.org.models.typefiles;

import ies.tierno.org.models.File;

public class TextFile extends File {

    private String content;

    public TextFile(int size, String path, String content) {
        super(size, path);
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
        openGeneral();
        System.out.println("Texto del archivo:");
        System.out.println(content);
    }
}