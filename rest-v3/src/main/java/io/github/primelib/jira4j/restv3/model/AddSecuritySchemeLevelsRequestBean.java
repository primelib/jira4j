package io.github.primelib.jira4j.restv3.model;

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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddSecuritySchemeLevelsRequestBean
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
    "levels"
})
@JsonTypeName("AddSecuritySchemeLevelsRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddSecuritySchemeLevelsRequestBean {

    /**
     * The list of scheme levels which should be added to the security scheme.
     */
    @JsonProperty("levels")
    protected List<SecuritySchemeLevelBean> levels;

    /**
     * Constructs a validated instance of {@link AddSecuritySchemeLevelsRequestBean}.
     *
     * @param spec the specification to process
     */
    public AddSecuritySchemeLevelsRequestBean(Consumer<AddSecuritySchemeLevelsRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AddSecuritySchemeLevelsRequestBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AddSecuritySchemeLevelsRequestBean(Consumer)} instead.
     * @param levels The list of scheme levels which should be added to the security scheme.
     */
    @ApiStatus.Internal
    public AddSecuritySchemeLevelsRequestBean(List<SecuritySchemeLevelBean> levels) {
        this.levels = levels;
    }

}
