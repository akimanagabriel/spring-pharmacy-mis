package com.pharmacy.dev.helpers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiMessage {
    private String message;
    private Object data;

    public ApiMessage(String message) {
        this.message = message;
        this.data = null;
    }
}
