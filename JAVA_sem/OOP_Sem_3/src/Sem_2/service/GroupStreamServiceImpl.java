package Sem_2.service;

import Sem_2.Data.GroupStream;
import Sem_2.Data.GroupStreamComparator;
import Sem_2.Data.StudentsGroup;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl {
    public void sort(GroupStream groupStream){

        Collections.sort(groupStream.getStudentsGroup(), new GroupStreamComparator());//  что - то я не могу понтяь в чем ошибка
    }

}
