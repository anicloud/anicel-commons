package com.ani.bus.service.commons.dto.aniStorage;

import java.io.Serializable;

/**
 * Created by wyf on 16-8-29.
 */
public class AniStorageServiceAccessDto implements Serializable{
    private static final long serialVersionUID = 3718070813054900850L;

    public String endpoint;
    public String accessKeyId;
    public String accessKeySecret;
    public String securityToken;
    public String expiration;
    public String bucketName;
    public String filePath;
    public AniStorageServiceAccessDto() {
    }

    public AniStorageServiceAccessDto(String endpoint, String accessKeyId, String accessKeySecret,
                         String securityToken, String expiration,String bucketName,String filePath) {
        this.endpoint = endpoint;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.securityToken = securityToken;
        this.expiration = expiration;
        this.bucketName = bucketName;
        this.filePath = filePath;
    }
    @Override
    public String toString(){
        return "AniStorageServiceAccessDto{" +
                "endpoint='" + endpoint + '\'' +
                ", accessKeyId='" + accessKeyId + '\'' +
                ", accessKeySecret='" + accessKeySecret + '\'' +
                ", securityToken='" + securityToken + '\'' +
                ", expiration='" + expiration + '\'' +
                ", bucketName='" + bucketName + '\'' +
                ", filePath='" + filePath +
                '}';
    }
}
