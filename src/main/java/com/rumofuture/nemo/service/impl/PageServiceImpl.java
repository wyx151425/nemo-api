package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.model.domain.Page;
import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.PageRepository;
import com.rumofuture.nemo.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 漫画分页业务逻辑接口实现类
 *
 * @author 王振琦  2018/1/7
 */
@Service(value = "pageService")
public class PageServiceImpl implements PageService {

    @Autowired
    private PageRepository pageRepository;

    @Override
    public Page save(Page page) {
        pageRepository.save(page);
        return page;
    }

    @Override
    public Page update(Page page) {
        pageRepository.update(page);
        return page;
    }

    @Override
    public void delete(Integer id) {
        pageRepository.delete(id);
    }

    @Override
    public List<Page> queryListByBook(Integer bookId, Integer index) {
        PageModel model = new PageModel();
        model.setIndex(index);
        model.setLimit(64);
        return pageRepository.findListByBook(bookId, model);
    }
}
