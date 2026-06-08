package com.indivaragroup.jdt17.spring.dasar.config.resources.file;

import jakarta.annotation.PostConstruct;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class ResourceSampleLoader implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @PostConstruct
    public void sampleResource() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:/media/file/example-read.txt");
        String content = resource.getContentAsString(StandardCharsets.UTF_8);
        System.out.println(content);

        System.out.println("Ini File dari example resource loader");
    }
}
