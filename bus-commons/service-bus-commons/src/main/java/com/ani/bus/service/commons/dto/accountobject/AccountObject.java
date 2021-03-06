package com.ani.bus.service.commons.dto.accountobject;

import com.ani.bus.service.commons.message.SocketMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.*;

/**
 * Created by zhaoyu on 15-11-14.
 */
public class AccountObject implements Serializable {
    private static final long serialVersionUID = 7187234248824052204L;
    private ObjectMapper objectMapper = new ObjectMapper();

    @NotNull
    private String keyId = generateKeyId();

    @NotNull
    private Long accountId;
    private Map<Long, List<Integer>> stubMap;
    private String stubMapStr;
    private AniObjectState objectState;

    private SocketMessage resultMsg;

    public AccountObject() {
        this.keyId = generateKeyId();
    }

    public AccountObject(Long accountId, Map<Long, List<Integer>> stubMap) {
        this.accountId = accountId;
        this.stubMap = stubMap;

        setStubMapStr();
    }

    public AccountObject(Long accountId) {
        this.accountId = accountId;
    }

    public AccountObject(Long accountId, AniObjectState objectState) {
        this.accountId = accountId;
        this.objectState = objectState;
    }

    private void setStubMapStr() {
        try {
            if (this.stubMap != null) {
                this.stubMapStr = objectMapper.writeValueAsString(this.stubMap);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setStubMap(Map<Long, List<Integer>> stubMap) {
        if (this.stubMap == null) {
            this.stubMap = new HashMap<>();
        }
        if (stubMap != null) {
            this.stubMap.putAll(stubMap);
            setStubMapStr();
        }
    }

    public void addStub(Long groupId, Integer stubId) {
        if (this.stubMap == null) {
            this.stubMap = new HashMap<>();
        }
        List<Integer> stubIdList = this.stubMap.get(groupId);
        if (stubIdList == null) {
            stubIdList = new ArrayList<>();
        }
        stubIdList.add(stubId);
        this.stubMap.put(groupId, stubIdList);

        setStubMapStr();
    }

    public AniObjectState getObjectState() {
        return objectState;
    }

    public void setObjectState(AniObjectState objectState) {
        this.objectState = objectState;
    }

    public Long getAccountId() {
        return accountId;
    }

    public Map<Long, List<Integer>> getStubMap() {
        return stubMap;
    }

    public String getStubMapStr() {
        return stubMapStr;
    }

    public String getKeyId() {
        return keyId;
    }

    public SocketMessage getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(SocketMessage resultMsg) {
        this.resultMsg = resultMsg;
    }

    @Override
    public String toString() {
        return "AccountObject{" +
                "accountId=" + accountId +
                ", stubMap=" + stubMap +
                ", stubMapStr='" + stubMapStr + '\'' +
                ", objectState=" + objectState +
                '}';
    }

    public static String generateKeyId() {
        return UUID.randomUUID().toString();
    }
}
