package com.herb.lib.api.model.book;

import com.herb.lib.api.model.BaseDTO;
import lombok.Data;

import java.io.Serializable;

/**
 * 书籍分类实体类
 */
@Data
public class BookClassDTO extends BaseDTO implements Serializable{

    private static final long serialVersionUID = 4840476895192930510L;
    /**
     * 分类名称
     */
    private String name;
}
