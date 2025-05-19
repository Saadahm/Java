package ObserverPattern.With;

    public class MobileSubscriber implements Subscriber{
        private String phone;
        public MobileSubscriber(String phone) { this.phone = phone; }
        @Override
        public void update(String channelName, String videoTitle) {
            System.out.printf("SMS to %s: New vid on %s → %s%n",
                    phone, channelName, videoTitle);
        }
}
