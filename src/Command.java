public enum Command {
    HELP("help - list all commands"),
    EXIT("exit - exit the program"),
    UNKNOWN("");

    String helpMsg;

    Command(String s) {
        helpMsg=s;
    }

    public String getMsg() {
        return helpMsg;
    }
}
