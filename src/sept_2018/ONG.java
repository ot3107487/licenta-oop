package sept_2018;

import java.util.ArrayList;
import java.util.List;

public class ONG {
    private List<Participant> participants;

    public ONG(List<Participant> participants) {
        this.participants = participants;
    }

    public List<Participant> getAll(boolean volunteer) {
        List<Participant> result = new ArrayList<>();
        this.participants.forEach(p -> {
            if (p instanceof Volunteer == volunteer) {
                result.add(p);
            }
        });
        return result;
    }
}
