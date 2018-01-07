package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.Page;
import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.mapper.PageMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author WangZhenqi 2018/1/7
 */
public class PageRepository implements PageDao {

    @Autowired
    private PageMapper pageMapper;

    @Override
    public void save(Page page) {
        pageMapper.insert(page);
    }

    @Override
    public void update(Page page) {
        pageMapper.update(page);
    }

    @Override
    public void delete(Integer id) {
        pageMapper.delete(id);
    }

    @Override
    @Deprecated
    public Page findOne(Integer id) {
        return pageMapper.selectOne(id);
    }

    @Override
    @Deprecated
    public List<Page> findAll() {
        return null;
    }

    @Override
    @Deprecated
    public List<Page> findAll(PageModel pageModel) {
        return null;
    }

    @Override
    public List<Page> findAllByBook(Integer bookId, PageModel pageModel) {
        return null;
    }
}
