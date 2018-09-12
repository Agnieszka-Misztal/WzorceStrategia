package strategia;

public class TaxImpl implements  Tax {
   float tax;
   float netto;

    public float calculateTax() {
        return tax*netto;
    }
}
