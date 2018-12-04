package soundsystem;
//程序清单2.3 @ComponentScan注解启用了组件扫描
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Bean;
@Configuration
@Import(CDPlayerConfig.class)
public class CDPlayerConfig {
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
}
/*类CDPlayerConfig通过Java代码定义了Spring的装配规则.CDPlayerConfig类并没有显示地声明任何bean,
只不过它使用了@ComponentScan注解,这个注解能够在Spring中启用组件扫描*/
/*如果没有其他配置的话,@ComponentScan默认会扫描与配置类相同的包.因为CDPlayerConfig类位于soundsystem包中,
 * 因此Spring将会扫描这个包以及这个包下的所有子包,查找带有@Component注解的类.这样的话,就能发现CompactDisc,
 * 并且会在Spring中自动为其创建一个bean.
 */