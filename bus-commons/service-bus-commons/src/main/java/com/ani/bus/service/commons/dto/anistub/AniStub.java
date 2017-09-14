package com.ani.bus.service.commons.dto.anistub;

import com.ani.bus.service.commons.message.SocketMessage;
import com.ani.octopus.commons.stub.dto.StubArgumentDto;
import com.ani.octopus.commons.stub.dto.StubInvokeDto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Created by zhaoyu on 15-10-29.
 */
public class AniStub extends StubInvokeDto implements Serializable {
    private static final long serialVersionUID = 3790604372796535245L;
    @NotNull
    public String keyId = generateKeyId();
    public Long timeStamp;
    public Long targetObjectId;
    public Integer targetSlaveId;
    public Long accountId;
    public Long fromObjectId;
    public Integer fromslaveId;
    public SocketMessage resultMsg;

    public AniStub() {
    }

    public AniStub(Long targetObjectId, Integer targetSlaveId, Long fromObjectId, Integer fromslaveId, Long accountId, Long groupId, Integer stubId, List<StubArgumentDto> inputValues) {
        this.targetObjectId = targetObjectId;
        this.targetSlaveId = targetSlaveId;
        this.fromObjectId = fromObjectId;
        this.fromslaveId = fromslaveId;
        this.accountId = accountId;
        this.stubGroupId = groupId;
        this.stubId = stubId;
        this.inputArguments = inputValues;
    }

    public AniStub(Long targetObjectId, Integer targetSlaveId, Long accountId, Long groupId, Integer stubId, List<StubArgumentDto> inputValues) {
        this.targetObjectId = targetObjectId;
        this.targetSlaveId = targetSlaveId;
        this.accountId = accountId;
        this.stubGroupId = groupId;
        this.stubId = stubId;
        this.inputArguments = inputValues;
    }

    public AniStub(Long targetObjectId, Long accountId, Long groupId, Integer stubId, List<StubArgumentDto> inputValues) {
        this.targetObjectId = targetObjectId;
        this.accountId = accountId;
        this.stubGroupId = groupId;
        this.stubId = stubId;
        this.inputArguments = inputValues;
    }

    public String toString() {
        return "AniStub{keyId='" + this.keyId + '\'' + ", accountId=" + this.accountId + ", stubId=" + this.stubId + ", stubGroupId=" + this.stubGroupId + ", inputArguments=" + this.inputArguments + ", outputArguments=" + this.outputArguments + '}';
    }

    public static String generateKeyId() {
        return UUID.randomUUID().toString();
    }
}
