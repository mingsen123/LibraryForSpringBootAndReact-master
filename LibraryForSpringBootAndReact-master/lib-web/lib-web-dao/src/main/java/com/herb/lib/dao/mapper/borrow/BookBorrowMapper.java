package com.herb.lib.dao.mapper.borrow;

import com.herb.lib.api.model.borrow.BookBorrowDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 借书逻辑处理层
 */
@Mapper
public interface BookBorrowMapper {

    int insertBorrow(BookBorrowDTO bookBorrowDTO);
}
