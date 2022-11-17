public class CustomerManager {
BaseDatabaseManager dbManager;

public CustomerManager(BaseDatabaseManager dbManager){
    this.dbManager =dbManager;
}

    public void getCustomer(){
        dbManager.getData();
    }
}
