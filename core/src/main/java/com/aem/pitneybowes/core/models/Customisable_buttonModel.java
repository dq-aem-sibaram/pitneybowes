package com.aem.pitneybowes.core.models;

import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

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

    /**
     * Checks if all fields in this model are empty.
     * Used in HTL: ${!model.empty}
     */
    public boolean isEmpty() {
        boolean empty = true;
        if (buttonText != null && !buttonText.isEmpty()) empty = false;
        if (url != null && !url.isEmpty()) empty = false;
        return empty;
    }
}