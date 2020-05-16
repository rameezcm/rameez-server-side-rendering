package com.rameez.rameezserversiderendering.web;

import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.ISpringWebFluxTemplateEngine;
import org.thymeleaf.spring5.SpringWebFluxTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.reactive.ThymeleafReactiveViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
@EnableConfigurationProperties(ThymeleafProperties.class)
public class ThymeleafReactiveWebConfig {
	private final ISpringWebFluxTemplateEngine templateEngine;

    public ThymeleafReactiveWebConfig(ISpringWebFluxTemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }
    
    @Bean
    public ITemplateResolver thymeleafTemplateResolver() {
      final SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
      resolver.setPrefix("classpath:templates/");
      resolver.setSuffix(".html");
      resolver.setTemplateMode(TemplateMode.HTML);
      resolver.setCacheable(false);
      resolver.setCheckExistence(false);
      return resolver;
    }
    
    @Bean
    public ISpringWebFluxTemplateEngine thymeleafTemplateEngine() {
      SpringWebFluxTemplateEngine templateEngine = new SpringWebFluxTemplateEngine();
      templateEngine.setTemplateResolver(thymeleafTemplateResolver());
      return templateEngine;
    }

    @Bean
    public ThymeleafReactiveViewResolver thymeleafChunkedAndDataDrivenViewResolver() {
        final ThymeleafReactiveViewResolver viewResolver = new ThymeleafReactiveViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        viewResolver.setOrder(1);
        viewResolver.setResponseMaxChunkSizeBytes(8192); // OUTPUT BUFFER size limit
        return viewResolver;
    }
}
