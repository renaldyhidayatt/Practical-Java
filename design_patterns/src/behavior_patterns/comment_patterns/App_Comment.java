package behavior_patterns.comment_patterns;

public class App_Comment {
    public static void kentang() {
        ReportGenerationExecutor reportGenerationExecutor = new ReportGenerationExecutor();
        reportGenerationExecutor.executeOperation(new GenerateReportOperation());
    }
}
