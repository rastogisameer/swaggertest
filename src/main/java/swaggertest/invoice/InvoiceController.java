package swaggertest.invoice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @GetMapping
    public List<Invoice> getAll(){

        List invoices = new ArrayList<Invoice>();
        invoices.add(new Invoice(1,"sam", 100));
        invoices.add(new Invoice(2,"ram", 200));
        return invoices;
    }
    @GetMapping("/{invoiceid}")
    public Invoice getAll(@PathVariable("invoiceid") Long invoiceId){

        Invoice inv = new Invoice(invoiceId,"sam", 100);

        return inv;
    }
}
