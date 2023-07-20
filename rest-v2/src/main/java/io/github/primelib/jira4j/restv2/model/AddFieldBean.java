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
 * AddFieldBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "fieldId"
})
@JsonTypeName("AddFieldBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddFieldBean {

    /**
     * Constructs a validated implementation of {@link AddFieldBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddFieldBean(Consumer<AddFieldBean> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the field to add.
     */
    @JsonProperty("fieldId")
    protected String fieldId;


}
