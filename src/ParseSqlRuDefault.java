import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ParseSqlRuDefault {

    public void parseSqlRuDefault() throws IOException {
        //запрос просто sql.ru и дата месяцев от 1 до 12;
        // STOPSHIP: 17.10.2020
        String urlReq = "https://www.sql.ru/forum/job-offers";
        ParseSqlRUWithRequest parseSqlRUWithRequest = new ParseSqlRUWithRequest();
        parseSqlRUWithRequest.setUrlReq(urlReq);
        parseSqlRUWithRequest.parseWithRequest();

    }
    public static void loggerLog() {
        Logger logger = Logger.getLogger(ParseSqlRuDefault.class.getName());
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("Parser.log");
            logger.addHandler(fileHandler);
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException ee) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    ee);
        }
        logger.log(Level.INFO, "Запись лога с уровнем INFO (информационная)");
        logger.log(Level.WARNING, "Запись лога с уровнем WARNING (Предупреждение)");
        logger.log(Level.SEVERE, "Запись лога с уровнем SEVERE (серьезная ошибка)");
    }


}
