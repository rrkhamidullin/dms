package com.rrkh.dms.rest.configuration;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.rrkh.dms.data.model.DeviceCommand;
import com.rrkh.dms.data.model.DeviceCredentials;
import com.rrkh.dms.rest.model.DeviceCommandDto;
import com.rrkh.dms.rest.model.DeviceCredentialsDto;
import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfiguration {

    //TODO it's awful
    @Bean
    public ObjectMapper objectMapper() {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(DeviceCredentials.class, new JsonDeserializer<DeviceCredentials>() {
            @Override
            public DeviceCredentials deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
                ObjectCodec codec = parser.getCodec();
                JsonNode tree = codec.readTree(parser);
                return codec.treeToValue(tree, DeviceCredentialsDto.class);
            }
        });
        module.addDeserializer(DeviceCommand.class, new JsonDeserializer<DeviceCommand>() {
            @Override
            public DeviceCommand deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
                ObjectCodec codec = parser.getCodec();
                JsonNode tree = codec.readTree(parser);
                return codec.treeToValue(tree, DeviceCommandDto.class);
            }
        });
        return new ObjectMapper().registerModules(module);
    }
}
