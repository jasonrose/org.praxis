package org.praxis.blog.dao.impl;

import java.util.List;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.praxis.blog.Blog;
import org.praxis.blog.dao.AbstractDao;
import org.praxis.blog.dao.BlogDao;

@Component(metatype = true, immediate = true)
@Service
public class BlogDaoImpl extends AbstractDao<Blog> implements BlogDao {
  public BlogDaoImpl() {
    super();
    entityClass = Blog.class;
  }

  @Override
  public List<Blog> list() {
    final List<Blog> list = super.list();
    for( final Blog entity : list ) {
      entity.setTitle("Blog Title " + entity.getId());
    }
    return list;
  }
}