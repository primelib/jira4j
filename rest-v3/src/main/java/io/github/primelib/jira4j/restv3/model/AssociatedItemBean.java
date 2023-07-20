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
 * AssociatedItemBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name",
    "parentId",
    "parentName",
    "typeName"
})
@JsonTypeName("AssociatedItemBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociatedItemBean {

    /**
     * Constructs a validated implementation of {@link AssociatedItemBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssociatedItemBean(Consumer<AssociatedItemBean> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the associated record.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the associated record.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The ID of the associated parent record.
     */
    @JsonProperty("parentId")
    protected String parentId;

    /**
     * The name of the associated parent record.
     */
    @JsonProperty("parentName")
    protected String parentName;

    /**
     * The type of the associated record.
     */
    @JsonProperty("typeName")
    protected String typeName;


}
