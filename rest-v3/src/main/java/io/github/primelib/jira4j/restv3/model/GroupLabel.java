package io.github.primelib.jira4j.restv3.model;

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
 * GroupLabel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "text",
    "title",
    "type"
})
@JsonTypeName("GroupLabel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupLabel {

    /**
     * Constructs a validated implementation of {@link GroupLabel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GroupLabel(Consumer<GroupLabel> spec) {
        spec.accept(this);
    }

    /**
     * The group label name.
     */
    @JsonProperty("text")
    protected String text;

    /**
     * The title of the group label.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The type of the group label.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The type of the group label.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ADMIN("ADMIN"),
        SINGLE("SINGLE"),
        MULTIPLE("MULTIPLE");

        private final String value;
    }

}
