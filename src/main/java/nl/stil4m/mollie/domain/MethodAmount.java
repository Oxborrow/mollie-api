package nl.stil4m.mollie.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MethodAmount {

    private final BigDecimal minimum;
    private final BigDecimal maximum;

    @JsonCreator
    public MethodAmount(@JsonProperty("minimum") BigDecimal minimum,
                        @JsonProperty("maximum") BigDecimal maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public BigDecimal getMinimum() {
        return minimum;
    }

    public BigDecimal getMaximum() {
        return maximum;
    }
}
