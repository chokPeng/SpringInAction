package spittr.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/*扩展AbstractAnnotationConfigDispatcherServletInitializer的任意类都会自动地配置DispatcherServlet和Spring应用上下文,Spring的应用上下文会位于应用程序的Servlet上下文之中*/
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}
}
