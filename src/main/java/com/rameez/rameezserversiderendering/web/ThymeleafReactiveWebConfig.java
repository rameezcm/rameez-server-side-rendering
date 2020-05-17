package com.rameez.rameezserversiderendering.web;

import com.rameez.rameezserversiderendering.service.CovidService;
import com.rameez.rameezserversiderendering.service.impl.CovidServiceImpl;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.ISpringWebFluxTemplateEngine;
import org.thymeleaf.spring5.view.reactive.ThymeleafReactiveViewResolver;

@Configuration
@EnableConfigurationProperties(ThymeleafProperties.class)
public class ThymeleafReactiveWebConfig {
	private final ISpringWebFluxTemplateEngine templateEngine;

    public ThymeleafReactiveWebConfig(ISpringWebFluxTemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Bean
    public ThymeleafReactiveViewResolver thymeleafChunkedAndDataDrivenViewResolver() {
        final ThymeleafReactiveViewResolver viewResolver = new ThymeleafReactiveViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        viewResolver.setOrder(1);
        viewResolver.setResponseMaxChunkSizeBytes(8192); // OUTPUT BUFFER size limit
        return viewResolver;
    }

    @Bean
    public CovidService covidService(){
        return new CovidServiceImpl();
    }
}
