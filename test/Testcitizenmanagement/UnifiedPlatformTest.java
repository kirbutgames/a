package Testcitizenmanagement;

import Services.*;
import citizenmanagementplatform.UnifiedPlatform;
import data.Goal;
import data.Nif;
import data.SmallCode;
import Exception.*;
import org.junit.Test;
import publicadministratioon.*;

import java.math.BigDecimal;
import java.util.Date;

public class UnifiedPlatformTest {


    public static class Ok_CAS implements CAS{
        @Override
        public boolean askForApproval(String nTrans, CreditCard cardData, Date date, BigDecimal imp) throws NotValidPaymentDataException, InsufficientBalanceException, ConnectException {
            return true;
        }
    }
    public static class Ok_CertAuth implements CertificationAuthority{

        @Override
        public boolean sendPIN(Nif nif, Date date) throws NifNotRegisteredException, IncorrectValDateException, AnyMobileRegisteredException, ConnectException {
            return true;
        }

        @Override
        public boolean checkPIN(Nif nif, SmallCode pin) throws NotValidPINException, ConnectException {
            return true;
        }
    }
    public static class Ok_GPD implements GPD{
        @Override
        public boolean verifyData(Citizen persData, Goal goal) throws IncorrectVerificationException, ConnectException {
            return true;
        }
    }
    public static class OK_JusticeMinistry implements JusticeMinistry{

        @Override
        public CriminalRecordCertf getCriminalRecordCertf(Citizen persD, Goal g) throws DigitalSignatureException, ConnectException {
            return new CriminalRecordCertf(persD.getNif(),persD.getName(),g,null,null,null,null);
        }
    }
    public static class Not_registered_on_Certf_Authority implements CertificationAuthority {

        @Override
        public boolean sendPIN(Nif nif, Date date) throws NifNotRegisteredException{
            throw new NifNotRegisteredException();
        }

        @Override
        public boolean checkPIN(Nif nif, SmallCode pin) throws NotValidPINException, ConnectException {
            return false;
        }
    }

    @Test(expected = NifNotRegisteredException.class)
    public void Not_registered_Cert() throws IncorrectValDateException, NifNotRegisteredException, AnyMobileRegisteredException, ConnectException {
        Ok_CAS cas = new Ok_CAS();
        Not_registered_on_Certf_Authority not = new Not_registered_on_Certf_Authority();
        OK_JusticeMinistry jus = new OK_JusticeMinistry();
        Ok_GPD gpd = new Ok_GPD();

        UnifiedPlatform uni = new UnifiedPlatform(cas, not, gpd, jus);
        uni.selectJusMin();
        uni.selectProcedures();
        uni.selectAuthMethod((byte) 0);
        Nif nif = new Nif("123456789N");
        Date date = new Date(2022, 2, 3);
        uni.enterNIFandPINobt(nif, date);
    }

}
