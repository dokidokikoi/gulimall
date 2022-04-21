package com.harukaze.common.constant;

/**
 * @PackageName: com.harukaze.common.constant
 * @ClassName: ProductConstant
 * @Description:
 * @Author: doki
 * @Date: 2022/4/19 11:58
 */

public class ProductConstant {

    public enum AttrEnum {
        /**
         *
         */
        ATTR_TYPE_BASE(1, "基本属性"),
        ATTR_TYPE_SALE(0, "销售属性");


        private int code;
        private String msg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String masg) {
            this.msg = masg;
        }
    }
}