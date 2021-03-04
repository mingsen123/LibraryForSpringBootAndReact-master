package com.herb.lib.api.constants;

import lombok.Data;

/**
 * 基本返回数据结构
 */
@Data
public class ResultDTO {

    private String system;

    private Integer code;

    private String msg;

    private Object data;

    public ResultDTO(int code, String msg) {
        this.system = "lib";
        this.code = code;
        this.msg = msg;
    }

    public ResultDTO(int code, String msg, Object data) {
        this.system = "lib";
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
