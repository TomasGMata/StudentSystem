public enum Command {
    HELP("help - list all commands"),
    EXIT("Bye!"),
    UNKNOWN("Unknown command. Type help to see available commands.");

    String helpMsg;

    Command(String s) {
        helpMsg=s;
    }

    public String getMsg() {
        return helpMsg;
    }
}
