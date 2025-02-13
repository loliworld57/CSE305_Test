

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.AlgorithmParameterSpec;


class NormalDoc implements DocumentBuilder {
    private Document document;

    public NormalDoc() {
        this.document = new Document();
    }

    @Override
    public DocumentBuilder setExtension(String extension) {
        document.setExtension(extension);
        return this;
    }

    @Override
    public DocumentBuilder setEncryptedContent(String content, SecretKey key, AlgorithmParameterSpec paramSpec) {
        try {
            document.setEncryptedContent(content, null); // No encryption for normal documents
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
