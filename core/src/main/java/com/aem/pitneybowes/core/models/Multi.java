package com.aem.pitneybowes.core.models;

import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Multi {

    @ValueMapValue
    private String image;

    public String getImage() {
        return image;
    }

    @ValueMapValue
    private String subtitle;

    public String getSubtitle() {
        return subtitle;
    }

    @ValueMapValue
    private String linkpath;

    public String getLinkpath() {
        return linkpath;
    }

    @ValueMapValue
    private String paragraph;

    public String getParagraph() {
        return paragraph;
    }

}