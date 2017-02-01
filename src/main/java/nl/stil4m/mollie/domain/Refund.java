package nl.stil4m.mollie.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Refund {

    private final String id;

    private final Payment payment;

    private final BigDecimal amount;

    private final String status;

    private final Date refundedDatetime;

    private final RefundLinks links;

    @JsonCreator
    public Refund(@JsonProperty("id") String id,
                  @JsonProperty("payment") Payment payment,
                  @JsonProperty("amount") BigDecimal amount,
                  @JsonProperty("status") String status,
                  @JsonProperty("refundedDatetime") Date refundedDatetime,
                  @JsonProperty("links") RefundLinks links) {
        this.id = id;
        this.payment = payment;
        this.amount = amount;
        this.status = status;
        this.refundedDatetime = refundedDatetime;
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public Payment getPayment() {
        return payment;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public Date getRefundedDatetime() {
        return refundedDatetime;
    }

    public RefundLinks getLinks() {
        return links;
    }
}
