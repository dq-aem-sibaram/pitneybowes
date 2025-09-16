package com.aem.pitneybowes.core.models;

import java.util.List;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Utility_componentModel {

    @ValueMapValue
    private String maintitle;

    public String getMaintitle() {
        return maintitle;
    }

    @ChildResource
    private List<Listofchildren> listofchildren;

    public List<Listofchildren> getListofchildren() {
        return listofchildren;
    }

    /**
     * Checks if all fields in this model are empty.
     * Used in HTL: ${!model.empty}
     */
    public boolean isEmpty() {
        boolean empty = true;
        if (maintitle != null && !maintitle.isEmpty()) empty = false;
        if (listofchildren != null && !listofchildren.isEmpty()) empty = false;
        return empty;
    }
}