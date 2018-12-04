package gaojizhuangpei;

import org.springframework.stereotype.Component;

@Component
@fruit
public class Popsicle implements Dessert{
	public String popsicle="This is posicle!";
	public void eat() {
		System.out.println(" "+popsicle);
	}

}
