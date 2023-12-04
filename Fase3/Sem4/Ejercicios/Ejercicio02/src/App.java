import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class App extends JFrame {
    private JTextField idField, firstNameField, lastNameField, emailField, phoneField, findField;
    private JButton previousButton, nextButton, findButton, browseButton, insertButton;
    private Connection connection;
    private ResultSet resultSet;
    private int currentRow = 0;
    private int totalRows = 0;
    public App() {
        setTitle("Address Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        previousButton = new JButton("Previous");
        JTextField currentIndex = new JTextField(5);
        currentIndex.setEditable(false);
        currentIndex.setHorizontalAlignment(JTextField.CENTER);
        JTextField totalRecords = new JTextField(5);
        totalRecords.setEditable(false);
        totalRecords.setHorizontalAlignment(JTextField.CENTER);
        nextButton = new JButton("Next");
        topPanel.add(previousButton);
        topPanel.add(new JLabel("   "));
        topPanel.add(currentIndex);
        topPanel.add(new JLabel(" of "));
        topPanel.add(totalRecords);
        topPanel.add(new JLabel("   "));
        topPanel.add(nextButton);
        add(topPanel, BorderLayout.NORTH);
        JPanel centerPanel = new JPanel(new GridLayout(5, 2));
        idField = new JTextField(10);
        idField.setEditable(true);
        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);
        centerPanel.add(new JLabel("Address ID:"));
        centerPanel.add(idField);
        centerPanel.add(new JLabel("First Name:"));
        centerPanel.add(firstNameField);
        centerPanel.add(new JLabel("Last Name:"));
        centerPanel.add(lastNameField);
        centerPanel.add(new JLabel("Email:"));
        centerPanel.add(emailField);
        centerPanel.add(new JLabel("Phone Number:"));
        centerPanel.add(phoneField);
        add(centerPanel, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        findField = new JTextField(15);
        findButton = new JButton("Find");
        browseButton = new JButton("Browse All Entries");
        insertButton = new JButton("Insert New Entry");
        bottomPanel.add(new JLabel("Find an entry by last name:"));
        bottomPanel.add(findField);
        bottomPanel.add(findButton);
        bottomPanel.add(browseButton);
        bottomPanel.add(insertButton);
        add(bottomPanel, BorderLayout.SOUTH);
        idField.setEditable(true); 
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    resultSet.beforeFirst();
                    currentRow = 0;
                    if (resultSet.next()) {
                        bindDataToFields();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        connectToDatabase();
        loadFirstRecord();
        bindDataToFields();
        setupListeners();
    }
    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/ejercicio02";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = statement.executeQuery("SELECT * FROM Agenda");
            resultSet.last();
            totalRows = resultSet.getRow();
            resultSet.beforeFirst();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void loadFirstRecord() {
        try {
            if (resultSet.next()) {
                currentRow++;
                bindDataToFields();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void bindDataToFields() {
        try {
            idField.setText(resultSet.getString("ID"));
            firstNameField.setText(resultSet.getString("Nombre"));
            lastNameField.setText(resultSet.getString("Apellido"));
            emailField.setText(resultSet.getString("Email"));
            phoneField.setText(resultSet.getString("Teléfono"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void setupListeners() {
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (resultSet.previous()) {
                        currentRow--;
                        bindDataToFields();
                    } else {
                        resultSet.first();
                        currentRow = 1;
                        bindDataToFields();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (resultSet.next()) {
                        currentRow++;
                        bindDataToFields();
                    } else {
                        resultSet.last();
                        currentRow = totalRows;
                        bindDataToFields();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String newFirstName = firstNameField.getText();
                    String newLastName = lastNameField.getText();
                    String newEmail = emailField.getText();
                    String newPhone = phoneField.getText();

                    PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO Agenda (Nombre, Apellido, Email, Teléfono) VALUES (?, ?, ?, ?)");
                    insertStatement.setString(1, newFirstName);
                    insertStatement.setString(2, newLastName);
                    insertStatement.setString(3, newEmail);
                    insertStatement.setString(4, newPhone);
                    int rowsAffected = insertStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Registro insertado exitosamente.");
                        loadFirstRecord();
                        bindDataToFields();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar el registro.");
                    }
                    insertStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String lastNameToFind = findField.getText();
                    PreparedStatement findStatement = connection.prepareStatement("SELECT * FROM Agenda WHERE Apellido = ?");
                    findStatement.setString(1, lastNameToFind);
                    ResultSet findResultSet = findStatement.executeQuery();
                    if (findResultSet.next()) {
                        idField.setText(findResultSet.getString("ID"));
                        firstNameField.setText(findResultSet.getString("Nombre"));
                        lastNameField.setText(findResultSet.getString("Apellido"));
                        emailField.setText(findResultSet.getString("Email"));
                        phoneField.setText(findResultSet.getString("Teléfono"));
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron registros con ese apellido.");
                    }
                    findResultSet.close();
                    findStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
}