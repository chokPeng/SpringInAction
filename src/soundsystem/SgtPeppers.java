package soundsystem;
//带有@Component注解的CompactDisc实现类SgtPeppers
import org.springframework.stereotype.Component;
@Component
/*Component注解表明该类会作为组建类,并告知Spring要为这个类创建bean.没有必要显示配置SgtPeppers bean,
因为这个类使用了@Component注解,所以Spring会为你把事情处理妥当.
*/
public class SgtPeppers implements CompactDisc{	
	private String title="Sgt.Pepper's Lonely Hearts Club Band";
	private String artist="The Beatles";
	public void play(){
		System.out.println("Playing "+title+" by "+artist);
	}
}
/*组价扫描默认是不启用的.我们还需要显示配置一下Spring,从而命令它去寻找带有@Component注解的类,并未其创建bean*/
