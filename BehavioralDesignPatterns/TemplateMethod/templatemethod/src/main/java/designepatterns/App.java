package designepatterns;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Human japanese = new Japanese("Bob");
		Human american = new American("Bob");
		japanese.templateMethod();
		american.templateMethod();
	}
}
