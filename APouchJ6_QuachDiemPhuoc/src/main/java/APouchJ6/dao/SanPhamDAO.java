package APouchJ6.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import APouchJ6.entity.SanPham;

public interface SanPhamDAO extends JpaRepository<SanPham, Integer>{
	
	@Query("SELECT o FROM SanPham o WHERE o.cate.maLoai=?1")
	List<SanPham> findByCateID(Integer cid);

}
