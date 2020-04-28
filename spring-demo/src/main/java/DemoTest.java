import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @create 2020-04-28
 */
@Configuration
public class DemoTest {

	@Bean
	public Person person(){
		return new Person("person", 13);
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext IoC = new AnnotationConfigApplicationContext(DemoTest.class);
		Person person = IoC.getBean(Person.class);
		System.out.println(person);
	}
}

class Person{
	private String name;
	private int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person(){

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

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
