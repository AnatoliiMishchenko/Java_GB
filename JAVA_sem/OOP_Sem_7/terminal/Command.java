package terminal;

import java.util.ArrayList;
import java.util.List;

/**
 * - Создать класс Command, который бы инкапсулировал в себе содержимое введенной команды
 * - Реализовать в нем булевские методы для проверки введенных команд
 * - отредактировать класс CommandExecutableFactoryImpl, убрав из него хардкод и начав принимать на вход объект Command
 */

public class Command {
    public static final String ADD = "a";
    public   static  final  String DELETE = "D";
    public   static  final  String NAME = "N";
    public   static  final  String AGE_AND_NUMBERGROUP = "NG";



    private final String mainCommand;

    private final List<String> argument;

    public Command(List<String> list) {
        this.mainCommand = list.get(0);
        this.argument = new ArrayList<>(list);

        if(argument.size() > 0){
            argument.remove(0);
        }

    }

    public String getMainCommand() {
        return mainCommand;
    }

    public List<String> getArgument() {
        return argument;
    }

    public boolean isCreatCommand(){
        return (mainCommand.equals(ADD));
    }
    
    public  boolean isDeleteCommand(){
        return mainCommand.equals(DELETE) && !argument.isEmpty() && argument.get(0).equals(NAME);
    }


    public  boolean isDeleteNumberGroupCommand(){
        return mainCommand.equals(DELETE) && !argument.isEmpty() && argument.get(0).equals(AGE_AND_NUMBERGROUP);
    }
    @Override
    public String toString() {
        return "Command{" +
                "mainCommand='" + mainCommand + '\'' +
                ", argument=" + argument +
                '}';
    }





}
