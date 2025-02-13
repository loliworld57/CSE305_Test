package Practice5;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.security.spec.AlgorithmParameterSpec;

public interface DocumentBuilder {
    DocumentBuilder setExtension(String extension);
    DocumentBuilder setEncryptedContent(String content, SecretKey key, AlgorithmParameterSpec paramSpec);
}