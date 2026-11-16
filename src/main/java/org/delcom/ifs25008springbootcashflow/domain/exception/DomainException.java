package org.delcom.ifs25008springbootcashflow.domain.exception;

/** Checked exception dasar untuk seluruh kegagalan aturan bisnis. */
public class DomainException extends Exception {

    public DomainException(String message) {
        super(message);
    }
}
