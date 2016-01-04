package com.ani.bus.service.commons.dto.aniservice;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaoyu on 15-11-4.
 */
public class AniServiceInfoDto implements Serializable {
    private static final long serialVersionUID = 7605800320163634441L;

    public Long aniServiceInfoId;
    @NotNull
    @Size(max = 150)
    public String serviceServerUrl;
    @NotNull
    @Size(max = 150)
    public String logoPath;
    @NotNull
    public Set<LanguageEnum> languageSet;
    @NotNull
    public Set<String> tagSet;
    public Double price;
    @NotNull
    public Date onShelf;
    @NotNull
    @Size(max = 255)
    public String description;

    public AniServiceInfoDto() {
    }

    public AniServiceInfoDto(String serviceServerUrl, String logoPath,
                             Set<LanguageEnum> languageSet,
                             Set<String> tagSet, Double price,
                             Date onShelf, String description) {
        this(null,serviceServerUrl, logoPath, languageSet, tagSet, price, onShelf, description );
    }

    public AniServiceInfoDto(Long aniServiceInfoId, String serviceServerUrl, String logoPath, Set<LanguageEnum> languageSet,
                             Set<String> tagSet, Double price, Date onShelf, String description) {
        this.aniServiceInfoId = aniServiceInfoId;
        this.serviceServerUrl = serviceServerUrl;
        this.logoPath = logoPath;
        this.languageSet = languageSet;
        this.tagSet = tagSet;
        this.price = price;
        this.onShelf = onShelf;
        this.description = description;
    }

    public void setLanguageSet(Set<LanguageEnum> languageSet) {
        if (this.languageSet == null) {
            this.languageSet = new HashSet<>();
        }
        this.languageSet.addAll(languageSet);
    }

    public void addLanguage(LanguageEnum languageEnum) {
        if (this.languageSet == null) {
            this.languageSet = new HashSet<>();
        }
        this.languageSet.add(languageEnum);
    }

    public void setTagSet(Set<String> tagSet) {
        if (this.tagSet == null) {
            this.tagSet = new HashSet<>();
        }
        this.tagSet.addAll(tagSet);
    }

    public void addTag(String tag) {
        if (this.tagSet == null) {
            this.tagSet = new HashSet<>();
        }
        this.tagSet.add(tag);
    }

    @Override
    public String toString() {
        return "AniServiceInfoDto{" +
                "aniServiceInfoId=" + aniServiceInfoId +
                ", serviceServerUrl='" + serviceServerUrl + '\'' +
                ", logoPath='" + logoPath + '\'' +
                ", languageSet=" + languageSet +
                ", tagSet=" + tagSet +
                ", price=" + price +
                ", onShelf=" + onShelf +
                ", description='" + description + '\'' +
                '}';
    }
}
