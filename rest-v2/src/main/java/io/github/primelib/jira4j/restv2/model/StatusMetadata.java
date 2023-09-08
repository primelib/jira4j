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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * StatusMetadata
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
    "category",
    "id",
    "name"
})
@JsonTypeName("StatusMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusMetadata {

    /**
     * The category of the status.
     */
    @JsonProperty("category")
    protected CategoryEnum category;

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
     * Constructs a validated instance of {@link StatusMetadata}.
     *
     * @param spec the specification to process
     */
    public StatusMetadata(Consumer<StatusMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusMetadata(Consumer)} instead.
     * @param category The category of the status.
     * @param id The ID of the status.
     * @param name The name of the status.
     */
    @ApiStatus.Internal
    public StatusMetadata(CategoryEnum category, String id, String name) {
        this.category = category;
        this.id = id;
        this.name = name;
    }

    /**
     * The category of the status.
     */
    @AllArgsConstructor
    public enum CategoryEnum {
        TODO("TODO"),
        IN_PROGRESS("IN_PROGRESS"),
        DONE("DONE");

        private static final CategoryEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static CategoryEnum of(String input) {
            if (input != null) {
                for (CategoryEnum v : VALUES) {
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
