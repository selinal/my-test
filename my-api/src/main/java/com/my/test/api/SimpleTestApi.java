package com.my.test.api;

import com.my.test.dto.ind.QualityRequest;
import com.my.test.dto.ind.QualityResponse;

@Deprecated
public interface SimpleTestApi {

    QualityResponse executeRequest(QualityRequest request);
}
