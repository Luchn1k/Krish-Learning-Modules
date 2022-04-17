package lk.kalana.cloud.rentservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class HystrixConfig {
    @Autowired
    Environment environment;

    @Bean
    public HystrixCommand.Setter config(){
        HystrixCommand.Setter config = HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("cloud"));
        HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter();
        String timeOut = environment.getProperty("hystrix.timeout");
        if(timeOut == null)
            timeOut = "500";
        commandProperties.withExecutionTimeoutInMilliseconds(Integer.parseInt(timeOut));
        config.andCommandPropertiesDefaults(commandProperties);
        return config;
    }
}
