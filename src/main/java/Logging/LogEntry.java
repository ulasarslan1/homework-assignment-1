package Logging;

import java.time.LocalDateTime;

public class LogEntry {
    private LocalDateTime timestamp;
    private String level;
    private String component;
    private String message;
    
    public LogEntry(String level, String component, String message) {
        this.timestamp = LocalDateTime.now();
        this.level = level;
        this.component = component;
        this.message = message;
    }
    
    public String toCSV() {
        return String.format("%s,%s,%s,%s%n", 
            timestamp, level, component, message);
    }
    
    public static String getCSVHeader() {
        return "timestamp,level,component,message\n";
    }
    
    // Getters
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getLevel() { return level; }
    public String getComponent() { return component; }
    public String getMessage() { return message; }
}