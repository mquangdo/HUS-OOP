package hus.oop.lab11.iterator.question2;

public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            sendEmail(profile.getEmail(), message);
        }
    }

    private void sendEmail(String email, String message) {
        System.out.printf("Sent to email \"%s\" a message: \"%s\"\n", email, message);
    }
}
