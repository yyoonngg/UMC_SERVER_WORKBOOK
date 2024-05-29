package spring.apiPayload.exception.handler;

import spring.apiPayload.code.BaseErrorCode;
import spring.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}