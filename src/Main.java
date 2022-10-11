public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//        // we added three elements that every one of the does different tasks.
//        for (BaseLogger logger:loggers) {
//            logger.Log("Log mesajı");
//
//        }
        // we can only use polimorphism for the ones that can hold their references and are holding their inheritence.
//           EmailLogger logger = new EmailLogger();
//           logger.Log("Log mesajı");

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
      customerManager.add();
    }
}