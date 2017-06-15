package japonics.newspring;

import japonics.newspring.models.Ticket;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Justyna on 14.06.2017.
 */
@ComponentScan(basePackages = {"japonics.newspring.TicketRepository"})
@EntityScan("japonics.newspring.TicketRepository")
@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {
    Optional<Ticket> findOne(int id);
    List<Ticket>findByAuthor(String author);
    List<Ticket>findByMessageLike(String prefix);
    @Query(value = "SELECT * FROM ticket WHERE author =?1 LIMIT 1" ,nativeQuery = true)
    Ticket getTicket(String ticket);
   // final String[] message ={""};

//    void save(Ticket ticket);
//
//    Ticket findOne(int id);
}