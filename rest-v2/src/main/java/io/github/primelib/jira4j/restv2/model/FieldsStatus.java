package io.github.primelib.jira4j.restv2.model;

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
 * FieldsStatus
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link FieldsStatus}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldsStatus(Consumer<FieldsStatus> spec) {
        spec.accept(this);
    }

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


}
