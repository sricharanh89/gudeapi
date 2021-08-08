package com.gude.api.exception;

import lombok.Data;

@Data
public class ErrorMessage {

    private Integer code;
    private String message;

}
