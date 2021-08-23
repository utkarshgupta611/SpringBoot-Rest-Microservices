package com.ust.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerUiConfig implements WebMvcConfigurer{

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	}

	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {}

	@Override
	public void addFormatters(FormatterRegistry registry) {}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {}

	@Override
	public void addCorsMappings(CorsRegistry registry) {}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {}

	@Override
	public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {}

	@Override
	public Validator getValidator() {

		return null;
	}

	@Override
	public MessageCodesResolver getMessageCodesResolver() {
		return null;
	}

	
}
