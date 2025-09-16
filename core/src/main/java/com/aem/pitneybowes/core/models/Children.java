package com.aem.pitneybowes.core.models;

import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Children {

    @ValueMapValue
    private String title;

    public String getTitle() {
        return title;
    }

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