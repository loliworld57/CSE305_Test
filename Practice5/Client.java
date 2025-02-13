package Practice5;
import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Client {
    List<Contract> contracts;
    List<Document> documents;

    public void requestCreateContract(String cID, String pID, String tID, double rA){
        PermanentContract contract = new PermanentContract();
        contract.buildContractID(cID);
        contract.buildPropertyID(pID);
        contract.buildTenantID(tID);
        contract.buildRentAmount(rA);
        contract.signContract();
        contracts.add(contract);
    }
    private static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }
    public void newDocument(String extension,String content){
        try {
            SecretKey key = generateKey();
            Document doc = new Document();
            doc.setExtension(extension);
            doc.setEncryptedContent(content, key);
            documents.add(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

