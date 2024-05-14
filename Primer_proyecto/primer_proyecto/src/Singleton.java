public class Singleton {
    // Variable estática para almacenar la única instancia de la clase
    private static Singleton instance;

    // Constructor privado para evitar la creación de instancias fuera de la clase
    private Singleton() {
        // Constructor privado para evitar la creación de instancias fuera de la clase
    }

    // Método estático para obtener la instancia única de la clase
    public static Singleton getInstance() {
        // Si la instancia aún no ha sido creada, la crea
        if (instance == null) {
            instance = new Singleton();
        }
        // Devuelve la instancia única
        return instance;
    }

    // Métodos de instancia de la clase
    public void showMessage(String cadena) {
        System.out.println("¡Hola! Soy una instancia Singleton.");
    }
}

