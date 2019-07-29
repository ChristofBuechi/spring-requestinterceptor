package ch.christofbuechi.requestLogger;


import ch.christofbuechi.requestLogger.interceptor.JavaRequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new KotlinRequestInterceptor());
        registry.addInterceptor(new JavaRequestInterceptor());
    }
}
