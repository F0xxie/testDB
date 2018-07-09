import java.sql.*;

public class Show extends _Command {

    @Override
    public void Execute(String[] args) {

        try {
            if(args[0].equals("books")){
                ResultSet rs = _DBController.InquiryWithResult("select * from books");
                System.out.println("Books:");
                System.out.println("Book ID | Title | Author ID | Year");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " + rs.getString("title") + " " + rs.getString("author_id") + " " + rs.getString("year"));
                }
            }
            else if(args[0].equals("authors")){
                ResultSet rs = _DBController.InquiryWithResult("select * from authors");
                System.out.println("Authors:");
                System.out.println("Author ID | FName | LName");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " " + rs.getString("lastname"));
                }
            }
            else if(args[0].equals("all")){
                ResultSet rs = _DBController.InquiryWithResult("select * from authors");
                System.out.println("Authors:");
                System.out.println("Author ID | FName | LName");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " " + rs.getString("lastname"));
                }
                rs = _DBController.InquiryWithResult("select * from books");
                System.out.println("Books:");
                System.out.println("Book ID | Title | Author ID | Year");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " + rs.getString("title") + " " + rs.getString("author_id") + " " + rs.getString("year"));
                }
            }
        } catch (Exception e) {

        }
    }
}