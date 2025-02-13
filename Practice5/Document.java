import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
class Document {
    private String extension;
    private String encryptedContent;

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setEncryptedContent(String content, SecretKey key) throws Exception {
        this.encryptedContent = encrypt(content, key);
    }

    public String getEncryptedContent() {
        return encryptedContent;
    }

    private String encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    @Override
    public String toString() {
        return "Document [Extension=" + extension + ", Encrypted Content=" + encryptedContent + "]";
    }
}
