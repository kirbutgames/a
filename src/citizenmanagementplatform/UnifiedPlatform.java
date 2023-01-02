package citizenmanagementplatform;
import data.*;
import Exception.*;
import publicadministratioon.*;

import javax.print.Doc;
import java.util.Date;

public class UnifiedPlatform {
        // The class members
        public Date validdate;
        public SmallCode PIN;
        public Goal goal;
        public Citizen citizen;

        public CreditCard cardB;

        public DocPath path;


        // The constructor/s

        // Input events
        public void selectJusMin () {};
        public void selectProcedures () {};
        public void selectCriminalReportCertf () {};
        public void selectAuthMethod (byte opc) {};
        public void enterNIFandPINobt (Nif nif, Date valDate) throws NifNotRegisteredException, IncorrectValDateException,
        AnyMobileRegisteredException, ConnectException {

        }
        public void enterPIN (SmallCode pin) throws NotValidPINException, ConnectException{

        }
        public void enterForm (Citizen citz, Goal goal) throws IncompleteFormException, IncorrectVerificationException,
        ConnectException {}
        public void realizePayment () {};
        public void enterCardData (CreditCard cardD) throws IncompleteFormException, NotValidPaymentDataException,
        InsufficientBalanceException, ConnectException {

        };
        public void obtainCertificate () throws BadPathException, DigitalSignatureException, ConnectException {

        }
        public void printDocument () throws BadPathException,PrintingException{

        }

        // The setter methods for injecting the dependences

        // Other input events (not required)
        // Other internal operations (not required)
        private void registerPayment () {}
        private void openDocument (DocPath path) throws BadPathException {

        }
        private void printDocument (DocPath path) throws BadPathException, PrintingException{

        }
}
