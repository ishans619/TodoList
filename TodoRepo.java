import com.Shukla.mytodolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

//Jpa repository uses Hibernate ORM internally
public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}