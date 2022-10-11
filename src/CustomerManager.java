public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){ // bu class ın constructor ı new lerken çalışır
         // BaseLogger altında bulunan hepsini parametre olarak alabiliriz.
        // bu class ı kullancaksak çalıştığımız logger o da söylemeliyiz.
        this.logger = logger;
    }
    public void add() {
        System.out.println("Müşteri eklendi.");
        DatabaseLogger logger = new DatabaseLogger();//bir class ı başka bir class ın içinde new yapmak demek
        //Database logger a iyice bağlandım demek bu bağımlı bir sistem olur
        this.logger.log("Log mesajı");

    }
}
