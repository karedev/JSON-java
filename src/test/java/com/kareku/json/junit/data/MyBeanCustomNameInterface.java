package com.mutfak.json.junit.data;

import com.mutfak.json.JSONPropertyIgnore;
import com.mutfak.json.JSONPropertyName;

public interface MyBeanCustomNameInterface {
    @JSONPropertyName("InterfaceField")
    float getSomeFloat();
    @JSONPropertyIgnore
    int getIgnoredInt();
}