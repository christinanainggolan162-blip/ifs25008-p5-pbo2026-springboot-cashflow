package org.delcom.ifs25008springbootcashflow.domain.exception;

/** Validasi input atau aturan bisnis gagal. */
public class ValidationException extends DomainException {

    public ValidationException(String message) {
        super(message);
    }
}
