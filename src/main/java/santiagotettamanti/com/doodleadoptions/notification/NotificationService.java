package santiagotettamanti.com.doodleadoptions.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;
    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
    public Notification getNotificationById(Integer id) {
        Optional<Notification> notificationFound = notificationRepository.findById(id);
        if(notificationFound.isPresent()) {
            return notificationFound.get();
        } else {
            return null;
        }
    }
    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Notification deleteNotificationById(Integer id) {
        Notification notificationFound = getNotificationById(id);
        if (notificationFound == null) {
            throw new RuntimeException("error");
        }
        notificationRepository.deleteById(id);
        return notificationFound;
    }
}
