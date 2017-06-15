package py.dubbosupport.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * spring 容器工具类
 * @author bochenlong
 *
 */
public class SpringContextUtil implements ApplicationContextAware {
	// 实现ApplicationContextAware的类在实例化时候会自动执行setApplicationContext，获取到上下文
	private static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringContextUtil.applicationContext = applicationContext;
	}
	
	// 根据名字 获取bean
	public static Object getBean(String name) {
		return applicationContext.getBean(name);
	}
	
	// 根据name和class 获取bean
	public static Object getBean(String name, Class<?> c) {
		return applicationContext.getBean(name, c);
	}
	
	public static <T> T getBean(Class<T> requiredType){
		return applicationContext.getBean(requiredType);
	}
}
