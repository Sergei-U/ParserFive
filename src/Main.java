import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        ParseSqlRUWithRequest parseWithRequest = new ParseSqlRUWithRequest();
        System.out.println("Добро пожаловать в Parser");
        System.out.println("Для начала работы выберите необходимое Вам действие");
        System.out.println("Введите наименование сайта без https:/ (sql.ru)");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        boolean resultExecute = true;
        boolean execute = true;
        while (execute) {
            String operation = str;
            switch (operation) {
                case "sql.ru":
                    try {
                        if (resultExecute) {
                            System.out.println("1. Парсинг по ключевому слову");
                            System.out.println("2. Парсинг без ключевого слова с периодом размещения вакансий от 1 до 12 месяцев");
                            System.out.println("3. Парсинг всех вакансий за 90 дней");
                            case (1):
                                try {
                                    if (resultExecute) {
                                        System.out.println("Введите ключевое слово для поиска вакнский");
                                        ParseSqlRUWithRequest parseSqlRUWithRequest = new ParseSqlRUWithRequest();
                                        parseSqlRUWithRequest.setUrlReq(bf.readLine());
                                        parseSqlRUWithRequest.parseWithRequest();
                                        for (Topic t : parseWithRequest.getTopic()) {
                                            System.out.println(
                                                    t.getTitle() +
                                                            t.getUrl() +
                                                            t.getMsgVacancy() +
                                                            t.getDate());
                                        }
                                        break;

                                    }

                                } catch (IOException exception) {
                                    exception.printStackTrace();
                                }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }



        }

        public static void loggerLog () {
            Logger logger = Logger.getLogger(Main.class.getName());
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
}

//        List<FirstUrlName> firstUrlName = new ArrayList<>();


//            public List<Topic> parseOnTopics(Document forum) {
//                List<Topic> result = new ArrayList<>();
//                Elements table = forum.getElementsByClass("forumTable");
//                return result;
//            }
//
//            public String parseOnMassage(Document topic) {
//                StringBuilder result = new StringBuilder();
//                Elements msgBody = topic.getElementsByClass("msgBody");
//                Element msg = msgBody.select("td").next().first();
//                for (TextNode subString : msg.textNodes()) {
//                    if (!subString.text().equals(" ")) {
//                        result.append(subString).append(System.lineSeparator());
//                    }
//                }
//                return result.toString();
//            }
//        }


//        System.out.println(table);

//        String oldUrl = "<td class=\"postslisttopic\"> <a href=\"";
////        String urlS = table.replace(oldUrl, "").split("\"")[0];
//        String urlS = table.replace(oldUrl, "");
//        System.out.println(urlS);
//    }

//        Document topicUrl = Jsoup.connect(urls).get();
//        Elements topicText = topicUrl.getElementsByClass("msgTable");

//        System.out.println(urls);


//        Elements links = forum.select("a[href]");
//        for (Element link : links) {
//            firstUrlNames.add(link.attr("abs:href"));
//            System.out.println(firstUrlNames);
//        }
//    }
//}


//        Elements table = forum.getElementsByAttributeValue("class", "postslisttopic");
//        table.forEach(tdTable -> {
//            Element aTable = tdTable.child(0);
//            String urlName = aTable.attr("href");
//            firstUrlNames.add(new FirstUrlName(urlName));
//        });
//    }
//}


//            FirstUrlName firstUrlName1 = new FirstUrlName();
//            firstUrlName1.getFirstUrlName();
//            for ( int i = 0; i<firstUrlName.size(); i++) {
//                Document topicS = Jsoup.connect(firstUrlName1).get();
//                Elements vacancyT = topicS.getElementsByClass("msgBody");
//                Elements dateTopic = topicS.getElementsByClass("msgFooter");
////                System.out.println(vacancyT);
////                System.out.println(dateTopic);
//                for (Element vacT : vacancyT) {
//
////                String vacTex = vacT.select("a[href]").first().text());
//
//                    String descriprionVacancy = vacT.select("a[href]").first().attr("href");
//
//                }
//
//                for ( Element date : dateTopic) {
//
////                String dateVac = date.select("a[href]").first().text());
//
//                }
//
//            }
//        }
//    }


//            for (Topic topic : topic) {
//                String urlTopic = topic.getUrl();
//                StringBuilder result = new StringBuilder();
//                Document msgBody = Jsoup.connect(urlTopic).get();
//                Elements msgFooter = msgBody.getElementsByClass("msgFooter");
//                Elements msgBodyElem = msgBody.getElementsByClass("msgBody");
//                Element msg = msgFooter.select("")
//                        .next()
//                        .first();
//                for (TextNode subString : msg.textNodes()) {
//                    if (!subString.text()
//                            .equals(" ")) {
//                        result.append(subString).append(System.lineSeparator());
//                        System.out.println("1+="+result);
//                    }
//                }
//                Element msgBodyE = msgBodyElem.select("td")
//                        .next()
//                        .first();
//                for (TextNode subString : msg.textNodes()) {
//                    if (!subString.text().equals(" ")) {
//                        result.append(subString).append(System.lineSeparator());
//                        System.out.println("2+=" +result);
//                    }
//                }
//            }
//        }
//    }
//}


//    public String parseOnMassage(Document forum) {
//        StringBuilder result = new StringBuilder();
//        Elements msgBody = forum.getElementsByClass("msgBody");
//        Element msg = msgBody.select("td").next().first();
//        for (TextNode subString : msg.textNodes()) {
//            if (!subString.text().equals(" ")) {
//                result.append(subString).append(System.lineSeparator());
//            }
//        }
//        return result.toString();
//    }
//
//    public String parseOnMassageDate(Document topic) {
//        StringBuilder result = new StringBuilder();
//        Elements msgBody = topic.getElementsByClass("msgFooter");
//        Element msg = msgBody.select("").next().first();
//        for (TextNode subString : msg.textNodes()) {
//            if (!subString.text().equals(" ")) {
//                result.append(subString).append(System.lineSeparator());
//            }
//        }
//        return result.toString();
//    }
//}

//   System.out.println(parseWithRequest);
//           for (Topic t : parseWithRequest.getTopic()) {
//           System.out.println(
//           t.getTitle() +
//           t.getUrl() +
//           t.getMsgVacancy() +
//           t.getDate());
//           }

//    public static void loggerLog() {
//        Logger logger = Logger.getLogger(ParseSqlRUWithRequest.class.getName());
//        FileHandler fileHandler = null;
//        try {
//            fileHandler = new FileHandler("Parser.log");
//            logger.addHandler(fileHandler);
//            logger.addHandler(fileHandler);
//            SimpleFormatter formatter = new SimpleFormatter();
//            fileHandler.setFormatter(formatter);
//        } catch (SecurityException e) {
//            logger.log(Level.SEVERE,
//                    "Не удалось создать файл лога из-за политики безопасности.",
//                    e);
//        } catch (IOException ee) {
//            logger.log(Level.SEVERE,
//                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
//                    ee);
//        }
//        logger.log(Level.INFO, "Запись лога с уровнем INFO (информационная)");
//        logger.log(Level.WARNING, "Запись лога с уровнем WARNING (Предупреждение)");
//        logger.log(Level.SEVERE, "Запись лога с уровнем SEVERE (серьезная ошибка)");
//    }
//
//}
