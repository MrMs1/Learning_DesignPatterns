package designepatterns;

public abstract class Human {

	String name;

	//　スーパークラスでテンプレート化する処理を記述
	public void templateMethod() {
		if (start()) {
			main();
			end();
			return;
		}
		System.out.println("名前がありません");
	}

	// テンプレートメソッド内で使用するメソッドの実装はサブクラスで行う
	abstract boolean start();

	abstract void main();

	abstract void end();
}
