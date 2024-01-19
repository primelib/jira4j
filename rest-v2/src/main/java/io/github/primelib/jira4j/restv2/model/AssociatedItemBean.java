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
 * AssociatedItemBean
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

    /**
     * Constructs a validated instance of {@link AssociatedItemBean}.
     *
     * @param spec the specification to process
     */
    public AssociatedItemBean(Consumer<AssociatedItemBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AssociatedItemBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AssociatedItemBean(Consumer)} instead.
     * @param id The ID of the associated record.
     * @param name The name of the associated record.
     * @param parentId The ID of the associated parent record.
     * @param parentName The name of the associated parent record.
     * @param typeName The type of the associated record.
     */
    @ApiStatus.Internal
    public AssociatedItemBean(String id, String name, String parentId, String parentName, String typeName) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.parentName = parentName;
        this.typeName = typeName;
    }

}
