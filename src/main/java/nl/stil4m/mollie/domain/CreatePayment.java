package nl.stil4m.mollie.domain;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CreatePayment {

    private final BigDecimal amount;
    private final String description;
    private final String redirectUrl;
    private final Optional<String> webhookUrl;
    private final Optional<String> method;
    private final Map<String, Object> metadata;

    public CreatePayment(@Nonnull Optional<String> method, @Nonnull BigDecimal amount, @Nonnull String description, @Nonnull String redirectUrl, @Nonnull Optional<String> webhookUrl, @Nullable Map<String, Object> metadata) {
        this.method = method;
        this.amount = amount;
        this.description = description;
        this.redirectUrl = redirectUrl;
        this.webhookUrl = webhookUrl;
        this.metadata = metadata;
    }

    @Nonnull
    public BigDecimal getAmount() {
        return amount;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    @Nonnull
    public String getRedirectUrl() {
        return redirectUrl;
    }

    @Nonnull
    public Optional<String> getWebhookUrl() {
        return webhookUrl;
    }

    @Nonnull
    public Optional<String> getMethod() {
        return method;
    }

    @Nullable
    public Map<String, Object> getMetadata() {
        return metadata;
    }
}
