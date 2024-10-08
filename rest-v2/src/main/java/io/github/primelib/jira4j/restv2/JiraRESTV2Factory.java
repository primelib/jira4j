package io.github.primelib.jira4j.restv2;

import java.util.Map;
import javax.annotation.processing.Generated;
import lombok.Builder;

import io.github.primelib.jira4j.restv2.api.JiraRESTV2Api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.micrometer.MicrometerCapability;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import okhttp3.Credentials;

import io.github.primelib.primecodegenlib.java.feign.common.interceptor.AuthInterceptor;
import io.github.primelib.primecodegenlib.java.feign.common.capabilities.PrimeCapability;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.function.Consumer;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Slf4j
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraRESTV2Factory {
    public static <T> T create(Consumer<JiraRESTV2FactorySpec<T>> spec) {
        JiraRESTV2FactorySpec<T> config = new JiraRESTV2FactorySpec<>(spec);

        if (config.api().isInterface()) {
            return buildClient(spec);
        } else {
            try {
                JiraRESTV2Api api = buildClient(s -> {
                    s.api(JiraRESTV2Api.class);
                    s.applySpec(config);
                });
                return config.api().getConstructor(JiraRESTV2Api.class).newInstance(api);
            } catch (Exception ex) {
                throw new IllegalArgumentException("api must have a constructor with one parameter of type JiraRESTV2Api", ex);
            }
        }
    }

    public static JiraRESTV2Api create() {
        return create(spec -> spec.api(JiraRESTV2Api.class));
    }

    private static <T> T buildClient(Consumer<JiraRESTV2FactorySpec<T>> spec) {
        JiraRESTV2FactorySpec<T> config = new JiraRESTV2FactorySpec<>(spec);

        // http client
        okhttp3.OkHttpClient.Builder clientBuilder = new okhttp3.OkHttpClient.Builder();
        if (config.proxy() != null && config.proxy().type() != Proxy.Type.DIRECT) {
            clientBuilder.proxy(new Proxy(config.proxy().type(), new InetSocketAddress(config.proxy().host(), config.proxy().port())));
            if (config.proxy().username() != null || config.proxy().password() != null) {
                clientBuilder.proxyAuthenticator((route, response) -> {
                    return response.request().newBuilder()
                            .header("Proxy-Authorization", Credentials.basic(config.proxy().username(), new String(config.proxy().password())))
                            .build();
                });
            }
        }

        // objectMapper
        JsonMapper.Builder objectMapperBuilder = JsonMapper.builder()
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
            .enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .propertyNamingStrategy(PropertyNamingStrategies.LOWER_CAMEL_CASE)
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
            .serializationInclusion(JsonInclude.Include.ALWAYS)
            .addModule(new JavaTimeModule());
        config.extensions().forEach(extension -> extension.customizeObjectMapper(objectMapperBuilder));
        ObjectMapper objectMapper = objectMapperBuilder.build();

        // builder
        return Feign.builder()
                .client(new OkHttpClient(clientBuilder.build()))
                .encoder(new JacksonEncoder(objectMapper))
                .decoder(new JacksonDecoder(objectMapper))
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.valueOf(config.logLevel().toUpperCase()))
                .addCapability(new MicrometerCapability(config.meterRegistry()))
                .addCapability(new PrimeCapability(config.backendName(), config.extensions()))
                .requestInterceptor(new AuthInterceptor(config.auth()))
                .decodeVoid()
                .target(config.api(), config.baseUrl());
    }
}
