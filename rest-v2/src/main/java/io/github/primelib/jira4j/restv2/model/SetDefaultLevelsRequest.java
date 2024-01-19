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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SetDefaultLevelsRequest
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
    "defaultValues"
})
@JsonTypeName("SetDefaultLevelsRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetDefaultLevelsRequest {

    /**
     * List of objects with issue security scheme ID and new default level ID.
     */
    @JsonProperty("defaultValues")
    protected List<DefaultLevelValue> defaultValues;

    /**
     * Constructs a validated instance of {@link SetDefaultLevelsRequest}.
     *
     * @param spec the specification to process
     */
    public SetDefaultLevelsRequest(Consumer<SetDefaultLevelsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SetDefaultLevelsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SetDefaultLevelsRequest(Consumer)} instead.
     * @param defaultValues List of objects with issue security scheme ID and new default level ID.
     */
    @ApiStatus.Internal
    public SetDefaultLevelsRequest(List<DefaultLevelValue> defaultValues) {
        this.defaultValues = defaultValues;
    }

}
