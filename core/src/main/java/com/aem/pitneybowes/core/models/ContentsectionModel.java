package com.aem.pitneybowes.core.models;

import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContentsectionModel {

    @ValueMapValue
    private String contentimage;

    public String getContentimage() {
        return contentimage;
    }

    @ValueMapValue
    private String title;

    public String getTitle() {
        return title;
    }

    @ValueMapValue
    private String description;

    public String getDescription() {
        return description;
    }

    @ValueMapValue
    private boolean showbutton;

    public boolean isShowbutton() {
        return showbutton;
    }

    /**
     * Checks if all fields in this model are empty.
     * Used in HTL: ${!model.empty}
     */
    public boolean isEmpty() {
        boolean empty = true;
        if (contentimage != null && !contentimage.isEmpty()) empty = false;
        if (title != null && !title.isEmpty()) empty = false;
        if (description != null && !description.isEmpty()) empty = false;
        if (showbutton) empty = false;
        return empty;
    }
}