package sem_2.service;

import sem_2.data.GroupStream;
import sem_2.data.GroupStreamComparator;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl implements StreamServise {
    @Override
    public void streamsort(List<GroupStream> groupStreamList) {
        Collections.sort(groupStreamList, new GroupStreamComparator());

    }
}
