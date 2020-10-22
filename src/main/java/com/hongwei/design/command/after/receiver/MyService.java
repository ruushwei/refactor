package com.hongwei.design.command.after.receiver;

/**
 * 只有这层知道什么时间可以操作
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-22
 */
public class MyService {

    public void execute(Command command) {
        command.execute();
    }
}
