package com.aem.pitneybowes.core.models;

import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Bottom_footerModel {

    @ValueMapValue
    private String description;

    public String getDescription() {
        return description;
    }

    @ChildResource
    private List<Bottomfooterlist> bottomfooterlist;

    public List<Bottomfooterlist> getBottomfooterlist() {
        return bottomfooterlist;
    }

    /**
     * Checks if all fields in this model are empty.
     * Used in HTL: ${!model.empty}
     */
    public boolean isEmpty() {
        boolean empty = true;
        if (description != null && !description.isEmpty()) empty = false;
        if (bottomfooterlist != null && !bottomfooterlist.isEmpty()) empty = false;
        return empty;
    }
}