package com.anicel.commons.service.bus.message.callmessage;

import com.anicel.commons.service.bus.dto.accountobject.AccountObject;
import com.anicel.commons.service.bus.dto.accountobject.AccountObjectCallType;
import com.anicel.commons.service.bus.dto.accountobject.AniObjectState;
import com.anicel.commons.service.bus.message.MessageType;
import com.anicel.commons.service.bus.message.SocketMessage;

/**
 * Created by zhaoyu on 15-11-16.
 */
public class AniAccountCallMessage extends SocketMessage {
    private static final long serialVersionUID = 5686024362447262789L;

    private AccountObject accountObject;
    private AccountObjectCallType accountObjectCallType;

    public AniAccountCallMessage() {
        super();
    }

    public AniAccountCallMessage(AccountObject accountObject,
                                 AccountObjectCallType accountObjectCallType) {
        super(MessageType.CALL_ANI_ACCOUNT);
        this.accountObject = accountObject;
        this.accountObjectCallType = accountObjectCallType;
    }

    public AniAccountCallMessage(Long accountId, AniObjectState objectState,
                                 AccountObjectCallType accountObjectCallType) {
        super(MessageType.CALL_ANI_ACCOUNT);
        this.accountObject = new AccountObject(accountId, objectState);
        this.accountObjectCallType = accountObjectCallType;
    }

    public AccountObject getAccountObject() {
        return accountObject;
    }

    public void setAccountObject(AccountObject accountObject) {
        this.accountObject = accountObject;
    }

    public AccountObjectCallType getAccountObjectCallType() {
        return accountObjectCallType;
    }

    public void setAccountObjectCallType(AccountObjectCallType accountObjectCallType) {
        this.accountObjectCallType = accountObjectCallType;
    }

    @Override
    public String toString() {
        return "AniAccountCallMessage{" +
                "accountObject=" + accountObject +
                ", accountObjectCallType=" + accountObjectCallType +
                "} " + super.toString();
    }
}
