package com.hongwei.design.command.after.caller.command;

import com.hongwei.design.command.after.caller.Dog;
import com.hongwei.design.command.after.receiver.Command;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-22
 */
public class DogEatCommand extends Command {

    private Dog dog;

    public DogEatCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    protected void execute() {
        dog.eat();
    }
}
