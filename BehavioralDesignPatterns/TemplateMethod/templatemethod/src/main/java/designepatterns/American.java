package designepatterns;

public class American extends Human {

	public American(String name) {
		this.name = name;
	}

	@Override
	boolean start() {
		return name != null;
	}

	@Override
	void main() {
		System.out.println("Hello " + name);
	}

	@Override
	void end() {
		System.out.println("Bye " + name);
	}
}
