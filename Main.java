public class Main {
    public static void main(String[] args) {


        BaseDatabaseManager db = new MssqlDatabaseManager();//configuration
        CustomerManager customerManager=new CustomerManager(db);

        customerManager.getCustomer();

    }
}