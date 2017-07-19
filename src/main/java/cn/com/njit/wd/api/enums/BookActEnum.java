package cn.com.njit.wd.api.enums;

/**
 * Created by wangdi on 2017/5/3.
 */
public enum BookActEnum {

    COMMON("00","无活动"),

    NEW("01","新品"),

    SPECIAL("02","促销"),

    HOT("03","热卖"),
    ;
    private String key;
    private String value;

    BookActEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
