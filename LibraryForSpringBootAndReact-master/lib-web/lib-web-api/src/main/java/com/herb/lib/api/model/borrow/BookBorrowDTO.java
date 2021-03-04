package com.herb.lib.api.model.borrow;

import com.herb.lib.api.model.BaseDTO;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 借书实体类

 */
public class BookBorrowDTO extends BaseDTO {

    /**
     * 用户ID
     */
    private int userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 书籍ID
     */
    private int bookId;

    /**
     * 书籍名称
     */
    private String bookName;

    /**
     * 书籍数量
     */
    private int count;

    /**
     * 借书时间
     */
    private Date startDate;

    /**
     * 还书时间
     */
    private Date endDate;

    /**
     * 书籍价格
     */
    private BigDecimal price;

    /**
     * 租借价格
     */
    private BigDecimal tradeFee;

}
