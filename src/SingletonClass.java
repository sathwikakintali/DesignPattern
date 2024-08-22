public class SingletonClass {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Initial Config Value: " + configManager.getConfigValue());
        configManager.setConfigValue("Updated Configuration");
        System.out.println("Updated Config Value: " + configManager.getConfigValue());
    }
}
