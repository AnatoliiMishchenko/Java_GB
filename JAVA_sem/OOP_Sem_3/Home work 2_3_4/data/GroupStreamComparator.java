package sem_2.data;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {
    @Override
    public int compare(GroupStream groupStream1, GroupStream groupStream2) {
        return groupStream1.compareTo(groupStream2);
    }
}
