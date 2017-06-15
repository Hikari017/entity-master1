package japonics.newspring;

import japonics.newspring.models.Ticket;
import org.springframework.stereotype.Repository;

/**
 * Created by Justyna on 14.06.2017.
 */

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {
    void save(Ticket ticket);
}
