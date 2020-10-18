package com.hongwei.refactor.typecode.strategy.before;

/**
 * @author 张宏伟 <zhanghongwei@kuaishou.com>
 * Created on 2020-10-18
 */
public enum AnimalTypeEnum {
    CAT(1, "猫"),
    DOG(2, "狗"),
    ;
    private Integer code;
    private String name;

    AnimalTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static AnimalTypeEnum of(int typeId) {
        for (AnimalTypeEnum animalTypeEnum : AnimalTypeEnum
                .values()) {
            if (animalTypeEnum.getCode() == typeId) {
                return animalTypeEnum;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }
}
