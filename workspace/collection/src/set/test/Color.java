package set.test;

public class Color {
	private static int seq;
	private int id;
	private String name;
	
//	{
//		id = ++seq;
//	}
	
	public Color() {;}

	public Color(String name) {
		super();
		this.name = name;
	}
	
	public Color(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		return this.hashCode() == other.hashCode();
	}
}









