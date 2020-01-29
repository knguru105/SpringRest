package omniwyse.spring.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import omniwyse.spring.entity.Topics;

@Service
public class TopicsService {

	private List<Topics> topics = new ArrayList<>(Arrays.asList(new Topics("101", "Automation", "Automation Project"),
			new Topics("102", "Spring Framework", "Spring Framework Project"),
			new Topics("103", "Core Java", "Web Project")));

	public List<Topics> getAllTopics() {
		return topics;
	}

	public Topics getTopic(String id) {
		// return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		for (Topics topic : topics) {
			if (id.equals(topic.getId())) {
				return topic;
			}
		}
		return null;

	}

	public void addTopic(Topics topic) {
		topics.add(topic);
	}

	public void updateTopic(Topics topic, String id) {
		for (int i = 0; i < topics.size(); i++) {
			Topics update = topics.get(i);
			if (update.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}

		}

	}

	public void deleteTopic(String id) {
		for (int i = 0; i < topics.size(); i++) {
			Topics delete = topics.get(i);
			if (delete.getId().equals(id)) {
				topics.remove(i);
				return;
			}

		}

	}

}
