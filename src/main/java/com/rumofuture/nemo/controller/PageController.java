package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.domain.Page;
import com.rumofuture.nemo.model.entity.Response;
import com.rumofuture.nemo.util.constant.RespStatus;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 漫画分页数据 API
 *
 * @author 王振琦  2018/1/7
 */
@RestController
@RequestMapping(value = "page")
public class PageController {

    private static final Log log = LogFactory.getLog(UserController.class);

    @PostMapping(value = "save")
    public Response<Page> actionSave(@RequestBody Page page) {
        try {
            return new Response<>();
        } catch (Exception e) {
            log.error("PageController: actionSave", e);
            throw new NemoException(RespStatus.SAVE_FAILED);
        }
    }

    @PostMapping(value = "update")
    public Response<Page> actionUpdate(@RequestBody Page page) {
        try {
            return new Response<>();
        } catch (Exception e) {
            log.error("PageController: actionUpdate", e);
            throw new NemoException(RespStatus.UPDATE_FAILED);
        }
    }

    @PostMapping(value = "delete")
    public Response<Page> actionDelete(@RequestBody Page page) {
        try {
            return new Response<>();
        } catch (Exception e) {
            log.error("PageController: actionDelete", e);
            throw new NemoException(RespStatus.DELETE_FAILED);
        }
    }

    @GetMapping(value = "listByBook")
    public Response<List<Page>> actionQueryListByBook(@RequestParam("bookId") Integer bookId) {
        try {
            return new Response<>();
        } catch (Exception e) {
            log.error("PageController: actionQueryListByBook", e);
            throw new NemoException(RespStatus.QUERY_FAILED);
        }
    }
}