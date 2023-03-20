public class User {
    private String login;
    private String password;
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public class Query {
        public void printToLog() {
            System.out.println("\nUser " + login + " with password " + password + " made request...");
        }
    }
    public void createQuery() {
        Query q = new Query();
        q.printToLog();
    }
}
