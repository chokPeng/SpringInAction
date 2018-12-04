package gaojizhuangpei;
import org.springframework.stereotype.Component;
@Component
@Creamy
public class iceCream implements Dessert{
	public String iceCream="This is iceCream";
	public void eat() {
		System.out.println("iceCream!");
	}
}
