//#TODO
//Have class inherit from Serializable interface and use appropriate import statement to do so
import java.io.Serializable;
public class CartoonCharacter implements Serializable {
	
	private String name;
	private int age;
	private String tagline;
	
	public CartoonCharacter(String name, int age, String tagline) {
		this.name = name;
		this.age = age;
		this.tagline = tagline;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	
	public String toString() {
		String toString = "Name: " + this.name + "\nAge: " + this.age + "\nTagline: " + this.tagline;
		return toString;
	}

}
