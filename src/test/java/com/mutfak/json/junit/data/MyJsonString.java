package com.mutfak.json.junit.data;

import com.mutfak.json.JSONString;

/**
 * Used in testing when a JSONString is needed
 */
public class MyJsonString implements JSONString {

    @Override
    public String toJSONString() {
        return "my string";
    }
}