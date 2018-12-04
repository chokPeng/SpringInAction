package soundsystem;
//测试组件扫描能发现CompactDisc
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
//import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
/*CDPlayerTest使用了Spring的SpringJUnit4ClassRunner,以便在测试的时候自动创建Spring的应用上下文.
 * 注解@ContextConfiguration会告诉它需要在CDPlayerConfig中加载配置.因为CDPlayer类包含了@ComponentScan
 * 因此最终的应用上下文应该包含CompactDisc bean.
 */
public class CDPlayerTest {
	@Rule
//	public final SystemOutRule log=new SystemOutRule().enableLog();
	@Autowired
	private MediaPlayer player;
	@Autowired
	//将CompacrDisc bean注入
	private CompactDisc cDisc;
	@Test
	public void cdShouldNotBeNull() {
	/*	Assert翻译成断言
	 * assertNotNull用法:用于判断参数是否不为空值,如果为空值就会抛出异常*/
		assertNotNull(cDisc);		
	}
	@Test
	public void play() {
		player.play();
		//assertEquals("Playing Sgt.Pepper's Lonely Hearts Club Band"+" by The Beatles\n",
				//log.getLog());
		/*log.getLog()捕捉控制台的输出即player.play()的输出,assertEquals(A,B)比较A和B是否相同,否则抛出异常*/
	}
}
