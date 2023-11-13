package wordcount;
public class FileStats {
    private String fileName;
    private int lines;
    private int words;
    private int chars;
    public FileStats(String fileName, int lines, int words, int chars) {
        this.fileName = fileName;
        this.lines = lines;
        this.words = words;
        this.chars = chars;
    }
    public String getFileName() {
        return fileName;
    }
    public int getLines() {
        return lines;
    }
    public int getWords() {
        return words;
    }
    public int getChars() {
        return chars;
    }
}