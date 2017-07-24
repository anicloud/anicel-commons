package com.ani.bus.service.commons.dto.aniservice;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * @autor zhaoyu
 * @date 16-1-5
 * @since JDK 1.7
 */
public class AniSerAccountObjDto implements Serializable {
    private static final long serialVersionUID = 2897951770297195316L;

    public Long id;
    public Long objectId;
    public Long accountId;
    public String uniId;
    public String aniServiceId;
   // public List<String> webSocketSessionIds;
   // public String webSocketSessionId;
    public byte[] token;

    public String host;

    public AniSerAccountObjDto() {
    }

    public AniSerAccountObjDto(Long id, Long objectId, Long accountId,
                               String uniId, String aniServiceId
                              , byte[] token, String host) {
        this.id = id;
        this.objectId = objectId;
        this.accountId = accountId;
        this.uniId = uniId;
        this.aniServiceId = aniServiceId;
        //this.webSocketSessionIds=webSocketSessionIds;
        this.token = token;
        this.host = host;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AniSerAccountObjDto that = (AniSerAccountObjDto) o;
        return Objects.equals(accountId, that.accountId) &&
                Objects.equals(aniServiceId, that.aniServiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, aniServiceId);
    }

    @Override
    public String toString() {
        return "AniServiceAccountObjectDto{" +
                "id=" + id +
                ", objectId=" + objectId +
                ", accountId=" + accountId +
                ", uniId='" + uniId + '\'' +
                ", aniServiceId='" + aniServiceId + '\'' +
                ", token=" + Arrays.toString(token) +
                ", host='" + host + '\'' +
                '}';
    }
}
