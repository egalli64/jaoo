package m06.s15.ex;

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
