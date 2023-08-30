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
 * FieldUpdateOperation
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
     * The value to add to the field.
     */
    @JsonProperty("add")
    protected Object add;

    /**
     * The field value to copy from another issue.
     */
    @JsonProperty("copy")
    protected Object copy;

    /**
     * The value to edit in the field.
     */
    @JsonProperty("edit")
    protected Object edit;

    /**
     * The value to removed from the field.
     */
    @JsonProperty("remove")
    protected Object remove;

    /**
     * The value to set in the field.
     */
    @JsonProperty("set")
    protected Object set;

    /**
     * Constructs a validated instance of {@link FieldUpdateOperation}.
     *
     * @param spec the specification to process
     */
    public FieldUpdateOperation(Consumer<FieldUpdateOperation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldUpdateOperation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldUpdateOperation(Consumer)} instead.
     * @param add The value to add to the field.
     * @param copy The field value to copy from another issue.
     * @param edit The value to edit in the field.
     * @param remove The value to removed from the field.
     * @param set The value to set in the field.
     */
    @ApiStatus.Internal
    public FieldUpdateOperation(Object add, Object copy, Object edit, Object remove, Object set) {
        this.add = add;
        this.copy = copy;
        this.edit = edit;
        this.remove = remove;
        this.set = set;
    }

}
