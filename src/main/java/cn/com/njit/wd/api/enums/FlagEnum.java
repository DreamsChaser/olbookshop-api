package cn.com.njit.wd.api.enums;

/**
 * Created by wangdi on 2017/4/27.
 *
 */
public enum FlagEnum {

    SUCCESS("00","成功"),

    FAIL("-1","失败"),
    ;

    private String key;

    private String value;

    FlagEnum(String key, String value) {
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
