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
 * FieldUpdateOperation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "add",
    "copy",
    "edit",
    "remove",
    "set"
})
@JsonTypeName("FieldUpdateOperation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldUpdateOperation {

    /**
     * Constructs a validated implementation of {@link FieldUpdateOperation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldUpdateOperation(Consumer<FieldUpdateOperation> spec) {
        spec.accept(this);
    }

    /**
     * The value to add to the field.
     */
    @JsonProperty("add")
    protected Object add = null;

    /**
     * The field value to copy from another issue.
     */
    @JsonProperty("copy")
    protected Object copy = null;

    /**
     * The value to edit in the field.
     */
    @JsonProperty("edit")
    protected Object edit = null;

    /**
     * The value to removed from the field.
     */
    @JsonProperty("remove")
    protected Object remove = null;

    /**
     * The value to set in the field.
     */
    @JsonProperty("set")
    protected Object set = null;


}
