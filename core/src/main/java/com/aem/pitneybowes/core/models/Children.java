package com.aem.pitneybowes.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Children {

    @ValueMapValue
    private String linkname;

    public String getLinkname() {
        return linkname;
    }

    @ValueMapValue
    private String linkpath;

    public String getLinkpath() {
        return linkpath;
    }

    @ValueMapValue
    private String linkimage;

    public String getLinkimage() {
        return linkimage;
    }

}