package m2.s21.ex;

public abstract class Actor {

	private String name;

	public Actor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract boolean fight(Actor enemy);

	@Override
	public String toString() {
		return "Actor [name=" + name + "]";
	}
}
