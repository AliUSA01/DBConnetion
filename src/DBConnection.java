public class DBConnection {

    private static DBConnection dbConnection;





    public static DBConnection getDbConnection(){
        if(dbConnection == null) dbConnection = new DBConnection();
        return dbConnection;
    }


    private DBConnection(){

    }















}
