package one.domain;

import java.util.Calendar;
import java.util.List;

public interface HomeRepository {
	List<Home> search(Calendar availableOnDate);

}
