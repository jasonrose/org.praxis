package org.praxis.blog.jersey.jackson;

import java.util.ArrayList;
import java.util.List;

import org.praxis.blog.Entity;
import org.praxis.blog.jersey.hateoas.Link;

public class EntityRepresentationView<E extends Entity> implements ResourceRepresentation {

  private E entity;
  private List<Link> links = new ArrayList<Link>();

  public EntityRepresentationView() {
    super();
  }

  public EntityRepresentationView(final E entity) {
    this.setEntity(entity);
  }

  @Override
  public List<Link> getLinks() {
    return links;
  }

  @Override
  public void setLinks(final List<Link> links) {
    this.links = links;
  }

  public void setEntity(final E entity) {
    this.entity = entity;
  }

  public E getEntity() {
    return entity;
  }
}
