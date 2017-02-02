package nl.stil4m.mollie.util;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

import nl.stil4m.mollie.domain.CreatePayment;

/**
 * @author Oscar Farg
 */
public class CreatePaymentBuilder {

    private BigDecimal amount;
    private String description;
    private String redirectUrl;
    private String webhookUrl;
    private String method;
    private Map<String, Object> metadata;

    public CreatePaymentBuilder() {
    }

    public CreatePayment build() {
        return new CreatePayment(Optional.of(method), amount, description, redirectUrl, Optional.of(webhookUrl), metadata);
    }

    public CreatePaymentBuilder amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public CreatePaymentBuilder description(String description) {
        this.description = description;
        return this;
    }

    public CreatePaymentBuilder redirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public CreatePaymentBuilder webhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    public CreatePaymentBuilder method(String method) {
        this.method = method;
        return this;
    }

    public CreatePaymentBuilder metadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    
}
