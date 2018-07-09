import java.util.*;

public class __TestDB {
    public static Map map = new HashMap<String, _Command>();

    public static void main(String[] args)
    {
        _DBController.Connect();
        Scanner in = new Scanner(System.in);
        _Parser pars = new _Parser();

        map.put("add",new Add());
        map.put("show",new Show());
        map.put("exit",new Exit());
        map.put("remove",new Remove());
        map.put("delete",new Remove());
        //map.put("update",new Update());

        while(true) {
            System.out.print(">");
            String command = in.nextLine();
            List<String> commands = pars.Parse(command, ' ');
            if (map.containsKey(commands.get(0))) {
                _Command c = (_Command) map.get(commands.get(0));
                if (commands.size() == 1)
                    c.Execute();
                else {
                    commands.remove(0);
                    String[] commArgs = new String[commands.size()];
                    for (int i = 0; i < commands.size(); i++) {
                        commArgs[i] = commands.get(i);
                    }
                    c.Execute(commArgs);
                }
            } else {
                System.out.println("Wrong command.");
            }
        }
    }
}