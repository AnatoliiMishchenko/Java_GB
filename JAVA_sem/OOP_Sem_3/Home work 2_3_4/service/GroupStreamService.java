package sem_2.service;

import sem_2.data.GroupStream;
import sem_2.data.GroupStreamComparator;

import java.util.List;

public class GroupStreamService {
    public void sort(List<GroupStream> groupStreamList) {
        groupStreamList.sort(new GroupStreamComparator());
    }
}
