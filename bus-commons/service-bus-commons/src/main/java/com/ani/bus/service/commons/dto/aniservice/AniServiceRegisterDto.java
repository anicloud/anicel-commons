package com.ani.bus.service.commons.dto.aniservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyu on 15-11-12.
 */
public class AniServiceRegisterDto implements Serializable {
    private static final long serialVersionUID = -1271450263429504186L;
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Size(max = 100)
    public String aniServiceId;
    @NotNull
    @Size(min = 4, max = 100)
    public String serviceName;
    @NotNull
    @Size(min = 1, max = 20)
    public String version;

    //public String clientSecret;
    //public Set<String> resourceIds;
    //public Set<String> scope;
    //public Set<String> authorizedGrantTypes;
    //public Collection<String> authorities;
    @NotNull
    @Size(max = 200)
    public String webServerRedirectUri;
    //public Integer accessTokenValidity;
    //public Integer refreshTokenValidity;
    //public String autoApprove;
    //public Date registerDate;
    //public boolean archived;
    //public boolean trusted; //to set weather the client is trusted, the field is just for grant_type = authorization_code, if false, go

    @NotNull
    public Long accountId;
    @Valid
    public List<AniServiceEntranceDto> entranceList;
    @Valid
    public AniServiceInfoDto aniServiceInfo;

    /**
     * key is objstub group id, value is objstub id list
     */
    public Map<Long, List<Integer>> stubMap;


    public AniServiceRegisterDto() {
        this.stubMap = new HashMap<>();
    }

    public AniServiceRegisterDto(String aniServiceId, String serviceName, String version,
                                 String webServerRedirectUri, Long accountId,
                                 List<AniServiceEntranceDto> entranceList,
                                 AniServiceInfoDto aniServiceInfo,
                                 Map<Long, List<Integer>> stubMap) {
        this.aniServiceId = aniServiceId;
        this.serviceName = serviceName;
        this.version = version;
        this.webServerRedirectUri = webServerRedirectUri;
        this.accountId = accountId;
        this.entranceList = entranceList;
        this.aniServiceInfo = aniServiceInfo;
        this.stubMap = stubMap;


    }

    public AniServiceRegisterDto(String serviceName, String version,
                                 String webServerRedirectUri, Long accountId,
                                 List<AniServiceEntranceDto> entranceList,
                                 AniServiceInfoDto aniServiceInfo,
                                 Map<Long, List<Integer>> stubMap) {
        this.serviceName = serviceName;
        this.version = version;
        this.webServerRedirectUri = webServerRedirectUri;
        this.accountId = accountId;
        this.entranceList = entranceList;
        this.aniServiceInfo = aniServiceInfo;
        this.stubMap = stubMap;


    }

    public String getAniServiceId() {
        return aniServiceId;
    }

    public void setAniServiceId(String aniServiceId) {
        this.aniServiceId = aniServiceId;
    }



    @Override
    public String toString() {
        return "AniServiceRegisterDto{" +
                "aniServiceId='" + aniServiceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", version='" + version + '\'' +
                ", webServerRedirectUri='" + webServerRedirectUri + '\'' +
                ", accountId=" + accountId +
                ", entranceList=" + entranceList +
                ", aniServiceInfo=" + aniServiceInfo +
                ", stubMap=" + stubMap +
                '}';
    }
}
