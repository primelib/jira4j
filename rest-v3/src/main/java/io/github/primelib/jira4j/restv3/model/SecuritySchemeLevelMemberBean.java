package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecuritySchemeLevelMemberBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "parameter",
    "type"
})
@JsonTypeName("SecuritySchemeLevelMemberBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeLevelMemberBean {

    /**
     * Constructs a validated implementation of {@link SecuritySchemeLevelMemberBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecuritySchemeLevelMemberBean(Consumer<SecuritySchemeLevelMemberBean> spec) {
        spec.accept(this);
    }

    /**
     * The value corresponding to the specified member type.
     */
    @JsonProperty("parameter")
    protected String parameter;

    /**
     * The issue security level member type, e.g `reporter`, `group`, `user`.
     */
    @JsonProperty("type")
    protected String type;


}
