package hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {

  @Id
  private Long id;

  private String name;

  public Long getId() {
    return this.id;
  }

  public void setId(Long wert) {
    this.id = wert;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String wert) {
    this.name = wert;
  }
}
