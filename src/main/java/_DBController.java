import java.sql.*;

public class _DBController {

    public static Connection connection;
    public static Statement statement;
    public int idACount;
    public int idBCount;

    public static void Connect()
    {
        try {
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:file:~/test",
                    "sa", "");
            statement = connection.createStatement();
            CreateDB();

        }
        catch (Exception e)
        {
            System.out.println("Can't connect to DB: " + e.toString());
        }

    }

    public static ResultSet InquiryWithResult(String str)
    {
        try {
            ResultSet rs = statement.executeQuery(str);
            return rs;
        }
        catch (Exception e)
        {
            System.out.println("Can't handle inquiry: " + e.toString());
        }
        return  null;
    }

    public static void Inquiry(String str) throws  Exception {

        statement.execute(str);
    }


    public static void CreateDB()
    {
        try { }
        catch (Exception e)
        {
            System.out.println("Can't create DB: " + e.toString());
        }
    }
}