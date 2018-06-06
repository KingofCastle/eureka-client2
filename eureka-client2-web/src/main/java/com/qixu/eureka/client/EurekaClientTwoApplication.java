package com.qixu.eureka.client;

import com.qixu.eureka.client.constants.ClientConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author castle
 * @date 2018/6/4 16:36
 **/
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {ClientConstants.CHECKOUT_API_PACKAGE_NAME})
@ComponentScan(basePackages = {"com.qixu.eureka.client","com.qixu.eureka.client.api"})
public class EurekaClientTwoApplication {
    public static void main(String[] args) {

        SpringApplication.run(EurekaClientTwoApplication.class, args);
    }
}
