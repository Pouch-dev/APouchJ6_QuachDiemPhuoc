package APouchJ6.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import APouchJ6.entity.NguoiDung;
import APouchJ6.entity.ThamQuyen;

public interface ThamQuyenDAO extends JpaRepository<ThamQuyen, Integer>{

	
	@Query("SELECT DISTINCT o FROM ThamQuyen o WHERE o.taikhoan IN ?1")
	List<ThamQuyen> authoritiesOf(List<NguoiDung> accounts);

}
