package org.delcom.ifs25008springbootcashflow.domain;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PasswordHasherTest {

    @Test
    void unknownAlgorithmFailsLoudly() {
        assertThrows(IllegalStateException.class, () -> PasswordHasher.digest("TIDAK-ADA", "x"));
    }
}
