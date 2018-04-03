package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.domain.Page;
import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.BookRepository;
import com.rumofuture.nemo.repository.PageRepository;
import com.rumofuture.nemo.service.PageService;
import com.rumofuture.nemo.util.constant.NemoConst;
import com.rumofuture.nemo.util.generator.Generator;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
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

    @Autowired
    private BookRepository bookRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(Page page) {
        Book book = bookRepository.findOne(page.getBook().getId());
        page.setBook(book);
        page.setObjectId(Generator.getUUID());
        page.setStatus(1);
        page.setCreateAt(LocalDateTime.now().withNano(0));
        page.setUpdateAt(LocalDateTime.now().withNano(0));
        pageRepository.save(page);
        // 更新漫画册分页数目
        int newPageTotal = book.getPage() + 1;
        book.setPage(newPageTotal);
        bookRepository.update(book);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(Page page) {
        pageRepository.update(page);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        pageRepository.delete(id);
    }

    @Override
    public List<Page> queryListByBook(Integer bookId, Integer index) {
        PageModel model = new PageModel(index, NemoConst.PageModel.Limit.PAGE);
        return pageRepository.findListByBook(bookId, model);
    }
}
