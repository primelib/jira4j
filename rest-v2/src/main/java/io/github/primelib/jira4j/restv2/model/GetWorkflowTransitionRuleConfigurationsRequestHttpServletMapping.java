package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping
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
    "mappingMatch",
    "matchValue",
    "pattern",
    "servletName"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_httpServletMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping {

    @JsonProperty("mappingMatch")
    protected MappingMatchEnum mappingMatch;

    @JsonProperty("matchValue")
    protected String matchValue;

    @JsonProperty("pattern")
    protected String pattern;

    @JsonProperty("servletName")
    protected String servletName;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping(Consumer<GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping(Consumer)} instead.
     * @param mappingMatch mappingMatch
     * @param matchValue matchValue
     * @param pattern pattern
     * @param servletName servletName
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestHttpServletMapping(MappingMatchEnum mappingMatch, String matchValue, String pattern, String servletName) {
        this.mappingMatch = mappingMatch;
        this.matchValue = matchValue;
        this.pattern = pattern;
        this.servletName = servletName;
    }

    @AllArgsConstructor
    public enum MappingMatchEnum {
        CONTEXT_ROOT("CONTEXT_ROOT"),
        DEFAULT("DEFAULT"),
        EXACT("EXACT"),
        EXTENSION("EXTENSION"),
        PATH("PATH");

        private static final MappingMatchEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static MappingMatchEnum of(String input) {
            if (input != null) {
                for (MappingMatchEnum v : VALUES) {
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
