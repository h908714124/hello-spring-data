package hello;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HotelTest {

  @Autowired
  private EntityManager entityManager;

  @Before
  public void setUp() {
    Hotel hotel = new Hotel();
    hotel.setName("Hilton");
    hotel.setId(1L);
    entityManager.persist(hotel);
  }

  @Test
  public void test() {
    Hotel hotel = entityManager.find(Hotel.class, 1L);
    assertEquals(hotel.getName(), "Hilton");
  }
}
