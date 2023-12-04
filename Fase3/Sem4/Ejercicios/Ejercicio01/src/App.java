import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class App extends JFrame {

    private JTextField sqlField, filterField;
    private JButton executeButton;
    private JTable resultTable;
    private JScrollPane tableScrollPane;
    private Connection connection;
    public App() {
        setTitle("Displaying Query Results");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel topPanel = new JPanel(new GridLayout(3, 2));
        JLabel sqlLabel = new JLabel("SQL Statement:");
        sqlField = new JTextField();
        JLabel filterLabel = new JLabel("Filter (WHERE clause):");
        filterField = new JTextField();
        executeButton = new JButton("Execute");
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeSQL();
            }
        });
        topPanel.add(sqlLabel);
        topPanel.add(sqlField);
        topPanel.add(filterLabel);
        topPanel.add(filterField);
        topPanel.add(new JLabel());
        topPanel.add(executeButton);
        add(topPanel, BorderLayout.NORTH);
        resultTable = new JTable();
        tableScrollPane = new JScrollPane(resultTable);
        add(tableScrollPane, BorderLayout.CENTER);
        connectToDatabase();
    }

    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/ejercicio01";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void executeSQL() {
        String sqlStatement = sqlField.getText();
        String filter = filterField.getText();

        try {
            Statement statement = connection.createStatement();

            if (!filter.isEmpty()) {
                sqlStatement += " WHERE " + filter;
            }

            ResultSet resultSet = statement.executeQuery(sqlStatement);
            resultTable.setModel(buildTableModel(resultSet));

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
        }
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (rs.next()) {
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = rs.getObject(i);
            }
            model.addRow(rowData);
        }
        return model;
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