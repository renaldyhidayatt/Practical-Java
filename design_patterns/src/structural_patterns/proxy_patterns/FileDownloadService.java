package structural_patterns.proxy_patterns;

public class FileDownloadService implements Service {
    private String filename;

    public FileDownloadService(String filename) {
        this.filename = filename;
        loadFile(filename);
    }

    @Override
    public void downloadFile() {
        System.out.println("File " + filename + " is being downloaded");
    }

    private void loadFile(String filename) {
        System.out.println("Loading " + filename);
    }
}
