
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.security.spec.AlgorithmParameterSpec;


class ConfidentialDoc implements DocumentBuilder {
    private Document document;

    public ConfidentialDoc() {
        this.document = new Document();
    }

    @Override
    public DocumentBuilder setExtension(String extension) {
        document.setExtension(extension);
        return this;
    }

    @Override
    public DocumentBuilder setEncryptedContent(String content, SecretKey key, AlgorithmParameterSpec paramSpec)  {
        try {
            document.setEncryptedContent(content, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public Document buildDoc() {
        return document;
    }
}
