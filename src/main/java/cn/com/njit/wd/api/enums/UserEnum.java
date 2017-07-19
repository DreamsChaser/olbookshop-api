package cn.com.njit.wd.api.enums;

/**
 * Created by wangdi on 2017/5/2.
 */
public enum UserEnum {

    MANAGE_USER("00","管理员"),
    COMMON_USER("01","普通会员"),
    VIP_USER("02","VIP会员"),
    ;

    private String key;

    private String value;

    UserEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValueByKey(String key) {
        if (key == null)
            return null;
        String value = "";
        for (UserEnum userEnum : UserEnum.values()) {
            if (key.equals(userEnum.getKey())) {
                value = userEnum.getValue();
                break;
            }
        }
        return value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
