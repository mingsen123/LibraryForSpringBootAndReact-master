package com.herb.lib.api.service.reback;

import com.herb.lib.api.constants.ResultDTO;
import com.herb.lib.api.model.borrow.BookBorrowDTO;

public interface RebackService {
    /**
     * 更新借书信息
     *
     * @param bookBorrowDTO
     * @return
     */
    ResultDTO updateBorrowInfo(BookBorrowDTO bookBorrowDTO);
}
