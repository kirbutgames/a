package Services;
import Exception.*;
import data.*;
import publicadministratioon.Citizen;
import publicadministratioon.CriminalRecordCertf;

public interface JusticeMinistry { // External service for the Justice Ministry
    CriminalRecordCertf getCriminalRecordCertf (Citizen persD, Goal g)
            throws DigitalSignatureException, ConnectException;
}

