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
 * SecuritySchemeLevelBean
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
    "description",
    "isDefault",
    "members",
    "name"
})
@JsonTypeName("SecuritySchemeLevelBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeLevelBean {

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

    /**
     * Constructs a validated instance of {@link SecuritySchemeLevelBean}.
     *
     * @param spec the specification to process
     */
    public SecuritySchemeLevelBean(Consumer<SecuritySchemeLevelBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecuritySchemeLevelBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecuritySchemeLevelBean(Consumer)} instead.
     * @param description The description of the issue security scheme level.
     * @param isDefault Specifies whether the level is the default level. False by default.
     * @param members The list of level members which should be added to the issue security scheme level.
     * @param name The name of the issue security scheme level. Must be unique.
     */
    @ApiStatus.Internal
    public SecuritySchemeLevelBean(String description, Boolean isDefault, List<SecuritySchemeLevelMemberBean> members, String name) {
        this.description = description;
        this.isDefault = isDefault;
        this.members = members;
        this.name = name;
    }

}
