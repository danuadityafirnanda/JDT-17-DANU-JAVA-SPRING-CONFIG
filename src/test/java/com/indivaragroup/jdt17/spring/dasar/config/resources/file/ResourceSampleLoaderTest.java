package com.indivaragroup.jdt17.spring.dasar.config.resources.file;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ResourceSampleLoaderTest {

    @Autowired
    private ResourceSampleLoader resourceSampleLoader;

    @Test
    void testResourceSampleLoader() throws Exception {
        resourceSampleLoader.sampleResource();
    }
}
