import javax.swing.JTextArea;
import javax.swing.JFrame;

public class ViewFile extends JFrame{
    private JTextArea areaTexto;

    public ViewFile(String s) {
        super("Mostrando Contenido de un archivo");
        areaTexto = new JTextArea(s,5,40);
        add(areaTexto);
    }
}
