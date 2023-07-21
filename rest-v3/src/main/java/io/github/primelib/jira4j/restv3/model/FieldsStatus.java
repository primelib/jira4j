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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldsStatus
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
    "iconUrl",
    "id",
    "name",
    "self",
    "statusCategory"
})
@JsonTypeName("Fields_status")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldsStatus {

    /**
     * The description of the status.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The URL of the icon used to represent the status.
     */
    @JsonProperty("iconUrl")
    protected String iconUrl;

    /**
     * The ID of the status.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the status.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the status.
     */
    @JsonProperty("self")
    protected String self;

    @JsonProperty("statusCategory")
    protected StatusDetailsStatusCategory statusCategory;

    /**
     * Constructs a validated instance of {@link FieldsStatus}.
     *
     * @param spec the specification to process
     */
    public FieldsStatus(Consumer<FieldsStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldsStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldsStatus(Consumer)} instead.
     * @param description The description of the status.
     * @param iconUrl The URL of the icon used to represent the status.
     * @param id The ID of the status.
     * @param name The name of the status.
     * @param self The URL of the status.
     * @param statusCategory var.name
     */
    @ApiStatus.Internal
    public FieldsStatus(String description, String iconUrl, String id, String name, String self, StatusDetailsStatusCategory statusCategory) {
        this.description = description;
        this.iconUrl = iconUrl;
        this.id = id;
        this.name = name;
        this.self = self;
        this.statusCategory = statusCategory;
    }

}
