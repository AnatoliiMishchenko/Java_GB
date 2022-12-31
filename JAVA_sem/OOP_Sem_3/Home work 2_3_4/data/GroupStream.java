package sem_2.data;

import java.util.Iterator;
import java.util.List;


public class GroupStream implements Iterable<StudentGroup>, Comparable<GroupStream> {
    private List<StudentGroup> groupList;
    private int numberOfGroup;

    public GroupStream(List<StudentGroup> groupList, int numberOfGroup) {
        this.groupList = groupList;
        this.numberOfGroup = numberOfGroup;
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }


    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    @Override
    public int compareTo(GroupStream studentGroups) {
        return Integer.compare(this.numberOfGroup, studentGroups.numberOfGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }

}
