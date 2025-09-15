package com.aem.pitneybowes.core.models;

import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Hero_bannerModel {

    @ValueMapValue
    private String heading;

    public String getHeading() {
        return heading;
    }

    @ValueMapValue
    private String description;

    public String getDescription() {
        return description;
    }

    @ValueMapValue
    private String imageurl;

    public String getImageurl() {
        return imageurl;
    }

    @ValueMapValue
    private boolean isbuttonrequired;

    public boolean isIsbuttonrequired() {
        return isbuttonrequired;
    }

    /**
     * Checks if all fields in this model are empty.
     * Used in HTL: ${!model.empty}
     */
    public boolean isEmpty() {
        boolean empty = true;
        if (heading != null && !heading.isEmpty()) empty = false;
        if (description != null && !description.isEmpty()) empty = false;
        if (imageurl != null && !imageurl.isEmpty()) empty = false;
        if (isbuttonrequired) empty = false;
        return empty;
    }
}