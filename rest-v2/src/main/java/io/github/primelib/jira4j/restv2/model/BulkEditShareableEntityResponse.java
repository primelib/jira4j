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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * BulkEditShareableEntityResponse
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
    "action",
    "entityErrors"
})
@JsonTypeName("BulkEditShareableEntityResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkEditShareableEntityResponse {

    /**
     * Allowed action for bulk edit shareable entity
     */
    @JsonProperty("action")
    protected ActionEnum action;

    /**
     * The mapping dashboard id to errors if any.
     */
    @JsonProperty("entityErrors")
    protected Map<String, BulkEditActionError> entityErrors;

    /**
     * Constructs a validated instance of {@link BulkEditShareableEntityResponse}.
     *
     * @param spec the specification to process
     */
    public BulkEditShareableEntityResponse(Consumer<BulkEditShareableEntityResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkEditShareableEntityResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkEditShareableEntityResponse(Consumer)} instead.
     * @param action Allowed action for bulk edit shareable entity
     * @param entityErrors The mapping dashboard id to errors if any.
     */
    @ApiStatus.Internal
    public BulkEditShareableEntityResponse(ActionEnum action, Map<String, BulkEditActionError> entityErrors) {
        this.action = action;
        this.entityErrors = entityErrors;
    }

    /**
     * Allowed action for bulk edit shareable entity
     */
    @AllArgsConstructor
    public enum ActionEnum {
        CHANGEOWNER("changeOwner"),
        CHANGEPERMISSION("changePermission"),
        ADDPERMISSION("addPermission"),
        REMOVEPERMISSION("removePermission");

        private static final ActionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ActionEnum of(String input) {
            if (input != null) {
                for (ActionEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
