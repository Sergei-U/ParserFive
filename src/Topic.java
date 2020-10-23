public class Topic {
    private String title;
    private String url;
    private StringBuilder msgVacancy;
    private String date;

    public Topic(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public Topic(StringBuilder resulMsgBodyElem, String dateVacancy) {
        this.msgVacancy = resulMsgBodyElem;
        this.date = dateVacancy;
    }

    public Topic() {
        this.title = title;
        this.url = url;
        this.msgVacancy = msgVacancy;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public StringBuilder getMsgVacancy() {
        return msgVacancy;
    }

    public void setMsgVacancy(StringBuilder msgVacancy) {
        this.msgVacancy = msgVacancy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}



