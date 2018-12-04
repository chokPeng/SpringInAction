package gaojizhuangpei;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=dessertConfig.class)
public class Test {
	@Autowired
	@Creamy
	public Dessert dessert;
	@org.junit.Test
	public void testDessertType() {
		dessert.eat();
	}
}
