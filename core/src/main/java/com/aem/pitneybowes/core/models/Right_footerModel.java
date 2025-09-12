package com.aem.pitneybowes.core.models;

import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Right_footerModel {

    @ValueMapValue
    private String logo;

    public String getLogo() {
        return logo;
    }

    @ValueMapValue
    private String homepagelink;

    public String getHomepagelink() {
        return homepagelink;
    }

    @ValueMapValue
    private String title;

    public String getTitle() {
        return title;
    }

    @ChildResource
    private List<Iconlist> iconlist;

    public List<Iconlist> getIconlist() {
        return iconlist;
    }

    /**
     * Checks if all fields in this model are empty.
     * Used in HTL: ${!model.empty}
     */
    public boolean isEmpty() {
        boolean empty = true;
        if (logo != null && !logo.isEmpty()) empty = false;
        if (homepagelink != null && !homepagelink.isEmpty()) empty = false;
        if (title != null && !title.isEmpty()) empty = false;
        if (iconlist != null && !iconlist.isEmpty()) empty = false;
        return empty;
    }
}