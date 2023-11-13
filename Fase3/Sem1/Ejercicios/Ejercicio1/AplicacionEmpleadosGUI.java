package aplicacionempleados;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class AplicacionEmpleadosGUI extends JFrame {
    private static final String NOMBRE_ARCHIVO = "empleados.dat";
    private List<Empleado> empleados;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField txtNumero, txtNombre, txtSueldo;
    public AplicacionEmpleadosGUI() {
        empleados = new ArrayList<>();
        cargarEmpleadosDesdeArchivo();
        setTitle("Aplicacion Empleados");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new BorderLayout());
        tableModel = new DefaultTableModel(new Object[]{"Número", "Nombre", "Sueldo"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel inputPanel = new JPanel(new GridLayout(1, 6));
        inputPanel.add(new JLabel("Número:"));
        txtNumero = new JTextField();
        inputPanel.add(txtNumero);
        inputPanel.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        inputPanel.add(txtNombre);
        inputPanel.add(new JLabel("Sueldo:"));
        txtSueldo = new JTextField();
        inputPanel.add(txtSueldo);
        panel.add(inputPanel, BorderLayout.SOUTH);
        JButton btnAgregar = new JButton("Agregar Empleado");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });
        panel.add(btnAgregar, BorderLayout.NORTH);

        add(panel);

        actualizarTabla();
    }
    private void cargarEmpleadosDesdeArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            empleados = (List<Empleado>) ois.readObject();
        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void guardarEmpleadosEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void agregarEmpleado() {
        try {
            int numero = Integer.parseInt(txtNumero.getText());
            String nombre = txtNombre.getText();
            double sueldo = Double.parseDouble(txtSueldo.getText());

            Empleado nuevoEmpleado = new Empleado(numero, nombre, sueldo);
            empleados.add(nuevoEmpleado);

            actualizarTabla();
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos para Número y Sueldo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void actualizarTabla() {
        tableModel.setRowCount(0);

        for (Empleado empleado : empleados) {
            tableModel.addRow(new Object[]{empleado.getNumero(), empleado.getNombre(), empleado.getSueldo()});
        }

        guardarEmpleadosEnArchivo();
    }
    private void limpiarCampos() {
        txtNumero.setText("");
        txtNombre.setText("");
        txtSueldo.setText("");
    }
}