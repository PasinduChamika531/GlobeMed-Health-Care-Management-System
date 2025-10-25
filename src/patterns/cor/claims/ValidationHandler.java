package patterns.cor.claims;

import model.Bill;
import model.InsuranceClaim;
import model.Patient;

public class ValidationHandler extends BaseClaimHandler {

    @Override
    protected void process(ClaimContext context) {
        Bill bill = context.getBill();
        Patient patient = context.getPatient();
        InsuranceClaim claim = context.getClaim();

        if (bill == null) {
            context.markRejected("Missing bill information.");
            return;
        }

        if (patient == null) {
            context.markRejected("Missing patient information.");
            return;
        }

        if (bill.getAmount() <= 0) {
            context.markRejected("Invalid bill amount.");
            return;
        }

        context.appendLog("Validation passed.");
    }
}
