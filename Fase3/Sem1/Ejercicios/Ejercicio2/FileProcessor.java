package wordcount;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileProcessor {
    public static FileStats processFile(File file) {
        int lines = 0, words = 0, chars = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                chars += line.length();
                String[] wordsArray = line.split("\\s+");
                words += wordsArray.length;
            }
            return new FileStats(file.getName(), lines, words, chars);
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        return null;
    }
}