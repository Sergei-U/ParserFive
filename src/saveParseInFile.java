import java.io.FileWriter;
import java.io.IOException;

class SaveParseInFile {
    public void saveParseInFile() {
        Topic topic = new Topic();
        try (FileWriter writer = new FileWriter("Topic.txt", false)) {
            String date = topic.getDate();
            String urlName = topic.getUrl();
            StringBuilder vacText = topic.getMsgVacancy();
            String title = topic.getTitle();
            writer.append('\n');
            writer.append('E');
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}