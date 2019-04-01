package com.my.test.api.wrong;

import com.my.test.dto.ind.QualityRequest;
import com.my.test.dto.ind.QualityResponse;

@Deprecated
public interface WrongTestApi {

    void invoke(QualityRequest request);

    QualityRequest invoke(QualityResponse response);
}
