package citizenmanagementplatform;
import data.*;
import Exception.*;
import publicadministratioon.*;
import Services.*;

import javax.print.Doc;
import java.lang.ref.Reference;
import java.math.BigDecimal;
import java.util.Date;

public class UnifiedPlatform {
        // The class members

        private CAS CAS;
        private GPD GPD;
        private CertificationAuthority CA;
        private JusticeMinistry jus;

        public Date date_transf;
        public Date validate;
        public Goal goal;
        public Citizen citizen;


        public Nif nif;
        public String reference = null;

        public BigDecimal importt = null;

        public boolean payement_Aproved =false;
        public boolean pin_ok=false;

        public boolean dni_ok = false;

        CriminalRecordCertf CrimCert;




        // The constructor/s
        public UnifiedPlatform(CAS CAS,CertificationAuthority CA,GPD GPD,JusticeMinistry JM){
                this.CAS = CAS;
                this.CA = CA;
                this.GPD=GPD;
                this.jus = JM;
        }
        // Input events
        public void selectJusMin () {

        };
        public void selectProcedures () {};
        public void selectCriminalReportCertf () {};
        public void selectAuthMethod (byte opc) {
        };
        public void enterNIFandPINobt (Nif nif, Date valDate) throws NifNotRegisteredException, IncorrectValDateException,
        AnyMobileRegisteredException, ConnectException {
                if(CA.sendPIN(nif,valDate)){
                        this.nif = nif;
                        dni_ok =true;
                        System.out.println("Introduce el pin");
                }


        }
        public void enterPIN (SmallCode pin) throws NotValidPINException, ConnectException{
                if(CA.checkPIN(this.nif,pin) && dni_ok){
                        System.out.println("Requiere rellenar del siguiente formulario");

                }
        }
        public void enterForm (Citizen citz, Goal goal) throws IncompleteFormException, IncorrectVerificationException,
        ConnectException {
                if(GPD.verifyData(citz,goal)&& pin_ok){
                        this.citizen = citz;
                        this.goal = goal;
                }else{
                        throw new IncompleteFormException();
                }


        }
        public void realizePayment () {};
        public void enterCardData (CreditCard cardD) throws IncompleteFormException, NotValidPaymentDataException,
        InsufficientBalanceException, ConnectException {

                if(CAS.askForApproval(reference,cardD,date_transf,importt)){
                        payement_Aproved = true;
                }else{
                        throw new IncompleteFormException();
                }


        };
        public void obtainCertificate () throws BadPathException, DigitalSignatureException, ConnectException {
                if(payement_Aproved){
                        CrimCert = jus.getCriminalRecordCertf(citizen,goal);
                }else{
                        throw new BadPathException();
                }
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
