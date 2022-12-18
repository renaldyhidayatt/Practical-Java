package structural_patterns.proxy_patterns;

public class ProxyPatterns {
    public static void kentang() {
        String filename = "file.txt";
        Service service = new ProxyFile(filename);

        service.downloadFile();
    }
}
