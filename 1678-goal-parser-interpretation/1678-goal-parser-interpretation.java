class Solution {
    public String interpret(String command) {
        command=command.replace("()","o");
        command=command.replace("(","");
        command=command.replace(")","");
        return command;
    }
}