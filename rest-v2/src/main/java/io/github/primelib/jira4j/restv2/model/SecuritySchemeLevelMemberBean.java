package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecuritySchemeLevelMemberBean
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "parameter",
    "type"
})
@JsonTypeName("SecuritySchemeLevelMemberBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeLevelMemberBean {

    /**
     * The value corresponding to the specified member type.
     */
    @JsonProperty("parameter")
    protected String parameter;

    /**
     * The issue security level member type, e.g {@code reporter}, {@code group}, {@code user}.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link SecuritySchemeLevelMemberBean}.
     *
     * @param spec the specification to process
     */
    public SecuritySchemeLevelMemberBean(Consumer<SecuritySchemeLevelMemberBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecuritySchemeLevelMemberBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecuritySchemeLevelMemberBean(Consumer)} instead.
     * @param parameter The value corresponding to the specified member type.
     * @param type The issue security level member type, e.g {@code reporter}, {@code group}, {@code user}.
     */
    @ApiStatus.Internal
    public SecuritySchemeLevelMemberBean(String parameter, String type) {
        this.parameter = parameter;
        this.type = type;
    }

}
