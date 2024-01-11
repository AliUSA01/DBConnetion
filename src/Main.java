public class Main {
    public static void main(String[] args) {

        var connection1 = DBConnection.getDbConnection();
        System.out.println(connection1);


        var connection2 = DBConnection.getDbConnection();
        System.out.println(connection2);
    }
}