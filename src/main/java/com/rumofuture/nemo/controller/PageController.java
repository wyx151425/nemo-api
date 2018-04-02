package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.domain.Page;
import com.rumofuture.nemo.model.entity.Response;
import com.rumofuture.nemo.service.PageService;
import com.rumofuture.nemo.util.constant.RespStatus;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 漫画分页数据 API
 *
 * @author 王振琦  2018/1/7
 */
@RestController
public class PageController {

    private static final Log log = LogFactory.getLog(UserController.class);

    @Autowired
    private PageService pageService;

    @PostMapping(value = "pages")
    public Response<Page> actionSave(@RequestBody Page page) {
        try {
            pageService.save(page);
            return new Response<>(page);
        } catch (Exception e) {
            log.error("PageController: actionSave", e);
            throw new NemoException(RespStatus.SAVE_FAILED);
        }
    }

    @DeleteMapping(value = "pages")
    public Response<Page> actionDelete(@RequestBody Page page) {
        try {
            pageService.delete(page.getId());
            return new Response<>();
        } catch (Exception e) {
            log.error("PageController: actionDelete", e);
            throw new NemoException(RespStatus.DELETE_FAILED);
        }
    }

    @PutMapping(value = "pages")
    public Response<Page> actionUpdate(@RequestBody Page page) {
        try {
            pageService.update(page);
            return new Response<>();
        } catch (Exception e) {
            log.error("PageController: actionUpdate", e);
            throw new NemoException(RespStatus.UPDATE_FAILED);
        }
    }

    @GetMapping(value = "books/{id}/pages")
    public Response<List<Page>> actionQueryPageListByBook(
            @PathVariable("id") Integer id,
            @RequestParam("index") Integer index
    ) {
        try {
            List<Page> pageList = pageService.queryListByBook(id, index);
            return new Response<>(pageList);
        } catch (Exception e) {
            log.error("PageController: actionQueryListByBook", e);
            throw new NemoException(RespStatus.QUERY_FAILED);
        }
    }
}
