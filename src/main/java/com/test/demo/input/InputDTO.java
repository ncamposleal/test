package com.test.demo.input;

import org.springframework.lang.Nullable;

public class InputDTO {
    
    @Nullable
    public String comuna;

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
}