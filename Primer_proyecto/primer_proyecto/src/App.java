public class App {
    public static void main(String[] args) throws Exception {
        // Obtener la instancia Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Verificar si las dos instancias son la misma
        if (singleton1 == singleton2) {
            System.out.println("¡Se ha creado solo una instancia del Singleton!");
        } else {
            System.out.println("¡Se han creado múltiples instancias del Singleton!");
        }
    }
}
