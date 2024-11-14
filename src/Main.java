import java.security.*;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws Exception {
        String configName = "pkcs11-oracle.cfg";
        Provider p = Security.getProvider("SunPKCS11");
        p = p.configure(configName);
        Security.addProvider(p);

        System.out.println("Test config PKCS11 provider successful");

//        //Tao va tai KeyStore PKCS#11
//        KeyStore keyStore = KeyStore.getInstance("PKCS11", p);
//        keyStore.load(null, "HSM_password".toCharArray());
//
//        // Truy xuat private key certificate tu keyStore
//        String alias = "yourKeyAlias"; // Tên alias của khóa trong HSM
//        PrivateKey privateKey = (PrivateKey) keyStore.getKey(alias, null);
//
//        // Dữ liệu cần ký
//        byte[] dataToSign = "Hello HSM!".getBytes();
//
//        // Thực hiện ký dữ liệu
//        Signature signature = Signature.getInstance("SHA256withRSA", p);
//        signature.initSign(privateKey);
//        signature.update(dataToSign);
//        byte[] signatureBytes = signature.sign();
//
//        // In kết quả chữ ký
//        System.out.println("Signature: ");
//        System.out.println(Base64.getEncoder().encodeToString(signatureBytes));
    }
}
