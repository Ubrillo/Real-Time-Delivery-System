package Logic;

public class Request {
    private String requestId;
    private String trackId;
    private String description;
    private String destination;
    private String priority;

    public Request(String requestId, String trackId, String description, String destination) {
        this.requestId = requestId;
        this.trackId = trackId;
        this.description = description;
        this.destination = destination;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
