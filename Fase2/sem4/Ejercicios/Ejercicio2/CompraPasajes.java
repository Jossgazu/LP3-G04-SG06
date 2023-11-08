package ejercicio02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
public class CompraPasajes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Compra de Pasajes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JLabel nombreLabel = new JLabel("Nombre:");
        JLabel documentoLabel = new JLabel("Documento de Identidad:");
        JLabel fechaLabel = new JLabel("Fecha de Viaje:");
        JTextField nombreField = new JTextField(20);
        JTextField documentoField = new JTextField(10);
        JTextField fechaField = new JTextField(10);
        JCheckBox audifonosCheckbox = new JCheckBox("Audifonos");
        JCheckBox mantaCheckbox = new JCheckBox("Manta");
        JCheckBox revistasCheckbox = new JCheckBox("Revistas");
        JRadioButton primerPisoRadioButton = new JRadioButton("1er Piso");
        JRadioButton segundoPisoRadioButton = new JRadioButton("2do Piso");
        ButtonGroup pisoGroup = new ButtonGroup();
        pisoGroup.add(primerPisoRadioButton);
        pisoGroup.add(segundoPisoRadioButton);
        String[] lugares = {"Origen A", "Origen B", "Origen C"};
        JComboBox<String> origenComboBox = new JComboBox<>(lugares);
        JComboBox<String> destinoComboBox = new JComboBox<>(lugares);
        String[] servicios = {"Económico", "Standard", "VIP"};
        JList<String> servicioList = new JList<>(servicios);
        JButton resumenButton = new JButton("Mostrar Resumen");
        resumenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String documento = documentoField.getText();
                String fecha = fechaField.getText();
                String audifonos = audifonosCheckbox.isSelected() ? "Sí" : "No";
                String manta = mantaCheckbox.isSelected() ? "Sí" : "No";
                String revistas = revistasCheckbox.isSelected() ? "Sí" : "No";
                String piso = primerPisoRadioButton.isSelected() ? "1er Piso" : "2do Piso";
                String origen = origenComboBox.getSelectedItem().toString();
                String destino = destinoComboBox.getSelectedItem().toString();
                String servicio = Arrays.toString(servicioList.getSelectedValues());
                String resumen = "Resumen de la Compra de Pasajes:\n\n" +
                        "Nombre: " + nombre + "\n" +
                        "Documento de Identidad: " + documento + "\n" +
                        "Fecha de Viaje: " + fecha + "\n" +
                        "Audifonos: " + audifonos + "\n" +
                        "Manta: " + manta + "\n" +
                        "Revistas: " + revistas + "\n" +
                        "Piso: " + piso + "\n" +
                        "Origen: " + origen + "\n" +
                        "Destino: " + destino + "\n" +
                        "Servicio: " + servicio;
                JOptionPane.showMessageDialog(frame, resumen);
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 2, 5, 5));
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(documentoLabel);
        panel.add(documentoField);
        panel.add(fechaLabel);
        panel.add(fechaField);
        panel.add(audifonosCheckbox);
        panel.add(mantaCheckbox);
        panel.add(revistasCheckbox);
        panel.add(primerPisoRadioButton);
        panel.add(segundoPisoRadioButton);
        panel.add(new JLabel("Origen:"));
        panel.add(origenComboBox);
        panel.add(new JLabel("Destino:"));
        panel.add(destinoComboBox);
        panel.add(new JLabel("Servicio:"));
        panel.add(servicioList);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(resumenButton);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}