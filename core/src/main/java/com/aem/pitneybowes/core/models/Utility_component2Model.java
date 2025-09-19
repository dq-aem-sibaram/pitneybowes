package com.aem.pitneybowes.core.models;

import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Utility_component2Model {

    @ValueMapValue
    private String maintitle;

    public String getMaintitle() {
        return maintitle;
    }

    @ChildResource
    private List<Multichild> multichild;

    public List<Multichild> getMultichild() {
        return multichild;
    }

    /**
     * Checks if all fields in this model are empty.
     * Used in HTL: ${!model.empty}
     */
    public boolean isEmpty() {
        boolean empty = true;
        if (maintitle != null && !maintitle.isEmpty()) empty = false;
        if (multichild != null && !multichild.isEmpty()) empty = false;
        return empty;
    }
}