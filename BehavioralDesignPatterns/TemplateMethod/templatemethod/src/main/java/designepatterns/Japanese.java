package designepatterns;

public class Japanese extends Human {

	public Japanese(String name) {
		this.name = name;
	}

	@Override
	boolean start() {
		return name != null;
	}

	@Override
	void main() {
		System.out.println("こんにちは " + name);
	}

	@Override
	void end() {
		System.out.println("さよなら " + name);
	}

}
