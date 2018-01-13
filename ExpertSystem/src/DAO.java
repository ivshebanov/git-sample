import java.sql.*;

public class DAO {
    private Connection connection;
    private final String SQLQ1L1 = "Select qusetion From qusetion WHERE level = '1' AND num_qusetion = '1';";
    private final String SQLQ1L2 = "Select qusetion From qusetion WHERE level = '2' AND num_qusetion = '1';";
    private final String SQLQ2L2 = "Select qusetion From qusetion WHERE level = '2' AND num_qusetion = '2';";
    private final String SQLQ1L3 = "Select qusetion From qusetion WHERE level = '3' AND num_qusetion = '1';";
    private final String SQLQ2L3 = "Select qusetion From qusetion WHERE level = '3' AND num_qusetion = '2';";
    private final String SQLQ1L4 = "Select qusetion From qusetion WHERE level = '4' AND num_qusetion = '1';";
    private final String SQLQ1L5 = "Select qusetion From qusetion WHERE level = '5' AND num_qusetion = '1';";
    private final String SQLQ2L5 = "Select qusetion From qusetion WHERE level = '5' AND num_qusetion = '2';";
    private final String SQLQ1L6 = "Select qusetion From qusetion WHERE level = '6' AND num_qusetion = '1';";
    private final String SQLQ2L6 = "Select qusetion From qusetion WHERE level = '6' AND num_qusetion = '2';";

    public DAO() {
        this.connection = connection();
    }

    private Connection connection() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/expertsystem", "postgres", "12345");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    private String executeTheQuery(String sql) {
        String result = "";
        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)
        ) {
            while (rs.next()) {
                result = rs.getString("qusetion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String question1level() {
        return executeTheQuery(SQLQ1L1);
    }

    public String question1level2() {
        return executeTheQuery(SQLQ1L2);
    }

    public String question2level2() {
        return executeTheQuery(SQLQ2L2);
    }

    public String question1level3() {
        return executeTheQuery(SQLQ1L3);
    }

    public String question2level3() {
        return executeTheQuery(SQLQ2L3);
    }

    public String question1level4() {
        return executeTheQuery(SQLQ1L4);
    }

    public String question1level5() {
        return executeTheQuery(SQLQ1L5);
    }

    public String question2level5() {
        return executeTheQuery(SQLQ2L5);
    }

    public String question1level6() {
        return executeTheQuery(SQLQ1L6);
    }

    public String question2level6() {
        return executeTheQuery(SQLQ2L6);
    }
}
