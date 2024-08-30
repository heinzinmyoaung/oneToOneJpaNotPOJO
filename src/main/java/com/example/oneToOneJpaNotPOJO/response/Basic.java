package com.example.oneToOneJpaNotPOJO.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Basic {
    private boolean success;
    private String processingTime;
    private String code;
    private String message;
    private Object result;

    public String getProcessingTime() {
        return processingTime + "ms";
    }
}