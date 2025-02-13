import java.util.*;

public class Client {
    List<Contract> contracts;

    public void requestCreateContract(String cID, String pID, String tID, double rA){
        PermanentContract contract = new PermanentContract();
        contract.buildContractID(cID);
        contract.buildPropertyID(pID);
        contract.buildTenantID(tID);
        contract.buildRentAmount(rA);
        contracts.add(contract);
    }
}
