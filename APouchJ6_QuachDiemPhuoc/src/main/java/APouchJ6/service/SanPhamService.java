package APouchJ6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import APouchJ6.entity.SanPham;

public interface SanPhamService {

	<S extends SanPham> List<S> findAll(Example<S> example, Sort sort);

	<S extends SanPham> List<S> findAll(Example<S> example);

	SanPham getById(Integer id);

	void deleteAll();

	void deleteAll(Iterable<? extends SanPham> entities);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Integer> ids);

	void delete(SanPham entity);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	void deleteById(Integer id);

	long count();

	void deleteAllInBatch(Iterable<SanPham> entities);

	<S extends SanPham> boolean exists(Example<S> example);

	<S extends SanPham> long count(Example<S> example);

	<S extends SanPham> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends SanPham> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Integer id);

	<S extends SanPham> S saveAndFlush(S entity);

	void flush();

	<S extends SanPham> List<S> saveAll(Iterable<S> entities);

	SanPham findById(Integer id);
	
	List<SanPham> findAllById(Iterable<Integer> ids);

	List<SanPham> findAll(Sort sort);

	List<SanPham> findAll();

	Page<SanPham> findAll(Pageable pageable);

	<S extends SanPham> Optional<S> findOne(Example<S> example);

	<S extends SanPham> S save(S entity);

	List<SanPham> findByCateID(String cid);

	SanPham create(SanPham sanpham);

	SanPham update(SanPham sanpham);

	void delete(Integer id);

}
