package Lesson9_tasks;

import java.util.ArrayList;
import java.util.List;

public class Gradebook {
    private List<SessionRecord> sessionRecords;

    public Gradebook() {
        sessionRecords = new ArrayList<>();
    }

    public void addSessionRecord(SessionRecord sessionRecord) {
        sessionRecords.add(sessionRecord);
    }

    public List<SessionRecord> getSessionRecords() {
        return sessionRecords;
    }

    public static class SessionRecord {
        private String sessionName;
        private List<ExamRecord> examRecords;

        public SessionRecord(String sessionName) {
            this.sessionName = sessionName;
            examRecords = new ArrayList<>();
        }

        public void addExamRecord(ExamRecord examRecord) {
            examRecords.add(examRecord);
        }

        public String getSessionName() {
            return sessionName;
        }

        public List<ExamRecord> getExamRecords() {
            return examRecords;
        }
    }

    public static class ExamRecord {
        private String examName;
        private int mark;

        public ExamRecord(String examName, int mark) {
            this.examName = examName;
            this.mark = mark;
        }

        public String getExamName() {
            return examName;
        }

        public int getMark() {
            return mark;
        }
    }
}
