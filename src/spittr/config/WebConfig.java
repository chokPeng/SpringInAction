package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration 
@EnableWebMvc	//启用SpringMVC
@ComponentScan("spitter.web")	//启用组件扫描
public class WebConfig extends WebMvcConfigurerAdapter{
	@Bean
	public ViewResolver viewResolver() {					//配置JSP视图解析器
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		/*例如,名为home的视图将会解析为"/WEB-INF/views/home.jsp"*/
		resolver.setPrefix("/WEB-INF/views/");		//加上前缀
		resolver.setSuffix(".jsp");					//加上后缀
		resolver.setExposeContextBeansAsAttributes(true);
		return  resolver;
	}
	@Override					//配置静态资源的处理
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
