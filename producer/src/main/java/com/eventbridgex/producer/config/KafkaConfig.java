@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic userEventsTopic() {
        return TopicBuilder
                .name("user-events")
                .partitions(3)
                .replicas(1)
                .build();
    }
}