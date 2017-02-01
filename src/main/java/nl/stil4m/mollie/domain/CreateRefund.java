package nl.stil4m.mollie.domain;

import java.math.BigDecimal;
import java.util.Optional;

import javax.annotation.Nullable;

public class CreateRefund {
    private final Optional<BigDecimal> amount;

    public CreateRefund(@Nullable BigDecimal amount) {
        this.amount = Optional.ofNullable(amount);
    }

    public Optional<BigDecimal> getAmount() {
        return amount;
    }
}
