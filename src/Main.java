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
            case "exit" -> System.out.println(Output.EXIT.getMsg());;
            case "bounds" -> processBound(in, manager);
            case "save" -> processSave(manager);
            case "load" -> processLoad(in.nextLine(),manager);

            default -> System.out.println(Output.UNKNOWN.getMsg());;
        }
    }

    private static void printHelp(){

    }

    private static void processBound(Scanner in, StudentManagerClass manager){
        int latTop = in.nextInt();
        int latBottom = in.nextInt();
        int longRigth = in.nextInt();
        int longLeft = in.nextInt();
        String name = in.nextLine();

        if(load(name)!=null){
            System.out.println("Bounds already exists. Please load it!");
        }
        else if(latTop<=latBottom || longRigth<=longLeft ){
            System.out.println("Invalid bounds.");
        }
        else {
            if(manager.getCurrentArea()!=null){
                manager.saveCurrentArea();
            }
            manager.createNewArea(name, latTop, latBottom, longRigth, longLeft);
            System.out.print(name + "created.\n");
        }
    }

    private static void processSave(StudentSystemClass manager){

    }

    private static void processLoad (String areaName, StudentSystemClass manager){
        

    }


}
