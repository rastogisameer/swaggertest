package swaggertest.invoice;

public class Invoice {

    private long invoiceId;
    private String payor;
    private double amount;

    public Invoice(long invoiceId, String payor, double amount) {
        this.invoiceId = invoiceId;
        this.payor = payor;
        this.amount = amount;
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getPayor() {
        return payor;
    }

    public void setPayor(String payor) {
        this.payor = payor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        if (invoiceId != invoice.invoiceId) return false;
        if (Double.compare(invoice.amount, amount) != 0) return false;
        return payor != null ? payor.equals(invoice.payor) : invoice.payor == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (invoiceId ^ (invoiceId >>> 32));
        result = 31 * result + (payor != null ? payor.hashCode() : 0);
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
