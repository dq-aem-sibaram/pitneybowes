package com.aem.pitneybowes.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Customisable_buttonModel {

    @ValueMapValue
    private String buttonText;

    public String getButtonText() {
        return buttonText;
    }

    @ValueMapValue
    private String url;

    public String getUrl() {
        return url;
    }

    // Add target field and getter
    @ValueMapValue
    private String target;

    public String getTarget() {
        return target;
    }

    /**
     * Checks if all fields in this model are empty.
     * Used in HTL: ${!model.empty}
     */
    public boolean isEmpty() {
        boolean empty = true;
        if (buttonText != null && !buttonText.isEmpty()) empty = false;
        if (url != null && !url.isEmpty()) empty = false;
        if (target != null && !target.isEmpty()) empty = false;
        return empty;
    }
}