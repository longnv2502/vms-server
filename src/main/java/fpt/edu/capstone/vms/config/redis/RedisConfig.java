package fpt.edu.capstone.vms.config.redis;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RedisProperties.class)
public class RedisConfig {
//    @Bean
//    public RedisTemplate<String, List<String>> redisTemplate(RedisConnectionFactory connectionFactory) {
//        RedisTemplate<String, List<String>> template = new RedisTemplate<>();
//        template.setConnectionFactory(connectionFactory);
//        return template;
//    }
}
