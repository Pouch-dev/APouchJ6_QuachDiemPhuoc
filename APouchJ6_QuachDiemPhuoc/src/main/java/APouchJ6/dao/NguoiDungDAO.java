package APouchJ6.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import APouchJ6.entity.NguoiDung;

public interface NguoiDungDAO extends JpaRepository<NguoiDung, String>{
	
	@Query("SELECT DISTINCT o.taikhoan FROM ThamQuyen o WHERE o.vaiTro.id IN('ADMIN','STAF','GUEST','USER')")
	List<NguoiDung> getAdministrator();

}
