public class Remove extends _Command {

    @Override
    public void Execute(String[] args) {
        if(args[0].equals("author") && args.length==2) {
            try {
                _DBController.Inquiry("DELETE FROM authors\n" +
                        "WHERE id="+args[1]+";");
                System.out.println("Author deleted.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(args[0].equals("book") && args.length==2) {
            try {
                _DBController.Inquiry("DELETE FROM books\n" +
                        "WHERE id="+args[1]+";");
                System.out.println("Book deleted.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}