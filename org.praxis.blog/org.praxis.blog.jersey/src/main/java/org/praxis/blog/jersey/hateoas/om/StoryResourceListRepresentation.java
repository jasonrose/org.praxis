package org.praxis.blog.jersey.hateoas.om;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.apache.commons.beanutils.BeanUtils;
import org.praxis.blog.Blog;
import org.praxis.blog.Comment;
import org.praxis.blog.Story;
import org.praxis.blog.jersey.hateoas.Link;

@XmlRootElement(name = "story")
public class StoryResourceListRepresentation extends Story implements ResourceRepresentation {
  private List<Link> links = new ArrayList<Link>();

  public StoryResourceListRepresentation() {
    super();
  }

  public StoryResourceListRepresentation(final Story entity) {
    this();
    try {
      BeanUtils.copyProperties(this, entity);
    } catch( final Exception e ) {
      throw new IllegalArgumentException(e);
    }
  }

  @Override
  @XmlTransient
  public Blog getBlog() {
    return super.getBlog();
  }

  @Override
  @XmlTransient
  public Set<Comment> getComments() {
    return super.getComments();
  }

  @Override
  @XmlTransient
  public Long getId() {
    return super.getId();
  }

  @Override
  public List<Link> getLinks() {
    return links;
  }

  @Override
  public void setLinks(final List<Link> links) {
    this.links = links;
  }

}
