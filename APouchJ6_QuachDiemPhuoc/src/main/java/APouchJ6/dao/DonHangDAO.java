package APouchJ6.dao;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import APouchJ6.entity.DonHang;

public interface DonHangDAO extends JpaRepository<DonHang, Long>{

	void save(Order order);

	
	@Query("SELECT o FROM DonHang o WHERE o.account.tenTK=?1")
	List<Object> findByUsername(String username);

}
