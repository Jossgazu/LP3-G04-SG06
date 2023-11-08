// Fig. 12.15: MarcoBoton.java
// Botones de comando y eventos de acción.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MarcoBoton extends JFrame{
    private final JButton botonJButtonSimple; // botón con texto solamente
    private final JButton botonJButtonElegante; // botón con iconos

    // MarcoBoton agrega objetos JButton a JFrame
    public MarcoBoton(){
        super("Josse Manuel Gallegos Zuñiga && Ricardo Gabriel Manrique Silva");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Boton simple"); // botón con texto
        add(botonJButtonSimple); // agrega botonJButtonSimple a JFrame

        Icon insecto1 = new ImageIcon(getClass().getResource("insecto1.gif"));
        Icon insecto2 = new ImageIcon(getClass().getResource("insecto2.gif"));
        botonJButtonElegante = new JButton("Boton elegante", insecto1); // establece la imagen
        botonJButtonElegante.setRolloverIcon(insecto2); // establece la imagen de sustitución
        add(botonJButtonElegante); // agrega botonJButtonElegante a JFrame

        // crea nuevo ManejadorBoton para manejar los eventos de botón
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }

    // clase interna para manejar eventos de botón
    private class ManejadorBoton implements ActionListener{
        // maneja evento de botón
        @Override
        public void actionPerformed(ActionEvent evento){
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format(
            "Usted oprimio: %s", evento.getActionCommand()));
        }
    }
} // fin de la clase MarcoBoton

