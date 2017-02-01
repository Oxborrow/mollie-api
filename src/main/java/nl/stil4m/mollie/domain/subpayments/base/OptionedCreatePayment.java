package nl.stil4m.mollie.domain.subpayments.base;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import nl.stil4m.mollie.domain.CreatePayment;

public abstract class OptionedCreatePayment<T> extends CreatePayment {

    @JsonUnwrapped
    private final T options;

    public OptionedCreatePayment(@Nonnull String method, @Nonnull BigDecimal amount, @Nonnull String description, @Nonnull String redirectUrl, @Nonnull Optional<String> webhookUrl, @Nullable Map<String, Object> metadata, @Nonnull T options) {
        super(Optional.of(method), amount, description, redirectUrl, webhookUrl, metadata);
        this.options = options;
    }

    public T getOptions() {
        return options;
    }
}
