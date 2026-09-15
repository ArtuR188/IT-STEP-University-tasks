public class SRPExample {
    public static void main(String[] args) {
        ReportContent r = new ReportContent("Report", "Text");
        new ReportManager().handle(r);
    }
}

class ReportContent {
    String title, text;
    ReportContent(String title, String text) {
        this.title = title;
        this.text = text;
    }
}

class ReportSaver {
    void save(ReportContent r) {
        System.out.println("Saved: " + r.title + "\n" + r.text);
    }
}

class ReportSender {
    void send(ReportContent r) {
        System.out.println("Sent: " + r.title + "\n" + r.text);
    }
}

class ReportManager {
    void handle(ReportContent r) {
        new ReportSaver().save(r);
        new ReportSender().send(r);
    }
}
