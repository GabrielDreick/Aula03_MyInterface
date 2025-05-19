package databasess;

import java.util.ArrayList;

public class Databasess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        list<Aluno> lista = new ArrayList<>();
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection c1 = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/escola",
            "escola", "escola");
        Statement st = c1.createStatement();
        ResultSet r1 = st.executeQuery("SELECT * FROM ALUNO");
        while (r1.next())
            lista.add(new Aluno(
        r1.getString("MATRICULA"),
            r1.getString("NOME"),
             r1.getInt("ENTRADA")));
        r1.close();
        st.close();
        c1.close();
    }
    
}
