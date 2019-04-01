package com.my.test.ext;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Global_ID_Type_Adapter extends XmlAdapter<String, Long> {
    @Override
    public Long unmarshal(String v) throws Exception {
        return Long.valueOf(v);
    }

    @Override
    public String marshal(Long v) throws Exception {
        return v.toString();
    }
}
