package com.exploreandlearn.autoconfigure;

import com.exploreandlearn.CustomHelloService;
import com.exploreandlearn.HelloService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    private final HelloProperties helloProperties;

    public HelloAutoConfiguration(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    @Bean
    @ConditionalOnMissingBean
  //  @ConditionalOnProperty(prefix = "hello" , name = {"suffix"}, value = {"!!"}, matchIfMissing = true)
    public HelloService helloService(){
        return new CustomHelloService(this.helloProperties.getPrefix(),
                this.helloProperties.getSuffix());
    }
}
