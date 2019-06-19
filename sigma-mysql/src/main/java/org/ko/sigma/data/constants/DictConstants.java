package org.ko.sigma.data.constants;

public class DictConstants {

    public static class Columns {

        /**
         * 主键
         */
        public static String ID = "id";

        /**
         * 字典编码，由系统统一生成，不可修改
         */
        public static String CODE = "code";

        /**
         * 字典类型
         */
        public static String TYPE = "type";

        /**
         * 字典编码
         */
        public static String DICT_CODE = "dict_code";

        /**
         * 字典名称
         */
        public static String DICT_NAME = "dict_name";

        /**
         * 数据状态：0-删除，1-有效
         */
        public static String ENABLE = "enable";

        /**
         * 更新版本
         */
        public static String VERSION = "version";

        /**
         * 创建用户
         */
        public static String CREATE_USER = "create_user";

        /**
         * 创建时间
         */
        public static String GMT_CREATE = "gmt_create";

        /**
         * 更新用户
         */
        public static String MODIFIED_USER = "modified_user";

        /**
         * 更新时间
         */
        public static String GMT_MODIFIED = "gmt_modified";
    }

}