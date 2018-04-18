package com.rrkh.dms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(scanBasePackages = "com.rrkh.dms")
public class Application {
    @Bean
    Logger logger(InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger(injectionPoint.getMethodParameter().getContainingClass());
    }

//    @Bean
//    public ObjectMapper objectMapper() {
//        SimpleModule module = new SimpleModule();
//        module.addDeserializer(DeviceCredentials.class, new JsonDeserializer<DeviceCredentials>() {
//            @Override
//            public DeviceCredentials deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
//                ObjectCodec codec = p.getCodec();
//                JsonNode tree = codec.readTree(p);
//                return codec.treeToValue(tree, DeviceCredentialsDto.class);
//            }
//        });
//        module.addSerializer()
//        return new ObjectMapper().registerModules(module);
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
