package com.yuzh.app;

import com.yuzh.SpringTest.A;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:spring.xml")
public class ImportResourceConfig {
}
