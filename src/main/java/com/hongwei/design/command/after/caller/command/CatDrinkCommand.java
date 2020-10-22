package com.hongwei.design.command.after.caller.command;

import com.hongwei.design.command.after.caller.Cat;
import com.hongwei.design.command.after.receiver.Command;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-22
 */
public class CatDrinkCommand extends Command {
    private Cat cat;

    public CatDrinkCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    protected void execute() {
        cat.drink();
    }
}
