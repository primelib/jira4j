package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SetDefaultLevelsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "defaultValues"
})
@JsonTypeName("SetDefaultLevelsRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetDefaultLevelsRequest extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link SetDefaultLevelsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetDefaultLevelsRequest(Consumer<SetDefaultLevelsRequest> spec) {
        spec.accept(this);
    }

    /**
     * List of objects with issue security scheme ID and new default level ID.
     */
    @JsonProperty("defaultValues")
    protected List<DefaultLevelValue> defaultValues = new ArrayList<>();


}
