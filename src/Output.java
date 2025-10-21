public enum Command {
    HELP("help - list all commands"),
    EXIT("exit - exit the program"),
    UNKNOWN("Unknown command. Type help to see available commands.");

    String helpMsg;

    Command(String s) {
        helpMsg=s;
    }

    public String getMsg() {
        return helpMsg;
    }
}
