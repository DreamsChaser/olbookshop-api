package cn.com.njit.wd.api.enums;

/**
 * Created by wangdi on 2017/5/16.
 */
public enum TradeTypeEnum {

    RECHARGE("01","充值"),

    DECREASE("02","扣减"),
    ;

    private String key;

    private String value;

    TradeTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValueByKey(String key) {
        if (key == null)
            return null;
        String value = "";
        for (TradeTypeEnum typeEnum : TradeTypeEnum.values()) {
            if (key.equals(typeEnum.getKey())) {
                value = typeEnum.getValue();
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
