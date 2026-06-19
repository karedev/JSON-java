package com.kareku.json.junit.data;

import com.kareku.json.JSONPropertyIgnore;
import com.kareku.json.JSONPropertyName;

public interface MyBeanCustomNameInterface {
    @JSONPropertyName("InterfaceField")
    float getSomeFloat();
    @JSONPropertyIgnore
    int getIgnoredInt();
}