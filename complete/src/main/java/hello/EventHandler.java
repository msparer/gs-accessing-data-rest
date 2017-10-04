package hello;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class EventHandler {
	public static final String PLACE = "The Shire";

	@HandleBeforeCreate
	public void handleBeforeCreate(Person person) {
		if(person.getPlace() == null) {
			person.setPlace(PLACE);
		}
	}

}
