import java.util.scanner;
import Output;

public class Main {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StudentManagerClass manager = new StudentManagerClass();

        String command;

        do{
            command = in.nextLine;
            processCommand(in, manager, command)
        }
        while(command!=Command.EXIT())
    }

    private static void processCommand(Scanner in, StudentManagerClass manager, String command){

        switch (command.ignoreCase()){
            case "help" -> printHelp();
            case "exit" -> System.exit(0);

            default -> System.out.println(Output.UNKNOWN.getMsg());;
        }
    }

    private static void printHelp(){

    }


}
