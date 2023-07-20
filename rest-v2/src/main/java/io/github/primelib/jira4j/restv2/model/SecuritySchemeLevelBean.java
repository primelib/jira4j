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
 * SecuritySchemeLevelBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "isDefault",
    "members",
    "name"
})
@JsonTypeName("SecuritySchemeLevelBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeLevelBean {

    /**
     * Constructs a validated implementation of {@link SecuritySchemeLevelBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecuritySchemeLevelBean(Consumer<SecuritySchemeLevelBean> spec) {
        spec.accept(this);
    }

    /**
     * The description of the issue security scheme level.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Specifies whether the level is the default level. False by default.
     */
    @JsonProperty("isDefault")
    protected Boolean isDefault;

    /**
     * The list of level members which should be added to the issue security scheme level.
     */
    @JsonProperty("members")
    protected List<SecuritySchemeLevelMemberBean> members;

    /**
     * The name of the issue security scheme level. Must be unique.
     */
    @JsonProperty("name")
    protected String name;


}
