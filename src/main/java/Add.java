public class Add extends _Command {

    @Override
    public void Execute(String[] args) {

        if(args[0].equals("author") && args.length==3) {

            try {
                _DBController.Inquiry("INSERT INTO authors (name,lastname) VALUES (\'" + args[1] + "\',\'" + args[2] + "\')");
                System.out.println("Added.");
            }
            catch (Exception e)
            {
                System.out.println("Can't add to " + e.toString());
            }
        }
        else if(args[0].equals("book") && args.length==4)
        {
            try {
                _DBController.Inquiry("INSERT INTO books (title,author_id,year) VALUES (\'" + args[1] + "\',\'" + args[2] + "\',\'" + args[3] +"\')");
                System.out.println("Added.");
            }
            catch (Exception e)
            {
                System.out.println("Can't add to " + e.toString());
            }
        }
    }
}