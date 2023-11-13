package wordcount;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class WordCountGUI extends JFrame {
    private JLabel fileNameLabel, linesLabel, wordsLabel, charsLabel;
    public WordCountGUI() {
        setTitle("WordCount");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        fileNameLabel = new JLabel("File: ");
        linesLabel = new JLabel("Lines = 0");
        wordsLabel = new JLabel("Words = 0");
        charsLabel = new JLabel("Chars = 0");
        JButton browseButton = new JButton("Browse");
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                browseFile();
            }
        });
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(fileNameLabel);
        panel.add(linesLabel);
        panel.add(wordsLabel);
        panel.add(charsLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(browseButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    private void browseFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            processFile(selectedFile);
        }
    }
    private void processFile(File file) {
        FileStats fileStats = FileProcessor.processFile(file);

        if (fileStats != null) {
            updateLabels(fileStats);
        } else {
            JOptionPane.showMessageDialog(this, "Error processing file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void updateLabels(FileStats fileStats) {
        fileNameLabel.setText("File: " + fileStats.getFileName());
        linesLabel.setText("Lines = " + fileStats.getLines());
        wordsLabel.setText("Words = " + fileStats.getWords());
        charsLabel.setText("Chars = " + fileStats.getChars());
    }
}