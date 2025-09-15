package com.aem.pitneybowes.core.models;

import java.util.List;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Top_footerModel {

    @ValueMapValue
    private String title;

    public String getTitle() {
        return title;
    }

    @ChildResource
    private List<Topfooterlist> topfooterlist;

    public List<Topfooterlist> getTopfooterlist() {
        return topfooterlist;
    }

    /**
     * Checks if all fields in this model are empty.
     * Used in HTL: ${!model.empty}
     */
    public boolean isEmpty() {
        boolean empty = true;
        if (title != null && !title.isEmpty()) empty = false;
        if (topfooterlist != null && !topfooterlist.isEmpty()) empty = false;
        return empty;
    }
}