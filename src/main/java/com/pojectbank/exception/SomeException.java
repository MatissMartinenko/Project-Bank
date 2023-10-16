package com.pojectbank.exception;

import lombok.experimental.SuperBuilder;

public class SomeException extends Throwable {
    public SomeException(String e) {
        super(e);
    }
}
