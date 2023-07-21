package io.github.primelib.jira4j.restv3.model;

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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueLinkType
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
    "inward",
    "name",
    "outward",
    "self"
})
@JsonTypeName("IssueLink_type")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueLinkType {

    /**
     * The ID of the issue link type and is used as follows:
     *  *
     * In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is the type of issue link. Required on create when {@code name} isn't provided. Otherwise, read only.
     * *
     * In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is read only.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The description of the issue link type inward link and is used as follows:
     *  *
     * In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is read only.
     * *
     * In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
     */
    @JsonProperty("inward")
    protected String inward;

    /**
     * The name of the issue link type and is used as follows:
     *  *
     * In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is the type of issue link. Required on create when {@code id} isn't provided. Otherwise, read only.
     * *
     * In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The description of the issue link type outward link and is used as follows:
     *  *
     * In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is read only.
     * *
     * In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
     */
    @JsonProperty("outward")
    protected String outward;

    /**
     * The URL of the issue link type. Read only.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * Constructs a validated instance of {@link IssueLinkType}.
     *
     * @param spec the specification to process
     */
    public IssueLinkType(Consumer<IssueLinkType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueLinkType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueLinkType(Consumer)} instead.
     * @param id The ID of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is the type of issue link. Required on create when {@code name} isn't provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is read only.
     * @param inward The description of the issue link type inward link and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
     * @param name The name of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is the type of issue link. Required on create when {@code id} isn't provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
     * @param outward The description of the issue link type outward link and is used as follows:   *  In the [ issueLink](#api-rest-api-3-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-3-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
     * @param self The URL of the issue link type. Read only.
     */
    @ApiStatus.Internal
    public IssueLinkType(String id, String inward, String name, String outward, URI self) {
        this.id = id;
        this.inward = inward;
        this.name = name;
        this.outward = outward;
        this.self = self;
    }

}
