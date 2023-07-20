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

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddGroupBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "name"
})
@JsonTypeName("AddGroupBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddGroupBean extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link AddGroupBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddGroupBean(Consumer<AddGroupBean> spec) {
        spec.accept(this);
    }

    /**
     * The name of the group.
     */
    @JsonProperty("name")
    protected String name;


}
