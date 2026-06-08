package com.indivaragroup.jdt17.spring.dasar.config.resources.file;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RequiredArgsConstructor
@Component
public class ResourceSample {

    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void readSampleResources() throws IOException {
        Resource resource  = new ClassPathResource("/media/file/example-read.txt");

        String content = resource.getContentAsString(StandardCharsets.UTF_8);
        System.out.println(content);
    }
}
