package Services;

import Exception.*;
import data.*;
import publicadministratioon.*;
public interface GPD {// External service that represents the General Police Direction
    boolean verifyData(Citizen persData, Goal goal)
            throws IncorrectVerificationException, ConnectException;
}
