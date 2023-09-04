import java.math.BigDecimal;

public class Biglietto {
    private int km;
    private int eta;
    private static final BigDecimal COSTO_CHILOMETRICO = new BigDecimal("0.21");
    private static final BigDecimal SCONTO_OVER_65 = new BigDecimal("0.40");
    private static final BigDecimal SCONTO_MINORENNI = new BigDecimal("0.20");

    public Biglietto(int km, int eta) throws IllegalArgumentException {
        if (!isValidKm(km) || !isValidEta(eta)) {
            throw new IllegalArgumentException("Km e/o età non validi.");
        }
        this.km = km;
        this.eta = eta;
    }

    private boolean isValidKm(int km) {
        return km > 0;
    }

    private boolean isValidEta(int eta) {
        return eta > 0;

    }
    }