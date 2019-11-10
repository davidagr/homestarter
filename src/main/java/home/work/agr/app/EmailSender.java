package home.work.agr.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailSender implements Sender {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${emails}")
    private List<String> emails;

    public void send(String message) {
        emails.forEach(e -> {
            log.info("Sending mail with text {} on email {}", message, e);
        });
    }
}
