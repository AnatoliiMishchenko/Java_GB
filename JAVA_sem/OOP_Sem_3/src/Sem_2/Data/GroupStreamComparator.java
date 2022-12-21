package Sem_2.Data;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {
    @Override
    public int compare(GroupStream groupStream1, GroupStream groupStream2) {
        boolean t = (groupStream1.getStudentsGroup().retainAll(groupStream2.getStudentsGroup()));
        if (t!=false) return 0;
        return 1;

    }
}
