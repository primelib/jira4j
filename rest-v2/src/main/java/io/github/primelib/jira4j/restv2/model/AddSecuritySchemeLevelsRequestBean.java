package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddSecuritySchemeLevelsRequestBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "levels"
})
@JsonTypeName("AddSecuritySchemeLevelsRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddSecuritySchemeLevelsRequestBean {

    /**
     * Constructs a validated implementation of {@link AddSecuritySchemeLevelsRequestBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddSecuritySchemeLevelsRequestBean(Consumer<AddSecuritySchemeLevelsRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * The list of scheme levels which should be added to the security scheme.
     */
    @JsonProperty("levels")
    protected List<SecuritySchemeLevelBean> levels;


}
