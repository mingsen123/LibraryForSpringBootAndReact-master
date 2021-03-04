package com.herb.lib.web.book;

import com.herb.lib.api.constants.ResultDTO;
import com.herb.lib.api.enums.HttpCode;
import com.herb.lib.api.model.book.BookDTO;
import com.herb.lib.api.service.book.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    /**
     * 根据名称查找书籍信息
     *书籍实体类
     * @param  bookDTO 书籍实体
     */
    @RequestMapping("/findListByName")
    public ResultDTO findListByName(@RequestBody BookDTO bookDTO) {

        try {
            return bookService.findListByName(bookDTO.getBookName());
        } catch (Exception e) {
            logger.error("系统异常" + e);
            return new ResultDTO(HttpCode.EXCEPTION.getCode(), "系统异常");
        }
    }

    /**
     * 根据Id查找数据
     * TODO:基础数据类型int会导致请求方式为form表单的形式
     * @param bookDTO 书籍实体
     */
    @RequestMapping( "/findById")
    public ResultDTO findById(@RequestBody BookDTO bookDTO) {
        try {
            return bookService.findById(bookDTO.getId());
        } catch (Exception e) {
            logger.error("系统异常" + e);
            return new ResultDTO(HttpCode.EXCEPTION.getCode(), "系统异常");
        }
    }

    /**
     * 新增
     *
     * @param bookDTO 书籍实体
     */
    @RequestMapping("/insert")
    public ResultDTO insert(@RequestBody BookDTO bookDTO) {
        try {
            return bookService.insert(bookDTO);
        } catch (Exception e) {
            logger.error("系统异常" + e);
            return new ResultDTO(HttpCode.EXCEPTION.getCode(), "系统异常");
        }
    }

    /**
     * 新增
     *
     * @param bookDTO 更新实体
     */
    @RequestMapping("/update")
    public ResultDTO update(@RequestBody BookDTO bookDTO) {
        try {
            return bookService.update(bookDTO);
        } catch (Exception e) {
            logger.error("系统异常" + e);
            return new ResultDTO(HttpCode.EXCEPTION.getCode(), "系统异常");
        }
    }

    /**
     * 根据Id删除数据
     *
     * @param bookDTO 书籍实体类
     */
    @RequestMapping("/delete")
    public ResultDTO delete(@RequestBody BookDTO bookDTO) {
        try {
            return bookService.delete(bookDTO.getId());
        } catch (Exception e) {
            logger.error("系统异常" + e);
            return new ResultDTO(HttpCode.EXCEPTION.getCode(), "系统异常");
        }
    }
}
